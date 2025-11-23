// Generated from rules.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAYS=1, SHOUTS=2, WORD=3, NUMBER=4, WHITESPACE=5, NEWLINE=6, TEXT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "S", "H", "O", "U", "Y", "T", "LOWER", "UPPER", "DIGIT", "SAYS", 
			"SHOUTS", "WORD", "NUMBER", "WHITESPACE", "NEWLINE", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAYS", "SHOUTS", "WORD", "NUMBER", "WHITESPACE", "NEWLINE", "TEXT"
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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
		"\u0004\u0000\u0007e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\fG\b\f\u000b"+
		"\f\f\fH\u0001\r\u0004\rL\b\r\u000b\r\f\rM\u0001\r\u0001\r\u0004\rR\b\r"+
		"\u000b\r\f\rS\u0003\rV\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f"+
		"[\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f_\b\u000f\u0001\u0010\u0004"+
		"\u0010b\b\u0010\u000b\u0010\f\u0010c\u0000\u0000\u0011\u0001\u0000\u0003"+
		"\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000"+
		"\u0011\u0000\u0013\u0000\u0015\u0001\u0017\u0002\u0019\u0003\u001b\u0004"+
		"\u001d\u0005\u001f\u0006!\u0007\u0001\u0000\r\u0002\u0000AAaa\u0002\u0000"+
		"SSss\u0002\u0000HHhh\u0002\u0000OOoo\u0002\u0000UUuu\u0002\u0000YYyy\u0002"+
		"\u0000TTtt\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0002\u0000,,..\u0002"+
		"\u0000\t\t__\u0004\u0000\n\n\r\r))]]c\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001"+
		"\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000"+
		"\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f"+
		"1\u0001\u0000\u0000\u0000\u00113\u0001\u0000\u0000\u0000\u00135\u0001"+
		"\u0000\u0000\u0000\u00157\u0001\u0000\u0000\u0000\u0017<\u0001\u0000\u0000"+
		"\u0000\u0019F\u0001\u0000\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001d"+
		"W\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!a\u0001\u0000"+
		"\u0000\u0000#$\u0007\u0000\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0007\u0001\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0007\u0002"+
		"\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0007\u0003\u0000\u0000"+
		"*\b\u0001\u0000\u0000\u0000+,\u0007\u0004\u0000\u0000,\n\u0001\u0000\u0000"+
		"\u0000-.\u0007\u0005\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0007\u0006"+
		"\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0007\u0007\u0000\u0000"+
		"2\u0010\u0001\u0000\u0000\u000034\u0007\b\u0000\u00004\u0012\u0001\u0000"+
		"\u0000\u000056\u0007\t\u0000\u00006\u0014\u0001\u0000\u0000\u000078\u0003"+
		"\u0003\u0001\u000089\u0003\u0001\u0000\u00009:\u0003\u000b\u0005\u0000"+
		":;\u0003\u0003\u0001\u0000;\u0016\u0001\u0000\u0000\u0000<=\u0003\u0003"+
		"\u0001\u0000=>\u0003\u0005\u0002\u0000>?\u0003\u0007\u0003\u0000?@\u0003"+
		"\t\u0004\u0000@A\u0003\r\u0006\u0000AB\u0003\u0003\u0001\u0000B\u0018"+
		"\u0001\u0000\u0000\u0000CG\u0003\u0011\b\u0000DG\u0003\u000f\u0007\u0000"+
		"EG\u0005_\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000I\u001a\u0001\u0000\u0000\u0000JL\u0003"+
		"\u0013\t\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000"+
		"OQ\u0007\n\u0000\u0000PR\u0003\u0013\t\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WX\u0007\u000b\u0000\u0000"+
		"X\u001e\u0001\u0000\u0000\u0000Y[\u0005\r\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0005\n"+
		"\u0000\u0000]_\u0005\r\u0000\u0000^Z\u0001\u0000\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_ \u0001\u0000\u0000\u0000`b\b\f\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\"\u0001\u0000\u0000\u0000\t\u0000FHMSUZ^c\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}