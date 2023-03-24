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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nP\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6\65\n\6\r\6\16\6"+
		"\66\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n@\n\n\3\n\3\n\6\nD\n\n\r\n\16\nE\3"+
		"\n\3\n\3\13\6\13K\n\13\r\13\16\13L\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13"+
		"\7\r\2\17\2\21\b\23\t\25\n\3\2\21\4\2VVvv\4\2CCcc\4\2DDdd\4\2NNnn\4\2"+
		"GGgg\4\2XXxx\4\2KKkk\4\2YYyy\4\2UUuu\4\2TTtt\4\2PPpp\4\2IIii\3\2c|\3\2"+
		"C\\\4\2\13\13\"\"\2T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\35\3"+
		"\2\2\2\7\"\3\2\2\2\t)\3\2\2\2\13\64\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21"+
		"<\3\2\2\2\23C\3\2\2\2\25J\3\2\2\2\27\30\t\2\2\2\30\31\t\3\2\2\31\32\t"+
		"\4\2\2\32\33\t\5\2\2\33\34\t\6\2\2\34\4\3\2\2\2\35\36\t\7\2\2\36\37\t"+
		"\b\2\2\37 \t\6\2\2 !\t\t\2\2!\6\3\2\2\2\"#\t\n\2\2#$\t\2\2\2$%\t\13\2"+
		"\2%&\t\b\2\2&\'\t\f\2\2\'(\t\r\2\2(\b\3\2\2\2)*\t\b\2\2*+\t\f\2\2+,\t"+
		"\2\2\2,-\t\6\2\2-.\t\r\2\2./\t\6\2\2/\60\t\13\2\2\60\n\3\2\2\2\61\65\5"+
		"\r\7\2\62\65\5\17\b\2\63\65\7a\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\f\3\2\2\289\t\16\2"+
		"\29\16\3\2\2\2:;\t\17\2\2;\20\3\2\2\2<=\7<\2\2=\22\3\2\2\2>@\7\17\2\2"+
		"?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AD\7\f\2\2BD\7\17\2\2C?\3\2\2\2CB\3\2\2"+
		"\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\b\n\2\2H\24\3\2\2\2IK\t\20"+
		"\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\13\2\2O\26"+
		"\3\2\2\2\t\2\64\66?CEL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}