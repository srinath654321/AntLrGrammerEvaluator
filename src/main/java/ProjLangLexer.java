import org.antlr.runtime.*;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// ProjLang.g:4:9: ( 'a' .. 'z' | 'A' .. 'Z' )
			// ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// ProjLang.g:7:9: ( '0' .. '9' )
			// ProjLang.g:
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

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:9:8: ( ( DIGIT )+ )
			// ProjLang.g:9:10: ( DIGIT )+
			{
			// ProjLang.g:9:10: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ProjLang.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:11:4: ( 'if' )
			// ProjLang.g:11:6: 'if'
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
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:12:6: ( 'then' )
			// ProjLang.g:12:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:13:6: ( 'else' )
			// ProjLang.g:13:8: 'else'
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
	// $ANTLR end "ELSE"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:15:9: ( 'fun' )
			// ProjLang.g:15:11: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "LEFTCUB"
	public final void mLEFTCUB() throws RecognitionException {
		try {
			int _type = LEFTCUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:16:9: ( '{' )
			// ProjLang.g:16:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFTCUB"

	// $ANTLR start "RIGHTCUB"
	public final void mRIGHTCUB() throws RecognitionException {
		try {
			int _type = RIGHTCUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:17:9: ( '}' )
			// ProjLang.g:17:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTCUB"

	// $ANTLR start "LFTPARANTHESIS"
	public final void mLFTPARANTHESIS() throws RecognitionException {
		try {
			int _type = LFTPARANTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:18:17: ( '(' )
			// ProjLang.g:18:19: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LFTPARANTHESIS"

	// $ANTLR start "RIGHTPARANTHESIS"
	public final void mRIGHTPARANTHESIS() throws RecognitionException {
		try {
			int _type = RIGHTPARANTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:19:18: ( ')' )
			// ProjLang.g:19:20: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTPARANTHESIS"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:21:5: ( 'let' )
			// ProjLang.g:21:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:22:5: ( 'val' )
			// ProjLang.g:22:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:23:4: ( 'in' )
			// ProjLang.g:23:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:24:5: ( 'end' )
			// ProjLang.g:24:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:25:9: ( 'while' )
			// ProjLang.g:25:11: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:26:4: ( 'do' )
			// ProjLang.g:26:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:27:11: ( ';' )
			// ProjLang.g:27:13: ';'
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

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:28:7: ( ':=' )
			// ProjLang.g:28:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:29:5: ( '!' )
			// ProjLang.g:29:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:30:9: ( ( '+' | '-' | '|' ) )
			// ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
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
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:31:9: ( ( '*' | '/' | '&' ) )
			// ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
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
	// $ANTLR end "MULOP"

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:32:7: ( ( '<' ) )
			// ProjLang.g:32:10: ( '<' )
			{
			// ProjLang.g:32:10: ( '<' )
			// ProjLang.g:32:11: '<'
			{
			match('<'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELOP"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:33:7: ( '=' )
			// ProjLang.g:33:9: '='
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
	// $ANTLR end "EQUAL"

	// $ANTLR start "TRU"
	public final void mTRU() throws RecognitionException {
		try {
			int _type = TRU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:34:5: ( 'true' )
			// ProjLang.g:34:7: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRU"

	// $ANTLR start "FALS"
	public final void mFALS() throws RecognitionException {
		try {
			int _type = FALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:35:6: ( 'false' )
			// ProjLang.g:35:8: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:36:4: ( LETTER ( LETTER | DIGIT )* )
			// ProjLang.g:36:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// ProjLang.g:36:12: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:37:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// ProjLang.g:37:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// ProjLang.g:37:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// ProjLang.g:1:8: ( NUMBER | IF | THEN | ELSE | FUN | LEFTCUB | RIGHTCUB | LFTPARANTHESIS | RIGHTPARANTHESIS | LET | VAL | IN | END | WHILE | DO | SEMICOLON | COLON | NOT | ADDOP | MULOP | RELOP | EQUAL | TRU | FALS | ID | WS )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// ProjLang.g:1:10: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 2 :
				// ProjLang.g:1:17: IF
				{
				mIF(); 

				}
				break;
			case 3 :
				// ProjLang.g:1:20: THEN
				{
				mTHEN(); 

				}
				break;
			case 4 :
				// ProjLang.g:1:25: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// ProjLang.g:1:30: FUN
				{
				mFUN(); 

				}
				break;
			case 6 :
				// ProjLang.g:1:34: LEFTCUB
				{
				mLEFTCUB(); 

				}
				break;
			case 7 :
				// ProjLang.g:1:42: RIGHTCUB
				{
				mRIGHTCUB(); 

				}
				break;
			case 8 :
				// ProjLang.g:1:51: LFTPARANTHESIS
				{
				mLFTPARANTHESIS(); 

				}
				break;
			case 9 :
				// ProjLang.g:1:66: RIGHTPARANTHESIS
				{
				mRIGHTPARANTHESIS(); 

				}
				break;
			case 10 :
				// ProjLang.g:1:83: LET
				{
				mLET(); 

				}
				break;
			case 11 :
				// ProjLang.g:1:87: VAL
				{
				mVAL(); 

				}
				break;
			case 12 :
				// ProjLang.g:1:91: IN
				{
				mIN(); 

				}
				break;
			case 13 :
				// ProjLang.g:1:94: END
				{
				mEND(); 

				}
				break;
			case 14 :
				// ProjLang.g:1:98: WHILE
				{
				mWHILE(); 

				}
				break;
			case 15 :
				// ProjLang.g:1:104: DO
				{
				mDO(); 

				}
				break;
			case 16 :
				// ProjLang.g:1:107: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// ProjLang.g:1:117: COLON
				{
				mCOLON(); 

				}
				break;
			case 18 :
				// ProjLang.g:1:123: NOT
				{
				mNOT(); 

				}
				break;
			case 19 :
				// ProjLang.g:1:127: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 20 :
				// ProjLang.g:1:133: MULOP
				{
				mMULOP(); 

				}
				break;
			case 21 :
				// ProjLang.g:1:139: RELOP
				{
				mRELOP(); 

				}
				break;
			case 22 :
				// ProjLang.g:1:145: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 23 :
				// ProjLang.g:1:151: TRU
				{
				mTRU(); 

				}
				break;
			case 24 :
				// ProjLang.g:1:155: FALS
				{
				mFALS(); 

				}
				break;
			case 25 :
				// ProjLang.g:1:160: ID
				{
				mID(); 

				}
				break;
			case 26 :
				// ProjLang.g:1:163: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\2\uffff\4\25\4\uffff\4\25\11\uffff\1\43\1\44\11\25\1\56\2\uffff\3\25"+
		"\1\62\1\63\1\25\1\65\1\66\1\25\1\uffff\1\70\1\71\1\72\2\uffff\1\25\2\uffff"+
		"\1\25\3\uffff\1\75\1\76\2\uffff";
	static final String DFA4_eofS =
		"\77\uffff";
	static final String DFA4_minS =
		"\1\11\1\uffff\1\146\1\150\1\154\1\141\4\uffff\1\145\1\141\1\150\1\157"+
		"\11\uffff\2\60\1\145\1\165\1\163\1\144\1\156\1\154\1\164\1\154\1\151\1"+
		"\60\2\uffff\1\156\2\145\2\60\1\163\2\60\1\154\1\uffff\3\60\2\uffff\1\145"+
		"\2\uffff\1\145\3\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\uffff\1\156\1\162\1\156\1\165\4\uffff\1\145\1\141\1\150\1\157"+
		"\11\uffff\2\172\1\145\1\165\1\163\1\144\1\156\1\154\1\164\1\154\1\151"+
		"\1\172\2\uffff\1\156\2\145\2\172\1\163\2\172\1\154\1\uffff\3\172\2\uffff"+
		"\1\145\2\uffff\1\145\3\uffff\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\4\uffff\1\6\1\7\1\10\1\11\4\uffff\1\20\1\21\1\22\1\23\1\24"+
		"\1\25\1\26\1\31\1\32\14\uffff\1\2\1\14\11\uffff\1\17\3\uffff\1\15\1\5"+
		"\1\uffff\1\12\1\13\1\uffff\1\3\1\27\1\4\2\uffff\1\30\1\16";
	static final String DFA4_specialS =
		"\77\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\20\4\uffff\1\22\1\uffff\1\10\1\11"+
			"\1\22\1\21\1\uffff\1\21\1\uffff\1\22\12\1\1\17\1\16\1\23\1\24\3\uffff"+
			"\32\25\6\uffff\3\25\1\15\1\4\1\5\2\25\1\2\2\25\1\12\7\25\1\3\1\25\1\13"+
			"\1\14\3\25\1\6\1\21\1\7",
			"",
			"\1\27\7\uffff\1\30",
			"\1\31\11\uffff\1\32",
			"\1\33\1\uffff\1\34",
			"\1\36\23\uffff\1\35",
			"",
			"",
			"",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\64",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\67",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\73",
			"",
			"",
			"\1\74",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NUMBER | IF | THEN | ELSE | FUN | LEFTCUB | RIGHTCUB | LFTPARANTHESIS | RIGHTPARANTHESIS | LET | VAL | IN | END | WHILE | DO | SEMICOLON | COLON | NOT | ADDOP | MULOP | RELOP | EQUAL | TRU | FALS | ID | WS );";
		}
	}

}
