// Generated from fish.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class fishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SAYS=10, SHOUTS=11, WORD=12, WHITESPACE=13, NEWLINE=14, TEXT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"SAYS", "SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "TEXT", "LOWER", "UPPER", 
			"DIGIT", "A", "S", "Y", "H", "O", "U", "T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "')'", "'?'", "'['", "']'", "'('", "'/'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SAYS", "SHOUTS", 
			"WORD", "WHITESPACE", "NEWLINE", "TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public fishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fish.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000bU\b\u000b\u000b\u000b\f\u000bV\u0001\f\u0004\fZ\b\f\u000b"+
		"\f\f\f[\u0001\r\u0003\r_\b\r\u0001\r\u0001\r\u0003\rc\b\r\u0001\u000e"+
		"\u0004\u000ef\b\u000e\u000b\u000e\f\u000eg\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0000"+
		"\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0000!\u0000#\u0000%\u0000\'\u0000)\u0000+\u0000"+
		"-\u0000/\u00001\u0000\u0001\u0000\f\u0002\u0000\t\t  \u0004\u0000\n\n"+
		"\r\r))]]\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0002\u0000AAaa\u0002"+
		"\u0000SSss\u0002\u0000YYyy\u0002\u0000HHhh\u0002\u0000OOoo\u0002\u0000"+
		"UUuu\u0002\u0000TTtty\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000"+
		"\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u0007"+
		"9\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001\u0000"+
		"\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000"+
		"\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015J"+
		"\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000"+
		"\u0000\u0000\u001bb\u0001\u0000\u0000\u0000\u001de\u0001\u0000\u0000\u0000"+
		"\u001fi\u0001\u0000\u0000\u0000!k\u0001\u0000\u0000\u0000#m\u0001\u0000"+
		"\u0000\u0000%o\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)s\u0001"+
		"\u0000\u0000\u0000+u\u0001\u0000\u0000\u0000-w\u0001\u0000\u0000\u0000"+
		"/y\u0001\u0000\u0000\u00001{\u0001\u0000\u0000\u000034\u0005:\u0000\u0000"+
		"4\u0002\u0001\u0000\u0000\u000056\u0005-\u0000\u00006\u0004\u0001\u0000"+
		"\u0000\u000078\u0005)\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005"+
		"?\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005[\u0000\u0000<\n\u0001"+
		"\u0000\u0000\u0000=>\u0005]\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005"+
		"(\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005/\u0000\u0000B\u0010"+
		"\u0001\u0000\u0000\u0000CD\u0005@\u0000\u0000D\u0012\u0001\u0000\u0000"+
		"\u0000EF\u0003\'\u0013\u0000FG\u0003%\u0012\u0000GH\u0003)\u0014\u0000"+
		"HI\u0003\'\u0013\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0003\'\u0013"+
		"\u0000KL\u0003+\u0015\u0000LM\u0003-\u0016\u0000MN\u0003/\u0017\u0000"+
		"NO\u00031\u0018\u0000OP\u0003\'\u0013\u0000P\u0016\u0001\u0000\u0000\u0000"+
		"QU\u0003!\u0010\u0000RU\u0003\u001f\u000f\u0000SU\u0005_\u0000\u0000T"+
		"Q\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XZ\u0007\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u001a\u0001\u0000\u0000\u0000]_\u0005"+
		"\r\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`c\u0005\n\u0000\u0000ac\u0005\r\u0000\u0000b^\u0001"+
		"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u001c\u0001\u0000\u0000"+
		"\u0000df\b\u0001\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u001e\u0001"+
		"\u0000\u0000\u0000ij\u0007\u0002\u0000\u0000j \u0001\u0000\u0000\u0000"+
		"kl\u0007\u0003\u0000\u0000l\"\u0001\u0000\u0000\u0000mn\u0007\u0004\u0000"+
		"\u0000n$\u0001\u0000\u0000\u0000op\u0007\u0005\u0000\u0000p&\u0001\u0000"+
		"\u0000\u0000qr\u0007\u0006\u0000\u0000r(\u0001\u0000\u0000\u0000st\u0007"+
		"\u0007\u0000\u0000t*\u0001\u0000\u0000\u0000uv\u0007\b\u0000\u0000v,\u0001"+
		"\u0000\u0000\u0000wx\u0007\t\u0000\u0000x.\u0001\u0000\u0000\u0000yz\u0007"+
		"\n\u0000\u0000z0\u0001\u0000\u0000\u0000{|\u0007\u000b\u0000\u0000|2\u0001"+
		"\u0000\u0000\u0000\u0007\u0000TV[^bg\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}