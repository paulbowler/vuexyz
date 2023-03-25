// Generated from ./grammar/Domain.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DomainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TABLE=2, VIEW=3, STRING=4, INTEGER=5, WORD=6, SEPARATOR=7, NEWLINE=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TABLE", "VIEW", "STRING", "INTEGER", "WORD", "LOWERCASE", "UPPERCASE", 
			"SEPARATOR", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TABLE", "VIEW", "STRING", "INTEGER", "WORD", "SEPARATOR", 
			"NEWLINE", "WS"
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


	public DomainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Domain.g4"; }

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
		"\u0004\u0000\tR\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u00057\b\u0005\u000b\u0005\f\u00058\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0003\tB\b\t\u0001\t\u0001"+
		"\t\u0004\tF\b\t\u000b\t\f\tG\u0001\t\u0001\t\u0001\n\u0004\nM\b\n\u000b"+
		"\n\f\nN\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0000\u000f\u0000\u0011\u0007"+
		"\u0013\b\u0015\t\u0001\u0000\u000f\u0002\u0000TTtt\u0002\u0000AAaa\u0002"+
		"\u0000BBbb\u0002\u0000LLll\u0002\u0000EEee\u0002\u0000VVvv\u0002\u0000"+
		"IIii\u0002\u0000WWww\u0002\u0000SSss\u0002\u0000RRrr\u0002\u0000NNnn\u0002"+
		"\u0000GGgg\u0001\u0000az\u0001\u0000AZ\u0002\u0000\t\t  V\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001"+
		"\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007$\u0001\u0000"+
		"\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000"+
		"\r:\u0001\u0000\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011>\u0001"+
		"\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005.\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0007\u0000\u0000\u0000\u001a\u001b\u0007\u0001\u0000\u0000"+
		"\u001b\u001c\u0007\u0002\u0000\u0000\u001c\u001d\u0007\u0003\u0000\u0000"+
		"\u001d\u001e\u0007\u0004\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000"+
		"\u001f \u0007\u0005\u0000\u0000 !\u0007\u0006\u0000\u0000!\"\u0007\u0004"+
		"\u0000\u0000\"#\u0007\u0007\u0000\u0000#\u0006\u0001\u0000\u0000\u0000"+
		"$%\u0007\b\u0000\u0000%&\u0007\u0000\u0000\u0000&\'\u0007\t\u0000\u0000"+
		"\'(\u0007\u0006\u0000\u0000()\u0007\n\u0000\u0000)*\u0007\u000b\u0000"+
		"\u0000*\b\u0001\u0000\u0000\u0000+,\u0007\u0006\u0000\u0000,-\u0007\n"+
		"\u0000\u0000-.\u0007\u0000\u0000\u0000./\u0007\u0004\u0000\u0000/0\u0007"+
		"\u000b\u0000\u000001\u0007\u0004\u0000\u000012\u0007\t\u0000\u00002\n"+
		"\u0001\u0000\u0000\u000037\u0003\r\u0006\u000047\u0003\u000f\u0007\u0000"+
		"57\u0005_\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0007\f"+
		"\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0007\r\u0000\u0000=\u0010"+
		"\u0001\u0000\u0000\u0000>?\u0005:\u0000\u0000?\u0012\u0001\u0000\u0000"+
		"\u0000@B\u0005\r\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CF\u0005\n\u0000\u0000DF\u0005\r\u0000"+
		"\u0000EA\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0006\t\u0000\u0000J\u0014\u0001\u0000\u0000\u0000"+
		"KM\u0007\u000e\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0006\n\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000\u0007"+
		"\u000068AEGN\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}