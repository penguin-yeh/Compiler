lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
MAIN_     : 'main';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
CONSTANT_ : 'const';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
LONG_TYPE : 'long';
WHILE_    : 'while';
INCLUDE_  : '#include';
HEADER_   : '<'(LETTER_DOT)*'>';
RETURN_   : 'return';
PRINTF_   : 'printf';
SCANF_    : 'scanf';
SCANF_INT : '%d';
SCANF_FLOAT: '%f';
FOR_      : 'for';
BREAK_    : 'break';
CONTINUE_ : 'continue';
//POINTER_  : ('*')+; 
SWITCH_   : 'switch';
CASE_     : 'case';
MEMSET_   : 'memset';
MALLOC_   : 'malloc';
FREE_     : 'free';
STRUCT_TYPE: 'struct'(' ')+(LETTER)(LETTER | DIGIT)*;
IF_       : 'if';
ELSE_     : 'else';
STRCPY_   : 'strcpy';
STRCMP_   : 'strcmp';
STRCAT_   : 'strcat';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

SAME_OP : '='; 
PL_OP  : '+';
MINUS_OP : '-';
MUL_OP   : '*';
DIV_OP   : '/';
MOD_OP : '%';
GT_OP : '>';
LT_OP : '<';
EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
PE_OP : '+=';
ME_OP : '-=';
MULE_OP : '*=';
DE_OP : '/=';
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
PARENTHESE : '(' | ')'; 
BRACKET : '{' | '}';
SEMICOLON : ';' ;
COMMA   : ',';
DOT     : '.';
TWO_DOT : '"';
STRING_ : '"'(.)*'"';
ADDRESS_ : '&'(LETTER)(LETTER | DIGIT)*;
AND_ : '&';
AND_LOG: '&&';
OR_  : '|';
OR_LOG : '||';
NEW_LINE: '\n';
WS  : (' '|'\r'|'\t')+;
ARRAY : '[' | ']';


DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;


/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (.)* '*/';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';
fragment LETTER_DOT : 'a'..'z' | 'A'.. 'Z' | '.';


//struct、pointer、address
