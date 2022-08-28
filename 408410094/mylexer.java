// $ANTLR 3.5.2 mylexer.g 2022-03-22 14:55:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADDRESS_=4;
	public static final int AND_=5;
	public static final int AND_LOG=6;
	public static final int ARRAY=7;
	public static final int BRACKET=8;
	public static final int BREAK_=9;
	public static final int CASE_=10;
	public static final int CHAR_TYPE=11;
	public static final int COMMA=12;
	public static final int COMMENT1=13;
	public static final int COMMENT2=14;
	public static final int CONSTANT_=15;
	public static final int CONTINUE_=16;
	public static final int DEC_NUM=17;
	public static final int DE_OP=18;
	public static final int DIGIT=19;
	public static final int DIV_OP=20;
	public static final int DOT=21;
	public static final int DOUBLE_TYPE=22;
	public static final int ELSE_=23;
	public static final int EQ_OP=24;
	public static final int FLOAT_NUM=25;
	public static final int FLOAT_NUM1=26;
	public static final int FLOAT_NUM2=27;
	public static final int FLOAT_NUM3=28;
	public static final int FLOAT_TYPE=29;
	public static final int FOR_=30;
	public static final int FREE_=31;
	public static final int GE_OP=32;
	public static final int GT_OP=33;
	public static final int HEADER_=34;
	public static final int ID=35;
	public static final int IF_=36;
	public static final int INCLUDE_=37;
	public static final int INT_TYPE=38;
	public static final int LETTER=39;
	public static final int LETTER_DOT=40;
	public static final int LE_OP=41;
	public static final int LONG_TYPE=42;
	public static final int LSHIFT_OP=43;
	public static final int LT_OP=44;
	public static final int MAIN_=45;
	public static final int MALLOC_=46;
	public static final int MEMSET_=47;
	public static final int ME_OP=48;
	public static final int MINUS_OP=49;
	public static final int MM_OP=50;
	public static final int MOD_OP=51;
	public static final int MULE_OP=52;
	public static final int MUL_OP=53;
	public static final int NEW_LINE=54;
	public static final int NE_OP=55;
	public static final int OR_=56;
	public static final int OR_LOG=57;
	public static final int PARENTHESE=58;
	public static final int PE_OP=59;
	public static final int PL_OP=60;
	public static final int PP_OP=61;
	public static final int PRINTF_=62;
	public static final int RETURN_=63;
	public static final int RSHIFT_OP=64;
	public static final int SAME_OP=65;
	public static final int SCANF_=66;
	public static final int SCANF_FLOAT=67;
	public static final int SCANF_INT=68;
	public static final int SEMICOLON=69;
	public static final int STRCAT_=70;
	public static final int STRCMP_=71;
	public static final int STRCPY_=72;
	public static final int STRING_=73;
	public static final int STRUCT_TYPE=74;
	public static final int SWITCH_=75;
	public static final int TWO_DOT=76;
	public static final int VOID_TYPE=77;
	public static final int WHILE_=78;
	public static final int WS=79;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:10:11: ( 'int' )
			// mylexer.g:10:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "MAIN_"
	public final void mMAIN_() throws RecognitionException {
		try {
			int _type = MAIN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:11:11: ( 'main' )
			// mylexer.g:11:13: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN_"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:11: ( 'char' )
			// mylexer.g:12:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:11: ( 'void' )
			// mylexer.g:13:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "CONSTANT_"
	public final void mCONSTANT_() throws RecognitionException {
		try {
			int _type = CONSTANT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:11: ( 'const' )
			// mylexer.g:14:13: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONSTANT_"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:11: ( 'float' )
			// mylexer.g:15:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:12: ( 'double' )
			// mylexer.g:16:14: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:11: ( 'long' )
			// mylexer.g:17:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:11: ( 'while' )
			// mylexer.g:18:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "INCLUDE_"
	public final void mINCLUDE_() throws RecognitionException {
		try {
			int _type = INCLUDE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:11: ( '#include' )
			// mylexer.g:19:13: '#include'
			{
			match("#include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_"

	// $ANTLR start "HEADER_"
	public final void mHEADER_() throws RecognitionException {
		try {
			int _type = HEADER_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:11: ( '<' ( LETTER_DOT )* '>' )
			// mylexer.g:20:13: '<' ( LETTER_DOT )* '>'
			{
			match('<'); 
			// mylexer.g:20:16: ( LETTER_DOT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='.'||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEADER_"

	// $ANTLR start "RETURN_"
	public final void mRETURN_() throws RecognitionException {
		try {
			int _type = RETURN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:11: ( 'return' )
			// mylexer.g:21:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_"

	// $ANTLR start "PRINTF_"
	public final void mPRINTF_() throws RecognitionException {
		try {
			int _type = PRINTF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:11: ( 'printf' )
			// mylexer.g:22:13: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF_"

	// $ANTLR start "SCANF_"
	public final void mSCANF_() throws RecognitionException {
		try {
			int _type = SCANF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:11: ( 'scanf' )
			// mylexer.g:23:13: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF_"

	// $ANTLR start "SCANF_INT"
	public final void mSCANF_INT() throws RecognitionException {
		try {
			int _type = SCANF_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:11: ( '%d' )
			// mylexer.g:24:13: '%d'
			{
			match("%d"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF_INT"

	// $ANTLR start "SCANF_FLOAT"
	public final void mSCANF_FLOAT() throws RecognitionException {
		try {
			int _type = SCANF_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:12: ( '%f' )
			// mylexer.g:25:14: '%f'
			{
			match("%f"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF_FLOAT"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:11: ( 'for' )
			// mylexer.g:26:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "BREAK_"
	public final void mBREAK_() throws RecognitionException {
		try {
			int _type = BREAK_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:11: ( 'break' )
			// mylexer.g:27:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_"

	// $ANTLR start "CONTINUE_"
	public final void mCONTINUE_() throws RecognitionException {
		try {
			int _type = CONTINUE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:11: ( 'continue' )
			// mylexer.g:28:13: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_"

	// $ANTLR start "SWITCH_"
	public final void mSWITCH_() throws RecognitionException {
		try {
			int _type = SWITCH_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:11: ( 'switch' )
			// mylexer.g:30:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_"

	// $ANTLR start "CASE_"
	public final void mCASE_() throws RecognitionException {
		try {
			int _type = CASE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:11: ( 'case' )
			// mylexer.g:31:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_"

	// $ANTLR start "MEMSET_"
	public final void mMEMSET_() throws RecognitionException {
		try {
			int _type = MEMSET_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:11: ( 'memset' )
			// mylexer.g:32:13: 'memset'
			{
			match("memset"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEMSET_"

	// $ANTLR start "MALLOC_"
	public final void mMALLOC_() throws RecognitionException {
		try {
			int _type = MALLOC_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:33:11: ( 'malloc' )
			// mylexer.g:33:13: 'malloc'
			{
			match("malloc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MALLOC_"

	// $ANTLR start "FREE_"
	public final void mFREE_() throws RecognitionException {
		try {
			int _type = FREE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:34:11: ( 'free' )
			// mylexer.g:34:13: 'free'
			{
			match("free"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE_"

	// $ANTLR start "STRUCT_TYPE"
	public final void mSTRUCT_TYPE() throws RecognitionException {
		try {
			int _type = STRUCT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:12: ( 'struct' ( ' ' )+ ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:35:14: 'struct' ( ' ' )+ ( LETTER ) ( LETTER | DIGIT )*
			{
			match("struct"); 

			// mylexer.g:35:22: ( ' ' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// mylexer.g:35:23: ' '
					{
					match(' '); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:35:36: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT_TYPE"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:11: ( 'if' )
			// mylexer.g:36:13: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:11: ( 'else' )
			// mylexer.g:37:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_"

	// $ANTLR start "STRCPY_"
	public final void mSTRCPY_() throws RecognitionException {
		try {
			int _type = STRCPY_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:11: ( 'strcpy' )
			// mylexer.g:38:13: 'strcpy'
			{
			match("strcpy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRCPY_"

	// $ANTLR start "STRCMP_"
	public final void mSTRCMP_() throws RecognitionException {
		try {
			int _type = STRCMP_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:11: ( 'strcmp' )
			// mylexer.g:39:13: 'strcmp'
			{
			match("strcmp"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRCMP_"

	// $ANTLR start "STRCAT_"
	public final void mSTRCAT_() throws RecognitionException {
		try {
			int _type = STRCAT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:11: ( 'strcat' )
			// mylexer.g:40:13: 'strcat'
			{
			match("strcat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRCAT_"

	// $ANTLR start "SAME_OP"
	public final void mSAME_OP() throws RecognitionException {
		try {
			int _type = SAME_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:9: ( '=' )
			// mylexer.g:46:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SAME_OP"

	// $ANTLR start "PL_OP"
	public final void mPL_OP() throws RecognitionException {
		try {
			int _type = PL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:8: ( '+' )
			// mylexer.g:47:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PL_OP"

	// $ANTLR start "MINUS_OP"
	public final void mMINUS_OP() throws RecognitionException {
		try {
			int _type = MINUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:10: ( '-' )
			// mylexer.g:48:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:10: ( '*' )
			// mylexer.g:49:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:10: ( '/' )
			// mylexer.g:50:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:8: ( '%' )
			// mylexer.g:51:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "GT_OP"
	public final void mGT_OP() throws RecognitionException {
		try {
			int _type = GT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:7: ( '>' )
			// mylexer.g:52:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT_OP"

	// $ANTLR start "LT_OP"
	public final void mLT_OP() throws RecognitionException {
		try {
			int _type = LT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:7: ( '<' )
			// mylexer.g:53:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_OP"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:7: ( '==' )
			// mylexer.g:54:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:7: ( '<=' )
			// mylexer.g:55:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:7: ( '>=' )
			// mylexer.g:56:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:7: ( '!=' )
			// mylexer.g:57:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:7: ( '++' )
			// mylexer.g:58:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:7: ( '--' )
			// mylexer.g:59:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "PE_OP"
	public final void mPE_OP() throws RecognitionException {
		try {
			int _type = PE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:7: ( '+=' )
			// mylexer.g:60:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PE_OP"

	// $ANTLR start "ME_OP"
	public final void mME_OP() throws RecognitionException {
		try {
			int _type = ME_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:7: ( '-=' )
			// mylexer.g:61:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ME_OP"

	// $ANTLR start "MULE_OP"
	public final void mMULE_OP() throws RecognitionException {
		try {
			int _type = MULE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:9: ( '*=' )
			// mylexer.g:62:11: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULE_OP"

	// $ANTLR start "DE_OP"
	public final void mDE_OP() throws RecognitionException {
		try {
			int _type = DE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:7: ( '/=' )
			// mylexer.g:63:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DE_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:11: ( '<<' )
			// mylexer.g:64:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:11: ( '>>' )
			// mylexer.g:65:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "PARENTHESE"
	public final void mPARENTHESE() throws RecognitionException {
		try {
			int _type = PARENTHESE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:12: ( '(' | ')' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHESE"

	// $ANTLR start "BRACKET"
	public final void mBRACKET() throws RecognitionException {
		try {
			int _type = BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:9: ( '{' | '}' )
			// mylexer.g:
			{
			if ( input.LA(1)=='{'||input.LA(1)=='}' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BRACKET"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:11: ( ';' )
			// mylexer.g:68:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:9: ( ',' )
			// mylexer.g:69:11: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:9: ( '.' )
			// mylexer.g:70:11: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "TWO_DOT"
	public final void mTWO_DOT() throws RecognitionException {
		try {
			int _type = TWO_DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:9: ( '\"' )
			// mylexer.g:71:11: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWO_DOT"

	// $ANTLR start "STRING_"
	public final void mSTRING_() throws RecognitionException {
		try {
			int _type = STRING_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:72:9: ( '\"' ( . )* '\"' )
			// mylexer.g:72:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// mylexer.g:72:14: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\"') ) {
					alt4=2;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// mylexer.g:72:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_"

	// $ANTLR start "ADDRESS_"
	public final void mADDRESS_() throws RecognitionException {
		try {
			int _type = ADDRESS_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:73:10: ( '&' ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:73:12: '&' ( LETTER ) ( LETTER | DIGIT )*
			{
			match('&'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:73:23: ( LETTER | DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDRESS_"

	// $ANTLR start "AND_"
	public final void mAND_() throws RecognitionException {
		try {
			int _type = AND_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:6: ( '&' )
			// mylexer.g:74:8: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_"

	// $ANTLR start "AND_LOG"
	public final void mAND_LOG() throws RecognitionException {
		try {
			int _type = AND_LOG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:8: ( '&&' )
			// mylexer.g:75:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_LOG"

	// $ANTLR start "OR_"
	public final void mOR_() throws RecognitionException {
		try {
			int _type = OR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:6: ( '|' )
			// mylexer.g:76:8: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_"

	// $ANTLR start "OR_LOG"
	public final void mOR_LOG() throws RecognitionException {
		try {
			int _type = OR_LOG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:77:8: ( '||' )
			// mylexer.g:77:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_LOG"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:78:9: ( '\\n' )
			// mylexer.g:78:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:79:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:79:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:79:7: ( ' ' | '\\r' | '\\t' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:80:7: ( '[' | ']' )
			// mylexer.g:
			{
			if ( input.LA(1)=='['||input.LA(1)==']' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:83:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:83:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='0') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// mylexer.g:83:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:83:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:83:28: ( DIGIT )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:85:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:85:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:85:14: ( LETTER | DIGIT )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:87:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt10=3;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// mylexer.g:87:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:87:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:87:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:88:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:88:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:88:22: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match('.'); 
			// mylexer.g:88:33: ( DIGIT )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:89:20: ( '.' ( DIGIT )+ )
			// mylexer.g:89:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:89:25: ( DIGIT )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:90:20: ( ( DIGIT )+ )
			// mylexer.g:90:22: ( DIGIT )+
			{
			// mylexer.g:90:22: ( DIGIT )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:94:10: ( '//' ( . )* '\\n' )
			// mylexer.g:94:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:94:16: ( . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='\n') ) {
					alt15=2;
				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// mylexer.g:94:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop15;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:95:10: ( '/*' ( . )* '*/' )
			// mylexer.g:95:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// mylexer.g:95:17: ( . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='*') ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1=='/') ) {
						alt16=2;
					}
					else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
						alt16=1;
					}

				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// mylexer.g:95:18: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:97:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:98:16: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER_DOT"
	public final void mLETTER_DOT() throws RecognitionException {
		try {
			// mylexer.g:99:21: ( 'a' .. 'z' | 'A' .. 'Z' | '.' )
			// mylexer.g:
			{
			if ( input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER_DOT"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( INT_TYPE | MAIN_ | CHAR_TYPE | VOID_TYPE | CONSTANT_ | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | WHILE_ | INCLUDE_ | HEADER_ | RETURN_ | PRINTF_ | SCANF_ | SCANF_INT | SCANF_FLOAT | FOR_ | BREAK_ | CONTINUE_ | SWITCH_ | CASE_ | MEMSET_ | MALLOC_ | FREE_ | STRUCT_TYPE | IF_ | ELSE_ | STRCPY_ | STRCMP_ | STRCAT_ | SAME_OP | PL_OP | MINUS_OP | MUL_OP | DIV_OP | MOD_OP | GT_OP | LT_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | PE_OP | ME_OP | MULE_OP | DE_OP | RSHIFT_OP | LSHIFT_OP | PARENTHESE | BRACKET | SEMICOLON | COMMA | DOT | TWO_DOT | STRING_ | ADDRESS_ | AND_ | AND_LOG | OR_ | OR_LOG | NEW_LINE | WS | ARRAY | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 )
		int alt17=70;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// mylexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: MAIN_
				{
				mMAIN_(); 

				}
				break;
			case 3 :
				// mylexer.g:1:25: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:35: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:45: CONSTANT_
				{
				mCONSTANT_(); 

				}
				break;
			case 6 :
				// mylexer.g:1:55: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:66: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:78: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:88: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 10 :
				// mylexer.g:1:95: INCLUDE_
				{
				mINCLUDE_(); 

				}
				break;
			case 11 :
				// mylexer.g:1:104: HEADER_
				{
				mHEADER_(); 

				}
				break;
			case 12 :
				// mylexer.g:1:112: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 13 :
				// mylexer.g:1:120: PRINTF_
				{
				mPRINTF_(); 

				}
				break;
			case 14 :
				// mylexer.g:1:128: SCANF_
				{
				mSCANF_(); 

				}
				break;
			case 15 :
				// mylexer.g:1:135: SCANF_INT
				{
				mSCANF_INT(); 

				}
				break;
			case 16 :
				// mylexer.g:1:145: SCANF_FLOAT
				{
				mSCANF_FLOAT(); 

				}
				break;
			case 17 :
				// mylexer.g:1:157: FOR_
				{
				mFOR_(); 

				}
				break;
			case 18 :
				// mylexer.g:1:162: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 19 :
				// mylexer.g:1:169: CONTINUE_
				{
				mCONTINUE_(); 

				}
				break;
			case 20 :
				// mylexer.g:1:179: SWITCH_
				{
				mSWITCH_(); 

				}
				break;
			case 21 :
				// mylexer.g:1:187: CASE_
				{
				mCASE_(); 

				}
				break;
			case 22 :
				// mylexer.g:1:193: MEMSET_
				{
				mMEMSET_(); 

				}
				break;
			case 23 :
				// mylexer.g:1:201: MALLOC_
				{
				mMALLOC_(); 

				}
				break;
			case 24 :
				// mylexer.g:1:209: FREE_
				{
				mFREE_(); 

				}
				break;
			case 25 :
				// mylexer.g:1:215: STRUCT_TYPE
				{
				mSTRUCT_TYPE(); 

				}
				break;
			case 26 :
				// mylexer.g:1:227: IF_
				{
				mIF_(); 

				}
				break;
			case 27 :
				// mylexer.g:1:231: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 28 :
				// mylexer.g:1:237: STRCPY_
				{
				mSTRCPY_(); 

				}
				break;
			case 29 :
				// mylexer.g:1:245: STRCMP_
				{
				mSTRCMP_(); 

				}
				break;
			case 30 :
				// mylexer.g:1:253: STRCAT_
				{
				mSTRCAT_(); 

				}
				break;
			case 31 :
				// mylexer.g:1:261: SAME_OP
				{
				mSAME_OP(); 

				}
				break;
			case 32 :
				// mylexer.g:1:269: PL_OP
				{
				mPL_OP(); 

				}
				break;
			case 33 :
				// mylexer.g:1:275: MINUS_OP
				{
				mMINUS_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:284: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:291: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:298: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:305: GT_OP
				{
				mGT_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:311: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:317: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:323: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:329: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:335: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:341: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:347: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:353: PE_OP
				{
				mPE_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:359: ME_OP
				{
				mME_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:365: MULE_OP
				{
				mMULE_OP(); 

				}
				break;
			case 48 :
				// mylexer.g:1:373: DE_OP
				{
				mDE_OP(); 

				}
				break;
			case 49 :
				// mylexer.g:1:379: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 50 :
				// mylexer.g:1:389: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 51 :
				// mylexer.g:1:399: PARENTHESE
				{
				mPARENTHESE(); 

				}
				break;
			case 52 :
				// mylexer.g:1:410: BRACKET
				{
				mBRACKET(); 

				}
				break;
			case 53 :
				// mylexer.g:1:418: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 54 :
				// mylexer.g:1:428: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 55 :
				// mylexer.g:1:434: DOT
				{
				mDOT(); 

				}
				break;
			case 56 :
				// mylexer.g:1:438: TWO_DOT
				{
				mTWO_DOT(); 

				}
				break;
			case 57 :
				// mylexer.g:1:446: STRING_
				{
				mSTRING_(); 

				}
				break;
			case 58 :
				// mylexer.g:1:454: ADDRESS_
				{
				mADDRESS_(); 

				}
				break;
			case 59 :
				// mylexer.g:1:463: AND_
				{
				mAND_(); 

				}
				break;
			case 60 :
				// mylexer.g:1:468: AND_LOG
				{
				mAND_LOG(); 

				}
				break;
			case 61 :
				// mylexer.g:1:476: OR_
				{
				mOR_(); 

				}
				break;
			case 62 :
				// mylexer.g:1:480: OR_LOG
				{
				mOR_LOG(); 

				}
				break;
			case 63 :
				// mylexer.g:1:487: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 64 :
				// mylexer.g:1:496: WS
				{
				mWS(); 

				}
				break;
			case 65 :
				// mylexer.g:1:499: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 66 :
				// mylexer.g:1:505: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 67 :
				// mylexer.g:1:513: ID
				{
				mID(); 

				}
				break;
			case 68 :
				// mylexer.g:1:516: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 69 :
				// mylexer.g:1:526: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 70 :
				// mylexer.g:1:535: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA10_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA10_eofS =
		"\5\uffff";
	static final String DFA10_minS =
		"\2\56\3\uffff";
	static final String DFA10_maxS =
		"\2\71\3\uffff";
	static final String DFA10_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA10_specialS =
		"\5\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "87:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA17_eotS =
		"\1\uffff\10\45\1\uffff\1\67\3\45\1\77\2\45\1\103\1\106\1\111\1\113\1\117"+
		"\1\122\5\uffff\1\123\1\125\1\131\1\133\3\uffff\2\134\1\uffff\1\45\1\137"+
		"\14\45\4\uffff\5\45\3\uffff\2\45\33\uffff\1\134\1\164\1\uffff\10\45\1"+
		"\176\13\45\1\uffff\1\u008b\2\45\1\u008e\2\45\1\u0091\1\u0092\1\45\1\uffff"+
		"\1\u0094\1\45\1\u0096\10\45\1\u00a1\1\uffff\2\45\1\uffff\1\u00a4\1\45"+
		"\2\uffff\1\u00a6\1\uffff\1\45\1\uffff\1\u00a8\2\45\1\u00ab\5\45\1\u00b1"+
		"\1\uffff\1\u00b2\1\u00b3\1\uffff\1\45\1\uffff\1\u00b5\1\uffff\1\u00b6"+
		"\1\u00b7\1\uffff\1\u00b8\1\45\1\u00ba\1\u00bb\1\u00bc\3\uffff\1\45\10"+
		"\uffff\1\u00be\1\uffff";
	static final String DFA17_eofS =
		"\u00bf\uffff";
	static final String DFA17_minS =
		"\1\11\1\146\2\141\1\157\1\154\2\157\1\150\1\uffff\1\56\1\145\1\162\1\143"+
		"\1\144\1\162\1\154\1\75\1\53\1\55\1\75\1\52\1\75\5\uffff\1\60\1\0\1\46"+
		"\1\174\3\uffff\2\56\1\uffff\1\164\1\60\1\151\1\155\1\141\1\156\1\163\1"+
		"\151\1\157\1\162\1\145\1\165\1\156\1\151\4\uffff\1\164\1\151\1\141\1\151"+
		"\1\162\3\uffff\1\145\1\163\33\uffff\1\56\1\60\1\uffff\1\156\1\154\1\163"+
		"\1\162\1\163\1\145\1\144\1\141\1\60\1\145\1\142\1\147\1\154\1\165\2\156"+
		"\1\164\1\143\1\141\1\145\1\uffff\1\60\1\157\1\145\1\60\1\164\1\151\2\60"+
		"\1\164\1\uffff\1\60\1\154\1\60\1\145\1\162\1\164\1\146\2\143\1\141\1\153"+
		"\1\60\1\uffff\1\143\1\164\1\uffff\1\60\1\156\2\uffff\1\60\1\uffff\1\145"+
		"\1\uffff\1\60\1\156\1\146\1\60\1\150\1\164\1\171\1\160\1\164\1\60\1\uffff"+
		"\2\60\1\uffff\1\165\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\40\3\60\3"+
		"\uffff\1\145\10\uffff\1\60\1\uffff";
	static final String DFA17_maxS =
		"\1\175\1\156\1\145\2\157\1\162\2\157\1\150\1\uffff\1\172\1\145\1\162\1"+
		"\167\1\146\1\162\1\154\5\75\1\76\5\uffff\1\71\1\uffff\1\172\1\174\3\uffff"+
		"\2\71\1\uffff\1\164\1\172\1\154\1\155\1\141\1\156\1\163\1\151\1\157\1"+
		"\162\1\145\1\165\1\156\1\151\4\uffff\1\164\1\151\1\141\1\151\1\162\3\uffff"+
		"\1\145\1\163\33\uffff\1\71\1\172\1\uffff\1\156\1\154\1\163\1\162\1\164"+
		"\1\145\1\144\1\141\1\172\1\145\1\142\1\147\1\154\1\165\2\156\1\164\1\165"+
		"\1\141\1\145\1\uffff\1\172\1\157\1\145\1\172\1\164\1\151\2\172\1\164\1"+
		"\uffff\1\172\1\154\1\172\1\145\1\162\1\164\1\146\2\143\1\160\1\153\1\172"+
		"\1\uffff\1\143\1\164\1\uffff\1\172\1\156\2\uffff\1\172\1\uffff\1\145\1"+
		"\uffff\1\172\1\156\1\146\1\172\1\150\1\164\1\171\1\160\1\164\1\172\1\uffff"+
		"\2\172\1\uffff\1\165\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\40\3"+
		"\172\3\uffff\1\145\10\uffff\1\172\1\uffff";
	static final String DFA17_acceptS =
		"\11\uffff\1\12\15\uffff\1\52\1\63\1\64\1\65\1\66\4\uffff\1\77\1\100\1"+
		"\101\2\uffff\1\103\16\uffff\1\50\1\61\1\13\1\46\5\uffff\1\17\1\20\1\44"+
		"\2\uffff\1\47\1\37\1\53\1\55\1\40\1\54\1\56\1\41\1\57\1\42\1\60\1\105"+
		"\1\106\1\43\1\51\1\62\1\45\1\67\1\104\1\70\1\71\1\72\1\74\1\73\1\76\1"+
		"\75\1\102\2\uffff\1\32\24\uffff\1\1\11\uffff\1\21\14\uffff\1\2\2\uffff"+
		"\1\3\2\uffff\1\25\1\4\1\uffff\1\30\1\uffff\1\10\12\uffff\1\33\2\uffff"+
		"\1\5\1\uffff\1\6\1\uffff\1\11\2\uffff\1\16\5\uffff\1\22\1\27\1\26\1\uffff"+
		"\1\7\1\14\1\15\1\24\1\31\1\34\1\35\1\36\1\uffff\1\23";
	static final String DFA17_specialS =
		"\35\uffff\1\0\u00a1\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\41\1\40\2\uffff\1\41\22\uffff\1\41\1\27\1\35\1\11\1\uffff\1\16\1\36"+
			"\1\uffff\2\30\1\24\1\22\1\33\1\23\1\34\1\25\1\43\11\44\1\uffff\1\32\1"+
			"\12\1\21\1\26\2\uffff\32\45\1\42\1\uffff\1\42\1\uffff\1\45\1\uffff\1"+
			"\45\1\17\1\3\1\6\1\20\1\5\2\45\1\1\2\45\1\7\1\2\2\45\1\14\1\45\1\13\1"+
			"\15\2\45\1\4\1\10\3\45\1\31\1\37\1\31",
			"\1\47\7\uffff\1\46",
			"\1\50\3\uffff\1\51",
			"\1\54\6\uffff\1\52\6\uffff\1\53",
			"\1\55",
			"\1\56\2\uffff\1\57\2\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"",
			"\1\66\15\uffff\1\65\1\64\1\66\2\uffff\32\66\6\uffff\32\66",
			"\1\70",
			"\1\71",
			"\1\72\20\uffff\1\74\2\uffff\1\73",
			"\1\75\1\uffff\1\76",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\104\21\uffff\1\105",
			"\1\107\17\uffff\1\110",
			"\1\112",
			"\1\116\4\uffff\1\115\15\uffff\1\114",
			"\1\120\1\121",
			"",
			"",
			"",
			"",
			"",
			"\12\124",
			"\0\126",
			"\1\130\32\uffff\32\127\4\uffff\1\127\1\uffff\32\127",
			"\1\132",
			"",
			"",
			"",
			"\1\124\1\uffff\12\124",
			"\1\124\1\uffff\12\135",
			"",
			"\1\136",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\140\2\uffff\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"",
			"",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"",
			"",
			"",
			"\1\162",
			"\1\163",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\124\1\uffff\12\135",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0088\21\uffff\1\u0087",
			"\1\u0089",
			"\1\u008a",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u008c",
			"\1\u008d",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u008f",
			"\1\u0090",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u0093",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u0095",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009f\13\uffff\1\u009e\2\uffff\1\u009d",
			"\1\u00a0",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u00a5",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\u00a7",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u00a9",
			"\1\u00aa",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\u00b4",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u00b9",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"",
			"",
			"\1\u00bd",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | MAIN_ | CHAR_TYPE | VOID_TYPE | CONSTANT_ | FLOAT_TYPE | DOUBLE_TYPE | LONG_TYPE | WHILE_ | INCLUDE_ | HEADER_ | RETURN_ | PRINTF_ | SCANF_ | SCANF_INT | SCANF_FLOAT | FOR_ | BREAK_ | CONTINUE_ | SWITCH_ | CASE_ | MEMSET_ | MALLOC_ | FREE_ | STRUCT_TYPE | IF_ | ELSE_ | STRCPY_ | STRCMP_ | STRCAT_ | SAME_OP | PL_OP | MINUS_OP | MUL_OP | DIV_OP | MOD_OP | GT_OP | LT_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | PE_OP | ME_OP | MULE_OP | DE_OP | RSHIFT_OP | LSHIFT_OP | PARENTHESE | BRACKET | SEMICOLON | COMMA | DOT | TWO_DOT | STRING_ | ADDRESS_ | AND_ | AND_LOG | OR_ | OR_LOG | NEW_LINE | WS | ARRAY | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_29 = input.LA(1);
						s = -1;
						if ( ((LA17_29 >= '\u0000' && LA17_29 <= '\uFFFF')) ) {s = 86;}
						else s = 85;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
