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
		DOMAIN=1, VIEW=2, STRING=3, INTEGER=4, SEPERATOR=5, WORD=6, NEWLINE=7, 
		WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"D", "O", "M", "A", "I", "N", "S", "T", "R", "G", "E", "V", "W", "DOMAIN", 
			"VIEW", "STRING", "INTEGER", "LOWERCASE", "UPPERCASE", "SEPERATOR", "WORD", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOMAIN", "VIEW", "STRING", "INTEGER", "SEPERATOR", "WORD", "NEWLINE", 
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
		"\u0004\u0000\b\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014n\b\u0014\u000b\u0014\f\u0014o\u0001\u0015\u0003\u0015"+
		"s\b\u0015\u0001\u0015\u0001\u0015\u0004\u0015w\b\u0015\u000b\u0015\f\u0015"+
		"x\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016~\b\u0016\u000b\u0016"+
		"\f\u0016\u007f\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0000\u0003"+
		"\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000"+
		"\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0001"+
		"\u001d\u0002\u001f\u0003!\u0004#\u0000%\u0000\'\u0005)\u0006+\u0007-\b"+
		"\u0001\u0000\u0010\u0002\u0000DDdd\u0002\u0000OOoo\u0002\u0000MMmm\u0002"+
		"\u0000AAaa\u0002\u0000IIii\u0002\u0000NNnn\u0002\u0000SSss\u0002\u0000"+
		"TTtt\u0002\u0000RRrr\u0002\u0000GGgg\u0002\u0000EEee\u0002\u0000VVvv\u0002"+
		"\u0000WWww\u0001\u0000az\u0001\u0000AZ\u0002\u0000\t\t  z\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u0003"+
		"1\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075\u0001"+
		"\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000"+
		"\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011"+
		"?\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001"+
		"\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000"+
		"\u0000\u001bI\u0001\u0000\u0000\u0000\u001dP\u0001\u0000\u0000\u0000\u001f"+
		"U\u0001\u0000\u0000\u0000!\\\u0001\u0000\u0000\u0000#d\u0001\u0000\u0000"+
		"\u0000%f\u0001\u0000\u0000\u0000\'h\u0001\u0000\u0000\u0000)m\u0001\u0000"+
		"\u0000\u0000+v\u0001\u0000\u0000\u0000-}\u0001\u0000\u0000\u0000/0\u0007"+
		"\u0000\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0007\u0001\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u000034\u0007\u0002\u0000\u00004\u0006"+
		"\u0001\u0000\u0000\u000056\u0007\u0003\u0000\u00006\b\u0001\u0000\u0000"+
		"\u000078\u0007\u0004\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0007\u0005"+
		"\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0007\u0006\u0000\u0000<\u000e"+
		"\u0001\u0000\u0000\u0000=>\u0007\u0007\u0000\u0000>\u0010\u0001\u0000"+
		"\u0000\u0000?@\u0007\b\u0000\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0007"+
		"\t\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0007\n\u0000\u0000D\u0016"+
		"\u0001\u0000\u0000\u0000EF\u0007\u000b\u0000\u0000F\u0018\u0001\u0000"+
		"\u0000\u0000GH\u0007\f\u0000\u0000H\u001a\u0001\u0000\u0000\u0000IJ\u0003"+
		"\u0001\u0000\u0000JK\u0003\u0003\u0001\u0000KL\u0003\u0005\u0002\u0000"+
		"LM\u0003\u0007\u0003\u0000MN\u0003\t\u0004\u0000NO\u0003\u000b\u0005\u0000"+
		"O\u001c\u0001\u0000\u0000\u0000PQ\u0003\u0017\u000b\u0000QR\u0003\t\u0004"+
		"\u0000RS\u0003\u0015\n\u0000ST\u0003\u0019\f\u0000T\u001e\u0001\u0000"+
		"\u0000\u0000UV\u0003\r\u0006\u0000VW\u0003\u000f\u0007\u0000WX\u0003\u0011"+
		"\b\u0000XY\u0003\t\u0004\u0000YZ\u0003\u000b\u0005\u0000Z[\u0003\u0013"+
		"\t\u0000[ \u0001\u0000\u0000\u0000\\]\u0003\t\u0004\u0000]^\u0003\u000b"+
		"\u0005\u0000^_\u0003\u000f\u0007\u0000_`\u0003\u0015\n\u0000`a\u0003\u0013"+
		"\t\u0000ab\u0003\u0015\n\u0000bc\u0003\u0011\b\u0000c\"\u0001\u0000\u0000"+
		"\u0000de\u0007\r\u0000\u0000e$\u0001\u0000\u0000\u0000fg\u0007\u000e\u0000"+
		"\u0000g&\u0001\u0000\u0000\u0000hi\u0005:\u0000\u0000i(\u0001\u0000\u0000"+
		"\u0000jn\u0003#\u0011\u0000kn\u0003%\u0012\u0000ln\u0005_\u0000\u0000"+
		"mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000p*\u0001\u0000\u0000\u0000qs\u0005\r\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0005"+
		"\n\u0000\u0000uw\u0005\r\u0000\u0000vr\u0001\u0000\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\u0015\u0000"+
		"\u0000{,\u0001\u0000\u0000\u0000|~\u0007\u000f\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0006\u0016\u0000\u0000\u0082.\u0001\u0000\u0000\u0000\u0007"+
		"\u0000morvx\u007f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}