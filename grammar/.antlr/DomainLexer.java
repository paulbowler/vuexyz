// Generated from /Users/paulbowler/Projects/vuexyz/grammar/Domain.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u0085\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\6\26p\n\26\r\26\16\26q\3\27\5\27u\n\27\3\27\3\27\6\27y\n\27\r\27\16\27"+
		"z\3\27\3\27\3\30\6\30\u0080\n\30\r\30\16\30\u0081\3\30\3\30\2\2\31\3\2"+
		"\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\3\37\4!\5"+
		"#\6%\2\'\2)\7+\b-\t/\n\3\2\22\4\2FFff\4\2QQqq\4\2OOoo\4\2CCcc\4\2KKkk"+
		"\4\2PPpp\4\2UUuu\4\2VVvv\4\2TTtt\4\2IIii\4\2GGgg\4\2XXxx\4\2YYyy\3\2c"+
		"|\3\2C\\\4\2\13\13\"\"\2|\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2"+
		"\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?"+
		"\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35"+
		"K\3\2\2\2\37R\3\2\2\2!W\3\2\2\2#^\3\2\2\2%f\3\2\2\2\'h\3\2\2\2)j\3\2\2"+
		"\2+o\3\2\2\2-x\3\2\2\2/\177\3\2\2\2\61\62\t\2\2\2\62\4\3\2\2\2\63\64\t"+
		"\3\2\2\64\6\3\2\2\2\65\66\t\4\2\2\66\b\3\2\2\2\678\t\5\2\28\n\3\2\2\2"+
		"9:\t\6\2\2:\f\3\2\2\2;<\t\7\2\2<\16\3\2\2\2=>\t\b\2\2>\20\3\2\2\2?@\t"+
		"\t\2\2@\22\3\2\2\2AB\t\n\2\2B\24\3\2\2\2CD\t\13\2\2D\26\3\2\2\2EF\t\f"+
		"\2\2F\30\3\2\2\2GH\t\r\2\2H\32\3\2\2\2IJ\t\16\2\2J\34\3\2\2\2KL\5\3\2"+
		"\2LM\5\5\3\2MN\5\7\4\2NO\5\t\5\2OP\5\13\6\2PQ\5\r\7\2Q\36\3\2\2\2RS\5"+
		"\31\r\2ST\5\13\6\2TU\5\27\f\2UV\5\33\16\2V \3\2\2\2WX\5\17\b\2XY\5\21"+
		"\t\2YZ\5\23\n\2Z[\5\13\6\2[\\\5\r\7\2\\]\5\25\13\2]\"\3\2\2\2^_\5\13\6"+
		"\2_`\5\r\7\2`a\5\21\t\2ab\5\27\f\2bc\5\25\13\2cd\5\27\f\2de\5\23\n\2e"+
		"$\3\2\2\2fg\t\17\2\2g&\3\2\2\2hi\t\20\2\2i(\3\2\2\2jk\7<\2\2k*\3\2\2\2"+
		"lp\5%\23\2mp\5\'\24\2np\7a\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2r,\3\2\2\2su\7\17\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2"+
		"\2vy\7\f\2\2wy\7\17\2\2xt\3\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{|\3\2\2\2|}\b\27\2\2}.\3\2\2\2~\u0080\t\21\2\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\b\30\2\2\u0084\60\3\2\2\2\t\2oqtxz\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}