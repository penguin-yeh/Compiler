grammar myCompiler;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = true;

    // Type information.
    public enum Type{
       ERR, BOOL, INT, FLOAT, CHAR, CONST_INT;
    }

    // This structure is used to record the information of a variable or a constant.
    class tVar {
	   int   varIndex; // temporary variable's index. Ex: t1, t2, ..., etc.
	   int   iValue;   // value of constant integer. Ex: 123.
	   float fValue;   // value of constant floating point. Ex: 2.314.
	};

    class Info {
       Type theType;  // type information.
       tVar theVar;
	   
	   Info() {
          theType = Type.ERR;
		  theVar = new tVar();
	   }
    };

	
    // ============================================
    // Create a symbol table.
	// ArrayList is easy to extend to add more info. into symbol table.
	//
	// The structure of symbol table:
	// <variable ID, [Type, [varIndex or iValue, or fValue]]>
	//    - type: the variable type   (please check "enum Type")
	//    - varIndex: the variable's index, ex: t1, t2, ...
	//    - iValue: value of integer constant.
	//    - fValue: value of floating-point constant.
    // ============================================

    HashMap<String, Info> symtab = new HashMap<String, Info>();

    // labelCount is used to represent temporary label.
    // The first index is 0.
    int labelCount = 0;
	
    // varCount is used to represent temporary variables.
    // The first index is 0.
    int varCount = 0;

    int strCount = 0;

    int forCount = 0;

    int whileCount = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();


    /*
     * Output prologue.
     */
    void prologue()
    {
       TextCode.add("; === prologue ====");
       TextCode.add("declare dso_local i32 @printf(i8*, ...)\n");
       TextCode.add("declare dso_local i32 @scanf(i8*, ...)\n");
	   TextCode.add("define dso_local i32 @main()");
	   TextCode.add("{");
    }
    
	
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       TextCode.add("\n; === epilogue ===");
	   TextCode.add("ret i32 0");
       TextCode.add("}");
    }
    
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getTextCode()
    {
       return TextCode;
    }

    List<String> global_str = new ArrayList<String>();
}

program: (VOID|INT) MAIN '(' ')'
        {
           /* Output function prologue */
           prologue();
        }

        '{' 
           declarations
           statements
           
        '}'
        {
        /* output function epilogue */	  
        epilogue();
        for (String i : global_str) 
        {
            TextCode.add(i);
        }
        }
        ;


declarations: type Identifier ';' declarations
        {

           if (symtab.containsKey($Identifier.text)) {
              // variable re-declared.
              System.out.println("Type Error: " + 
                                  $Identifier.getLine() + 
                                 ": Redeclared identifier.");
              System.exit(0);
           }
                 
           /* Add ID and its info into the symbol table. */
	       Info the_entry = new Info();
		   the_entry.theType = $type.attr_type;
		   the_entry.theVar.varIndex = varCount;
		   varCount ++;
		   symtab.put($Identifier.text, the_entry);

           // issue the instruction.
		   // Ex: \%a = alloca i32, align 4
           if ($type.attr_type == Type.INT) { 
              TextCode.add("\%t" + the_entry.theVar.varIndex + " = alloca i32, align 4");
           }
        }
        | 
        ;


type
returns [Type attr_type]
    : INT { $attr_type=Type.INT; }
    | CHAR { $attr_type=Type.CHAR; }
    | FLOAT { $attr_type=Type.FLOAT; }
	;


statements:statement statements
          |
          ;


statement: assign_stmt ';'
         | if_stmt
         | func_no_return_stmt ';'
         | for_stmt {TextCode.add("L_END" + forCount + ":"); forCount++;}
         | while_stmt {TextCode.add("W_END" + whileCount + ":"); whileCount++;}
         ;

while_stmt: WHILE '('
                    {
                        TextCode.add("br label \%L" + labelCount);
                        TextCode.add("L" + labelCount + ":");
                        labelCount ++ ;
                    } 
                    arith_expression
                    {
                        int curVar = varCount - 1;
                        int curBranch ;
                        TextCode.add("br i1 \%t" + curVar + ", label \%L" + labelCount + ", label \%W_END" + whileCount);
                        TextCode.add("L" + labelCount + ":");
                        labelCount ++ ;

                    }
                   ')'
                    block_stmt
                    {
                        curBranch = labelCount - 2;
                        TextCode.add("br label \%L" + curBranch);
                    }
            ;

for_stmt: FOR '(' assign_stmt ';'
                  {
                    TextCode.add("br label \%L" + labelCount);
                    TextCode.add("L" + labelCount + ":");
                    labelCount ++ ;
                  }
                  cond_expression ';'
                  {
                    int curBranch = labelCount + 1;
                    int curVar = varCount - 1;
                    TextCode.add("br i1 \%t" + curVar + ", label \%L" + curBranch + ", label \%L_END" + forCount);
                    TextCode.add("L" + labelCount + ":");
                    labelCount++;
                  }
                  assign_stmt
                  {
                    curBranch = labelCount - 2;
                    TextCode.add("br label \%L" + curBranch);
                  }
              ')'
                {
                    TextCode.add("L" + labelCount + ":");
                    labelCount++;
                }
                  block_stmt
                {
                    curBranch = labelCount-2;
                    TextCode.add("br label \%L" + curBranch);
                }
        ;
		 
		 
if_stmt
        : if_then_stmt (else_if_stmt)* else_stmt
        {
            TextCode.add("END" + ":");
        }
        ;

	   
if_then_stmt
            : IF '(' a=cond_expression
                    {
                        int labelNext = labelCount + 1;
                        TextCode.add("br i1 \%t" + $a.theInfo.theVar.varIndex + ", label \%L" + labelCount + ", label \%L" + labelNext);
                        labelCount = labelCount + 2;
                    }                    
                 ')' 
             {
                int curLabel = labelCount - 2;
                TextCode.add("L" + curLabel + ":");
             }
             block_stmt
             {
                curLabel = labelCount - 1;
                TextCode.add("br label \%END");
                TextCode.add("L" + curLabel + ":");
             }
            ;

else_if_stmt
            : ELSE IF '(' a=cond_expression
                        {
                            int labelNext = labelCount + 1;
                            TextCode.add("br i1 \%t" + $a.theInfo.theVar.varIndex + ", label \%L" + labelCount + ", label \%L" + labelNext);
                            labelCount = labelCount + 2;
                        }
                      ')'
              {
                 int curLabel = labelCount - 2;
                 TextCode.add("L" + curLabel + ":");
              }
              block_stmt
              {
                curLabel = labelCount - 1;
                TextCode.add("br label \%END");
                TextCode.add("L" + curLabel + ":");
              }
            ;

else_stmt
            : ELSE block_stmt
              {
                TextCode.add("br label \%END");
              }
            |
            ;

				  
block_stmt: '{' statements '}'
	  ;


assign_stmt: Identifier '=' arith_expression
             {
                Info theRHS = $arith_expression.theInfo;
				Info theLHS = symtab.get($Identifier.text); 
		   
                if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.BOOL)) 
                {		   
                    TextCode.add("\%t" + varCount + " = zext i1 \%t" + theRHS.theVar.varIndex + " to i32");
					   
                    // Update arith_expression's theInfo.
                    theRHS.theVar.varIndex = varCount;
                    varCount ++;

                   // issue store insruction.
                   // Ex: store i32 \%tx, i32* \%ty
                   TextCode.add("store i32 \%t" + theRHS.theVar.varIndex + ", i32* \%t" + theLHS.theVar.varIndex);
				} 
                else if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.CONST_INT)) 
                {
                   // issue store insruction.
                   // Ex: store i32 value, i32* \%ty
                   TextCode.add("store i32 " + theRHS.theVar.iValue + ", i32* \%t" + theLHS.theVar.varIndex);				
				}
                else if ((theLHS.theType == Type.INT) && (theRHS.theType == Type.INT)) 
                {		   

                   // issue store insruction.
                   // Ex: store i32 \%tx, i32* \%ty
                   TextCode.add("store i32 \%t" + theRHS.theVar.varIndex + ", i32* \%t" + theLHS.theVar.varIndex);
				} 
			 }
             ;

		   
func_no_return_stmt: Identifier '(' a=argument
                                    {
                                        if($Identifier.text.toString().equals("printf"))
                                        {
                                            String tmp = $a.str;
                                            tmp = tmp.replaceAll("\\\\0A", "\\\\");
                                            int length = tmp.length() + 1;
                                            String tmp_str = "\%t" + varCount + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + length + " x i8], [" + length + " x i8]* @.str." + strCount +" , i64 0, i64 0),";
                                            for(Integer i: $a.index)
                                            {   
                                                tmp_str = tmp_str + "i32 \%t" + i + ", ";
                                            }
                                            tmp_str = tmp_str.substring(0, tmp_str.length()-2);
                                            tmp_str = tmp_str + ")";
                                            if($a.index.size()==0)
                                                tmp_str = tmp_str + ")";
                                            TextCode.add(tmp_str);
                                            global_str.add("@.str." + strCount + " = private unnamed_addr constant [" + length + " x i8] c\"" + $a.str + "\\00\", align 1");
                                            strCount = strCount + 1;        
                                            varCount++;
                                        }
                                        else if($Identifier.text.toString().equals("scanf"))
                                        {
                                            String tmp = $a.str;
                                            tmp = tmp.replaceAll("0A", "");
                                            int length = tmp.length() + 1;
                                            String tmp_str = "\%t" + varCount + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([" + length + " x i8], [" + length + " x i8]* @.str." + strCount +" , i64 0, i64 0),";
                                            for(Integer i: $a.index)
                                            {   
                                                tmp_str = tmp_str + "i32* \%t" + i + ", ";
                                            }
                                            tmp_str = tmp_str.substring(0, tmp_str.length()-2);
                                            tmp_str = tmp_str + ")";
                                            TextCode.add(tmp_str);
                                            global_str.add("@.str." + strCount + " = private unnamed_addr constant [" + length + " x i8] c\"" + $a.str + "\\00\", align 1");
                                            strCount = strCount + 1;        
                                            varCount++;
                                        }
                                    }
                                ')'
                   ;


argument returns [String str, List<Integer> index]
@init{$index = new ArrayList<Integer>();}
    : a=arg
     {
        $str = $a.str;
     }
     (',' b=arg
        {
            $index.add($b.index);
        }
     )*
        ;

arg returns [String str, String ori, int index]
    : a=arith_expression
    {
        $index = $a.theInfo.theVar.varIndex;
    }
   | STRING_LITERAL
   {
      $str = $STRING_LITERAL.text;
      $str = $str.replaceAll("\\\\n", "\\\\0A");
      $str = $str.substring(1, $str.length()-1);
   }
   ;
		   
cond_expression returns [Info theInfo]
@init{theInfo = new Info();}
               : a=arith_expression
                {
                    $theInfo = $a.theInfo;
                }
               ;
			   
arith_expression returns [Info theInfo]
@init {theInfo = new Info();}
                : a=modExpr { $theInfo=$a.theInfo; }
                 ( '+' b=modExpr
                    {
                       // We need to do type checking first.
                       // ...
                       // code generation.					   
                       if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) 
                       {
                           //System.out.println("penguin");
                           TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					   
					       // Update arith_expression's theInfo.
					       $theInfo.theType = Type.INT;
					       $theInfo.theVar.varIndex = varCount;
					       varCount ++;
                       } 
                       else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) 
                       {
                           TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
					   
					       // Update arith_expression's theInfo.
					       $theInfo.theType = Type.INT;
					       $theInfo.theVar.varIndex = varCount;
					       varCount ++;
                       }
                       else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) 
                       {
                           int tmp = $a.theInfo.theVar.iValue + $b.theInfo.theVar.iValue;
                           $theInfo.theType = Type.CONST_INT;
                           $theInfo.theVar.iValue = tmp;
                       }
                    }
                 | '-' c=modExpr
                    {
                        if (($a.theInfo.theType == Type.INT) && ($c.theInfo.theType == Type.INT)) 
                       {
                           //System.out.println("penguin");
                           TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);
					   
					       // Update arith_expression's theInfo.
					       $theInfo.theType = Type.INT;
					       $theInfo.theVar.varIndex = varCount;
					       varCount ++;
                       } 
                       else if (($a.theInfo.theType == Type.INT) && ($c.theInfo.theType == Type.CONST_INT)) 
                       {
                           TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $c.theInfo.theVar.iValue);
					   
					       // Update arith_expression's theInfo.
					       $theInfo.theType = Type.INT;
					       $theInfo.theVar.varIndex = varCount;
					       varCount ++;
                       }
                       else if (($a.theInfo.theType == Type.CONST_INT) && ($c.theInfo.theType == Type.CONST_INT)) 
                       {
                           int tmp = $a.theInfo.theVar.iValue - $c.theInfo.theVar.iValue;
                           $theInfo.theType = Type.CONST_INT;
                           $theInfo.theVar.iValue = tmp;
                       }
                    }
                 )*
                 ;

modExpr returns [Info theInfo]
@init {theInfo = new Info();}
    : a=multExpr { $theInfo=$a.theInfo; }
    (
        '%' b=multExpr
        {
                // We need to do type checking first.
                // ...
                // code generation.					   
                if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) 
                {
                    //System.out.println("penguin");
                    TextCode.add("\%t" + varCount + " = srem i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                
                    // Update arith_expression's theInfo.
                    $theInfo.theType = Type.INT;
                    $theInfo.theVar.varIndex = varCount;
                    varCount ++;
                } 
                else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) 
                {
                    TextCode.add("\%t" + varCount + " = srem i32 \%t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                
                    // Update arith_expression's theInfo.
                    $theInfo.theType = Type.INT;
                    $theInfo.theVar.varIndex = varCount;
                    varCount ++;
                }
                else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) 
                {
                    int tmp = $a.theInfo.theVar.iValue / $b.theInfo.theVar.iValue;
                    tmp = tmp * $b.theInfo.theVar.iValue;
                    tmp = $a.theInfo.theVar.iValue - tmp;
                    $theInfo.theType = Type.CONST_INT;
                    $theInfo.theVar.iValue = tmp;
                }
            }
    )*
    ;

multExpr returns [Info theInfo]
@init {theInfo = new Info();}
          : a=compExpr { $theInfo=$a.theInfo; }
          ( '*' b=compExpr
            {
                // We need to do type checking first.
                // ...
                // code generation.					   
                if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.INT)) 
                {
                    //System.out.println("penguin");
                    TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
                
                    // Update arith_expression's theInfo.
                    $theInfo.theType = Type.INT;
                    $theInfo.theVar.varIndex = varCount;
                    varCount ++;
                } 
                else if (($a.theInfo.theType == Type.INT) && ($b.theInfo.theType == Type.CONST_INT)) 
                {
                    TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
                
                    // Update arith_expression's theInfo.
                    $theInfo.theType = Type.INT;
                    $theInfo.theVar.varIndex = varCount;
                    varCount ++;
                }
                else if (($a.theInfo.theType == Type.CONST_INT) && ($b.theInfo.theType == Type.CONST_INT)) 
                {
                    int tmp = $a.theInfo.theVar.iValue * $b.theInfo.theVar.iValue;
                    $theInfo.theType = Type.CONST_INT;
                    $theInfo.theVar.iValue = tmp;
                }
            }
          | '/' c=compExpr
            {
                {
                       // We need to do type checking first.
                       // ...
                       // code generation.					   
                       if (($a.theInfo.theType == Type.INT) && ($c.theInfo.theType == Type.INT)) 
                       {
                           //System.out.println("penguin");
                           TextCode.add("\%t" + varCount + " = sdiv i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);
					   
					       // Update arith_expression's theInfo.
					       $theInfo.theType = Type.INT;
					       $theInfo.theVar.varIndex = varCount;
					       varCount ++;
                       } 
                       else if (($a.theInfo.theType == Type.INT) && ($c.theInfo.theType == Type.CONST_INT)) 
                       {
                           TextCode.add("\%t" + varCount + " = sdiv i32 \%t" + $theInfo.theVar.varIndex + ", " + $c.theInfo.theVar.iValue);
					   
					       // Update arith_expression's theInfo.
					       $theInfo.theType = Type.INT;
					       $theInfo.theVar.varIndex = varCount;
					       varCount ++;
                       }
                       else if (($a.theInfo.theType == Type.CONST_INT) && ($c.theInfo.theType == Type.CONST_INT)) 
                       {
                           int tmp = $a.theInfo.theVar.iValue / $c.theInfo.theVar.iValue;
                           $theInfo.theType = Type.CONST_INT;
                           $theInfo.theVar.iValue = tmp;
                       }
                }
            }
	  )*
	  ;



compExpr returns [Info theInfo]
@inti{theInfo = new Info();}
    : a=signExpr {$theInfo=$a.theInfo;}
    ('>' b=signExpr
     {
        if($a.theInfo.theType==Type.CONST_INT && $b.theInfo.theType==Type.CONST_INT)
        {
            int tmp_1 = $a.theInfo.theVar.iValue;
            int tmp_2 = $b.theInfo.theVar.iValue;
            //System.out.println(tmp_1+" "+tmp_2);
            if(tmp_1 > tmp_2)
                $theInfo.theVar.iValue = 1;
            else
                $theInfo.theVar.iValue = 0;
            $theInfo.theType = Type.CONST_INT;
        }
        else if($a.theInfo.theType==Type.INT && $b.theInfo.theType==Type.CONST_INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sgt i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.CONST_INT && $b.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sgt i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.INT && $b.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sgt i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
     }
     |'<'c=signExpr
      {
        if($a.theInfo.theType==Type.CONST_INT && $c.theInfo.theType==Type.CONST_INT)
        {   
            int tmp_1 = $a.theInfo.theVar.iValue;
            int tmp_2 = $c.theInfo.theVar.iValue;
            //System.out.println(tmp_1+" "+tmp_2);
            if(tmp_1 < tmp_2)
                $theInfo.theVar.iValue = 1;
            else
                $theInfo.theVar.iValue = 0;
            $theInfo.theType = Type.CONST_INT;
        }
        else if($a.theInfo.theType==Type.INT && $c.theInfo.theType==Type.CONST_INT)
        {
            TextCode.add("\%t" + varCount + " = icmp slt i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $c.theInfo.theVar.iValue);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.CONST_INT && $c.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp slt i32 " + $a.theInfo.theVar.iValue + ", \%t" + $c.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.INT && $c.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp slt i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
      }
      |'>='d=signExpr
      {
        if($a.theInfo.theType==Type.CONST_INT && $d.theInfo.theType==Type.CONST_INT)
        {    
            int tmp_1 = $a.theInfo.theVar.iValue;
            int tmp_2 = $d.theInfo.theVar.iValue;
            //System.out.println(tmp_1+" "+tmp_2);
            if(tmp_1 >= tmp_2)
                $theInfo.theVar.iValue = 1;
            else
                $theInfo.theVar.iValue = 0;
            $theInfo.theType = Type.CONST_INT;
        }
        else if($a.theInfo.theType==Type.INT && $d.theInfo.theType==Type.CONST_INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sge i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $d.theInfo.theVar.iValue);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.CONST_INT && $d.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sge i32 " + $a.theInfo.theVar.iValue + ", \%t" + $d.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.INT && $d.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sge i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $d.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
      }
      |'<='e=signExpr
      {
        if($a.theInfo.theType==Type.CONST_INT && $e.theInfo.theType==Type.CONST_INT)
        {
            int tmp_1 = $a.theInfo.theVar.iValue;
            int tmp_2 = $e.theInfo.theVar.iValue;
            //System.out.println(tmp_1+" "+tmp_2);
            if(tmp_1 <= tmp_2)
                $theInfo.theVar.iValue = 1;
            else
                $theInfo.theVar.iValue = 0;
            $theInfo.theType = Type.CONST_INT;
        }
        else if($a.theInfo.theType==Type.INT && $e.theInfo.theType==Type.CONST_INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sle i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $e.theInfo.theVar.iValue);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.CONST_INT && $e.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sle i32 " + $a.theInfo.theVar.iValue + ", \%t" + $e.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.INT && $e.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp sle i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $e.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
      }
      |'=='f=signExpr
      {
        if($a.theInfo.theType==Type.CONST_INT && $f.theInfo.theType==Type.CONST_INT)
        {    
            int tmp_1 = $a.theInfo.theVar.iValue;
            int tmp_2 = $f.theInfo.theVar.iValue;
            //System.out.println(tmp_1+" "+tmp_2);
            if(tmp_1 == tmp_2)
                $theInfo.theVar.iValue = 1;
            else
                $theInfo.theVar.iValue = 0;
            $theInfo.theType = Type.CONST_INT;
        }
        else if($a.theInfo.theType==Type.INT && $f.theInfo.theType==Type.CONST_INT)
        {
            TextCode.add("\%t" + varCount + " = icmp eq i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $f.theInfo.theVar.iValue);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.CONST_INT && $f.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp eq i32 " + $a.theInfo.theVar.iValue + ", \%t" + $f.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.INT && $f.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp eq i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $f.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
      }
      |'!='g=signExpr
      {
        if($a.theInfo.theType==Type.CONST_INT && $g.theInfo.theType==Type.CONST_INT)
        {
            int tmp_1 = $a.theInfo.theVar.iValue;
            int tmp_2 = $g.theInfo.theVar.iValue;
            //System.out.println(tmp_1+" "+tmp_2);
            if(tmp_1 != tmp_2)
                $theInfo.theVar.iValue = 1;
            else
                $theInfo.theVar.iValue = 0;
            $theInfo.theType = Type.CONST_INT;
        }
        else if($a.theInfo.theType==Type.INT && $g.theInfo.theType==Type.CONST_INT)
        {
            TextCode.add("\%t" + varCount + " = icmp ne i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $g.theInfo.theVar.iValue);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.CONST_INT && $g.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp ne i32 " + $a.theInfo.theVar.iValue + ", \%t" + $g.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
        else if($a.theInfo.theType==Type.INT && $g.theInfo.theType==Type.INT)
        {
            TextCode.add("\%t" + varCount + " = icmp ne i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $g.theInfo.theVar.varIndex);
					   
            // Update arith_expression's theInfo.
            $theInfo.theType = Type.BOOL;
            $theInfo.theVar.varIndex = varCount;
            varCount ++;
        }
      }
    )*
	; 


signExpr returns [Info theInfo]
@init {theInfo = new Info();}
        : a=primaryExpr { $theInfo=$a.theInfo; } 
        | '-' b=primaryExpr
        {
            $theInfo=$b.theInfo;
            $theInfo.theVar.iValue = $theInfo.theVar.iValue*(-1);
        }
	;

primaryExpr returns [Info theInfo]
@init {theInfo = new Info();}
           : Integer_constant
	     {
            $theInfo.theType = Type.CONST_INT;
			$theInfo.theVar.iValue = Integer.parseInt($Integer_constant.text);
         }
           | Floating_point_constant
           | Identifier
              {
                // get type information from symtab.
                Type the_type = symtab.get($Identifier.text).theType;
				$theInfo.theType = the_type;

                // get variable index from symtab.
                int vIndex = symtab.get($Identifier.text).theVar.varIndex;
				
                switch (the_type) {
                case INT: 
                         // get a new temporary variable and
						 // load the variable into the temporary variable.
                         
						 // Ex: \%tx = load i32, i32* \%ty.
						 TextCode.add("\%t" + varCount + " = load i32, i32* \%t" + vIndex);
				         
						 // Now, Identifier's value is at the temporary variable \%t[varCount].
						 // Therefore, update it.
						 $theInfo.theVar.varIndex = varCount;
						 varCount ++;
                         break;
                case FLOAT:
                         break;
                case CHAR:
                         break;
			
                }
              }
	   | '&' Identifier
            {
                int idx = symtab.get($Identifier.text).theVar.varIndex;
                $theInfo.theVar.varIndex = idx;
            }
	   | '(' a=arith_expression
            {
                $theInfo = $a.theInfo;
            }
         ')'
        ;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | ;

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
