// Generated from Domain.g4 by ANTLR 4.12.0
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
		TABLE=1, VIEW=2, STRING=3, INTEGER=4, WORD=5, SEPARATOR=6, NEWLINE=7, 
		WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TABLE", "VIEW", "STRING", "INTEGER", "WORD", "LOWERCASE", "UPPERCASE", 
			"SEPARATOR", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TABLE", "VIEW", "STRING", "INTEGER", "WORD", "SEPARATOR", "NEWLINE", 
			"WS"
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
		"\u0004\u0000\bN\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u00043\b\u0004\u000b\u0004\f\u0004"+
		"4\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0003\b>\b\b\u0001\b\u0001\b\u0004\bB\b\b\u000b\b\f\bC\u0001"+
		"\b\u0001\b\u0001\t\u0004\tI\b\t\u000b\t\f\tJ\u0001\t\u0001\t\u0000\u0000"+
		"\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0000"+
		"\r\u0000\u000f\u0006\u0011\u0007\u0013\b\u0001\u0000\u000f\u0002\u0000"+
		"TTtt\u0002\u0000AAaa\u0002\u0000BBbb\u0002\u0000LLll\u0002\u0000EEee\u0002"+
		"\u0000VVvv\u0002\u0000IIii\u0002\u0000WWww\u0002\u0000SSss\u0002\u0000"+
		"RRrr\u0002\u0000NNnn\u0002\u0000GGgg\u0001\u0000az\u0001\u0000AZ\u0002"+
		"\u0000\t\t  R\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000"+
		"\u0000\u0005 \u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000"+
		"\t2\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r8\u0001\u0000"+
		"\u0000\u0000\u000f:\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000"+
		"\u0013H\u0001\u0000\u0000\u0000\u0015\u0016\u0007\u0000\u0000\u0000\u0016"+
		"\u0017\u0007\u0001\u0000\u0000\u0017\u0018\u0007\u0002\u0000\u0000\u0018"+
		"\u0019\u0007\u0003\u0000\u0000\u0019\u001a\u0007\u0004\u0000\u0000\u001a"+
		"\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0005\u0000\u0000\u001c"+
		"\u001d\u0007\u0006\u0000\u0000\u001d\u001e\u0007\u0004\u0000\u0000\u001e"+
		"\u001f\u0007\u0007\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000 !\u0007"+
		"\b\u0000\u0000!\"\u0007\u0000\u0000\u0000\"#\u0007\t\u0000\u0000#$\u0007"+
		"\u0006\u0000\u0000$%\u0007\n\u0000\u0000%&\u0007\u000b\u0000\u0000&\u0006"+
		"\u0001\u0000\u0000\u0000\'(\u0007\u0006\u0000\u0000()\u0007\n\u0000\u0000"+
		")*\u0007\u0000\u0000\u0000*+\u0007\u0004\u0000\u0000+,\u0007\u000b\u0000"+
		"\u0000,-\u0007\u0004\u0000\u0000-.\u0007\t\u0000\u0000.\b\u0001\u0000"+
		"\u0000\u0000/3\u0003\u000b\u0005\u000003\u0003\r\u0006\u000013\u0005_"+
		"\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\n\u0001\u0000\u0000\u000067\u0007\f\u0000"+
		"\u00007\f\u0001\u0000\u0000\u000089\u0007\r\u0000\u00009\u000e\u0001\u0000"+
		"\u0000\u0000:;\u0005:\u0000\u0000;\u0010\u0001\u0000\u0000\u0000<>\u0005"+
		"\r\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?B\u0005\n\u0000\u0000@B\u0005\r\u0000\u0000A=\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0006\b\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GI\u0007\u000e"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0006\t\u0000\u0000M\u0014\u0001\u0000\u0000\u0000\u0007\u000024=A"+
		"CJ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}