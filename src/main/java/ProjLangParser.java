import org.antlr.runtime.*;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "COLON", "DIGIT", "DO", 
		"ELSE", "END", "EQUAL", "FALS", "FUN", "ID", "IF", "IN", "LEFTCUB", "LET", 
		"LETTER", "LFTPARANTHESIS", "MULOP", "NOT", "NUMBER", "RELOP", "RIGHTCUB", 
		"RIGHTPARANTHESIS", "SEMICOLON", "THEN", "TRU", "VAL", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int COLON=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int END=9;
	public static final int EQUAL=10;
	public static final int FALS=11;
	public static final int FUN=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int IN=15;
	public static final int LEFTCUB=16;
	public static final int LET=17;
	public static final int LETTER=18;
	public static final int LFTPARANTHESIS=19;
	public static final int MULOP=20;
	public static final int NOT=21;
	public static final int NUMBER=22;
	public static final int RELOP=23;
	public static final int RIGHTCUB=24;
	public static final int RIGHTPARANTHESIS=25;
	public static final int SEMICOLON=26;
	public static final int THEN=27;
	public static final int TRU=28;
	public static final int VAL=29;
	public static final int WHILE=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ProjLang.g"; }



	// $ANTLR start "input"
	// ProjLang.g:60:1: input returns [Expr obj] : expr ;
	public final Expr input() throws RecognitionException {
		Expr obj = null;


		Expr expr1 =null;

		try {
			// ProjLang.g:60:26: ( expr )
			// ProjLang.g:60:28: expr
			{
			pushFollow(FOLLOW_expr_in_input333);
			expr1=expr();
			state._fsp--;

			obj =expr1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// ProjLang.g:62:1: expr returns [Expr obj] : ( 'if' a= expr 'then' b= expr 'else' c= expr | 'while' h= expr 'do' i= expr | 'let' 'fun' fun1= ID LFTPARANTHESIS fun2= ID RIGHTPARANTHESIS EQUAL f= expr 'in' g= expr END | 'let' 'val' ID EQUAL d= expr 'in' e= expr END | NOT l= expr | ID COLON m= expr | LEFTCUB j= expr ( SEMICOLON k= expr )* RIGHTCUB |n= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr obj = null;


		Token fun1=null;
		Token fun2=null;
		Token ID2=null;
		Expr a =null;
		Expr b =null;
		Expr c =null;
		Expr h =null;
		Expr i =null;
		Expr f =null;
		Expr g =null;
		Expr d =null;
		Expr e =null;
		Expr l =null;
		Expr m =null;
		Expr j =null;
		Expr k =null;
		Expr n =null;

		try {
			// ProjLang.g:62:24: ( 'if' a= expr 'then' b= expr 'else' c= expr | 'while' h= expr 'do' i= expr | 'let' 'fun' fun1= ID LFTPARANTHESIS fun2= ID RIGHTPARANTHESIS EQUAL f= expr 'in' g= expr END | 'let' 'val' ID EQUAL d= expr 'in' e= expr END | NOT l= expr | ID COLON m= expr | LEFTCUB j= expr ( SEMICOLON k= expr )* RIGHTCUB |n= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case WHILE:
				{
				alt2=2;
				}
				break;
			case LET:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==FUN) ) {
					alt2=3;
				}
				else if ( (LA2_3==VAL) ) {
					alt2=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NOT:
				{
				alt2=5;
				}
				break;
			case ID:
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5==COLON) ) {
					alt2=6;
				}
				else if ( (LA2_5==EOF||LA2_5==ADDOP||(LA2_5 >= DO && LA2_5 <= EQUAL)||LA2_5==IN||(LA2_5 >= LFTPARANTHESIS && LA2_5 <= MULOP)||(LA2_5 >= RELOP && LA2_5 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFTCUB:
				{
				alt2=7;
				}
				break;
			case FALS:
			case LFTPARANTHESIS:
			case NUMBER:
			case TRU:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// ProjLang.g:62:26: 'if' a= expr 'then' b= expr 'else' c= expr
					{
					match(input,IF,FOLLOW_IF_in_expr346); 
					pushFollow(FOLLOW_expr_in_expr350);
					a=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr352); 
					pushFollow(FOLLOW_expr_in_expr356);
					b=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr358); 
					pushFollow(FOLLOW_expr_in_expr362);
					c=expr();
					state._fsp--;

					obj = new IfExp(a, b, c);
					}
					break;
				case 2 :
					// ProjLang.g:63:9: 'while' h= expr 'do' i= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr373); 
					pushFollow(FOLLOW_expr_in_expr377);
					h=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr379); 
					pushFollow(FOLLOW_expr_in_expr383);
					i=expr();
					state._fsp--;

					obj =new WhileExp(h,i);
					}
					break;
				case 3 :
					// ProjLang.g:64:10: 'let' 'fun' fun1= ID LFTPARANTHESIS fun2= ID RIGHTPARANTHESIS EQUAL f= expr 'in' g= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr396); 
					match(input,FUN,FOLLOW_FUN_in_expr398); 
					fun1=(Token)match(input,ID,FOLLOW_ID_in_expr402); 
					match(input,LFTPARANTHESIS,FOLLOW_LFTPARANTHESIS_in_expr404); 
					fun2=(Token)match(input,ID,FOLLOW_ID_in_expr408); 
					match(input,RIGHTPARANTHESIS,FOLLOW_RIGHTPARANTHESIS_in_expr410); 
					match(input,EQUAL,FOLLOW_EQUAL_in_expr412); 
					pushFollow(FOLLOW_expr_in_expr416);
					f=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr418); 
					pushFollow(FOLLOW_expr_in_expr422);
					g=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr424); 
					obj = new LetFunExp((fun1!=null?fun1.getText():null),(fun2!=null?fun2.getText():null),f,g);
					}
					break;
				case 4 :
					// ProjLang.g:65:10: 'let' 'val' ID EQUAL d= expr 'in' e= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr436); 
					match(input,VAL,FOLLOW_VAL_in_expr438); 
					ID2=(Token)match(input,ID,FOLLOW_ID_in_expr440); 
					match(input,EQUAL,FOLLOW_EQUAL_in_expr442); 
					pushFollow(FOLLOW_expr_in_expr448);
					d=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr450); 
					pushFollow(FOLLOW_expr_in_expr455);
					e=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr457); 
					obj =new LetValExp((ID2!=null?ID2.getText():null),d,e);
					}
					break;
				case 5 :
					// ProjLang.g:66:10: NOT l= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr470); 
					pushFollow(FOLLOW_expr_in_expr474);
					l=expr();
					state._fsp--;

					obj =new NotExp(l);
					}
					break;
				case 6 :
					// ProjLang.g:68:9: ID COLON m= expr
					{
					match(input,ID,FOLLOW_ID_in_expr494); 
					match(input,COLON,FOLLOW_COLON_in_expr496); 
					pushFollow(FOLLOW_expr_in_expr502);
					m=expr();
					state._fsp--;

					 obj = new AssnExp(m);
					}
					break;
				case 7 :
					// ProjLang.g:69:10: LEFTCUB j= expr ( SEMICOLON k= expr )* RIGHTCUB
					{
					match(input,LEFTCUB,FOLLOW_LEFTCUB_in_expr515); 
					pushFollow(FOLLOW_expr_in_expr519);
					j=expr();
					state._fsp--;

					// ProjLang.g:69:24: ( SEMICOLON k= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMICOLON) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ProjLang.g:69:25: SEMICOLON k= expr
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expr521); 
							pushFollow(FOLLOW_expr_in_expr525);
							k=expr();
							state._fsp--;

							obj =new SeqExp(obj,k);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RIGHTCUB,FOLLOW_RIGHTCUB_in_expr530); 
					}
					break;
				case 8 :
					// ProjLang.g:70:10: n= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr543);
					n=relexpr();
					state._fsp--;

					obj =n;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// ProjLang.g:73:1: relexpr returns [Expr obj] : O= arithexpr ( (P= RELOP |P= EQUAL ) Q= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr obj = null;


		Token P=null;
		Expr O =null;
		Expr Q =null;

		try {
			// ProjLang.g:73:27: (O= arithexpr ( (P= RELOP |P= EQUAL ) Q= arithexpr )? )
			// ProjLang.g:73:29: O= arithexpr ( (P= RELOP |P= EQUAL ) Q= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr565);
			O=arithexpr();
			state._fsp--;

			obj =O;
			// ProjLang.g:73:54: ( (P= RELOP |P= EQUAL ) Q= arithexpr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQUAL||LA4_0==RELOP) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ProjLang.g:73:55: (P= RELOP |P= EQUAL ) Q= arithexpr
					{
					// ProjLang.g:73:55: (P= RELOP |P= EQUAL )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==RELOP) ) {
						alt3=1;
					}
					else if ( (LA3_0==EQUAL) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// ProjLang.g:73:56: P= RELOP
							{
							P=(Token)match(input,RELOP,FOLLOW_RELOP_in_relexpr571); 
							}
							break;
						case 2 :
							// ProjLang.g:73:64: P= EQUAL
							{
							P=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relexpr575); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr607);
					Q=arithexpr();
					state._fsp--;

					if ((P!=null?P.getText():null).equals("="))
						obj = new BinExp(BinOp.EQ,obj,Q);
					   else
					   	obj = new BinExp(BinOp.LT,obj,Q);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// ProjLang.g:79:1: arithexpr returns [Expr obj] : R= term ( ADDOP S= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr obj = null;


		Token ADDOP3=null;
		Expr R =null;
		Expr S =null;

		try {
			// ProjLang.g:79:29: (R= term ( ADDOP S= term )* )
			// ProjLang.g:79:31: R= term ( ADDOP S= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr625);
			R=term();
			state._fsp--;

			obj =R;
			// ProjLang.g:80:30: ( ADDOP S= term )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ADDOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ProjLang.g:80:31: ADDOP S= term
					{
					ADDOP3=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr658); 
					pushFollow(FOLLOW_term_in_arithexpr662);
					S=term();
					state._fsp--;

					if ((ADDOP3!=null?ADDOP3.getText():null).equals("+")) obj = new BinExp(BinOp.PLUS,obj,S);
							              else if((ADDOP3!=null?ADDOP3.getText():null).equals("-")) obj =new BinExp(BinOp.MINUS,obj,S);
								      else if((ADDOP3!=null?ADDOP3.getText():null).equals("|")) obj = new BinExp(BinOp.OR,obj,S);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// ProjLang.g:84:1: term returns [Expr obj] : T= factor ( MULOP U= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr obj = null;


		Token MULOP4=null;
		Expr T =null;
		Expr U =null;

		try {
			// ProjLang.g:84:25: (T= factor ( MULOP U= factor )* )
			// ProjLang.g:84:27: T= factor ( MULOP U= factor )*
			{
			pushFollow(FOLLOW_factor_in_term681);
			T=factor();
			state._fsp--;

			obj =T;
			// ProjLang.g:85:30: ( MULOP U= factor )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MULOP) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ProjLang.g:85:31: MULOP U= factor
					{
					MULOP4=(Token)match(input,MULOP,FOLLOW_MULOP_in_term714); 
					pushFollow(FOLLOW_factor_in_term718);
					U=factor();
					state._fsp--;

					if ((MULOP4!=null?MULOP4.getText():null).equals("*")) obj =new BinExp(BinOp.TIMES,obj,U);
							              else if ((MULOP4!=null?MULOP4.getText():null).equals("/")) obj =new BinExp(BinOp.DIV,obj,U);
								      else if((MULOP4!=null?MULOP4.getText():null).equals("&")) obj =new BinExp(BinOp.AND,obj,U);
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// ProjLang.g:89:1: factor returns [Expr obj] : ( NUMBER | TRU | FALS | ID |lp= ID LFTPARANTHESIS X= expr RIGHTPARANTHESIS | LFTPARANTHESIS Z= expr RIGHTPARANTHESIS );
	public final Expr factor() throws RecognitionException {
		Expr obj = null;


		Token lp=null;
		Token NUMBER5=null;
		Token ID6=null;
		Expr X =null;
		Expr Z =null;

		try {
			// ProjLang.g:89:26: ( NUMBER | TRU | FALS | ID |lp= ID LFTPARANTHESIS X= expr RIGHTPARANTHESIS | LFTPARANTHESIS Z= expr RIGHTPARANTHESIS )
			int alt7=6;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt7=1;
				}
				break;
			case TRU:
				{
				alt7=2;
				}
				break;
			case FALS:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4==LFTPARANTHESIS) ) {
					alt7=5;
				}
				else if ( (LA7_4==EOF||LA7_4==ADDOP||(LA7_4 >= DO && LA7_4 <= EQUAL)||LA7_4==IN||LA7_4==MULOP||(LA7_4 >= RELOP && LA7_4 <= THEN)) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LFTPARANTHESIS:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ProjLang.g:89:28: NUMBER
					{
					NUMBER5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor732); 
					obj = new IntConst(Integer.parseInt((NUMBER5!=null?NUMBER5.getText():null)));
					}
					break;
				case 2 :
					// ProjLang.g:90:3: TRU
					{
					match(input,TRU,FOLLOW_TRU_in_factor737); 
					obj =new BoolConst(Boolean.parseBoolean("true"));
					}
					break;
				case 3 :
					// ProjLang.g:91:3: FALS
					{
					match(input,FALS,FOLLOW_FALS_in_factor743); 
					obj =new BoolConst(Boolean.parseBoolean("false"));
					}
					break;
				case 4 :
					// ProjLang.g:92:3: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_factor749); 
					obj =new VarExp((ID6!=null?ID6.getText():null));
					}
					break;
				case 5 :
					// ProjLang.g:93:3: lp= ID LFTPARANTHESIS X= expr RIGHTPARANTHESIS
					{
					lp=(Token)match(input,ID,FOLLOW_ID_in_factor758); 
					match(input,LFTPARANTHESIS,FOLLOW_LFTPARANTHESIS_in_factor760); 
					pushFollow(FOLLOW_expr_in_factor764);
					X=expr();
					state._fsp--;

					match(input,RIGHTPARANTHESIS,FOLLOW_RIGHTPARANTHESIS_in_factor766); 
					obj =new AppExp((lp!=null?lp.getText():null),X);
					}
					break;
				case 6 :
					// ProjLang.g:94:2: LFTPARANTHESIS Z= expr RIGHTPARANTHESIS
					{
					match(input,LFTPARANTHESIS,FOLLOW_LFTPARANTHESIS_in_factor771); 
					pushFollow(FOLLOW_expr_in_factor775);
					Z=expr();
					state._fsp--;

					obj =Z;
					match(input,RIGHTPARANTHESIS,FOLLOW_RIGHTPARANTHESIS_in_factor778); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return obj;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr346 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr352 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_expr358 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr373 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_expr379 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr396 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_FUN_in_expr398 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr402 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LFTPARANTHESIS_in_expr404 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr408 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTPARANTHESIS_in_expr410 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQUAL_in_expr412 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr418 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr422 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr436 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr438 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr440 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQUAL_in_expr442 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr448 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr450 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr470 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr494 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_expr496 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTCUB_in_expr515 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr519 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_expr521 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr525 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RIGHTCUB_in_expr530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr565 = new BitSet(new long[]{0x0000000000800402L});
	public static final BitSet FOLLOW_RELOP_in_relexpr571 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_EQUAL_in_relexpr575 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr625 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr658 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_term_in_arithexpr662 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term681 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_MULOP_in_term714 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_factor_in_term718 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_NUMBER_in_factor732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRU_in_factor737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALS_in_factor743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor758 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LFTPARANTHESIS_in_factor760 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_factor764 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTPARANTHESIS_in_factor766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LFTPARANTHESIS_in_factor771 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_factor775 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTPARANTHESIS_in_factor778 = new BitSet(new long[]{0x0000000000000002L});
}
