// Generated from /Users/paulbowler/Projects/vuexyz/grammar/Domain.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TABLE=2, VIEW=3, STRING=4, INTEGER=5, WORD=6, SEPARATOR=7, NEWLINE=8, 
		WS=9;
	public static final int
		RULE_database = 0, RULE_db_table = 1, RULE_db_attribute = 2, RULE_local_attribute = 3, 
		RULE_foreign_attribute = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"database", "db_table", "db_attribute", "local_attribute", "foreign_attribute"
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

	@Override
	public String getGrammarFileName() { return "Domain.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DomainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DatabaseContext extends ParserRuleContext {
		public List<Db_tableContext> db_table() {
			return getRuleContexts(Db_tableContext.class);
		}
		public Db_tableContext db_table(int i) {
			return getRuleContext(Db_tableContext.class,i);
		}
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				db_table();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TABLE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_tableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(DomainParser.TABLE, 0); }
		public TerminalNode WORD() { return getToken(DomainParser.WORD, 0); }
		public List<Db_attributeContext> db_attribute() {
			return getRuleContexts(Db_attributeContext.class);
		}
		public Db_attributeContext db_attribute(int i) {
			return getRuleContext(Db_attributeContext.class,i);
		}
		public Db_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_table; }
	}

	public final Db_tableContext db_table() throws RecognitionException {
		Db_tableContext _localctx = new Db_tableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_db_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(TABLE);
			setState(16);
			match(WORD);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(17);
				db_attribute();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_attributeContext extends ParserRuleContext {
		public Local_attributeContext local_attribute() {
			return getRuleContext(Local_attributeContext.class,0);
		}
		public Foreign_attributeContext foreign_attribute() {
			return getRuleContext(Foreign_attributeContext.class,0);
		}
		public Db_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_attribute; }
	}

	public final Db_attributeContext db_attribute() throws RecognitionException {
		Db_attributeContext _localctx = new Db_attributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_db_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(23);
				local_attribute();
				}
				break;
			case 2:
				{
				setState(24);
				foreign_attribute();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_attributeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(DomainParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(DomainParser.SEPARATOR, 0); }
		public TerminalNode STRING() { return getToken(DomainParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(DomainParser.INTEGER, 0); }
		public Local_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_attribute; }
	}

	public final Local_attributeContext local_attribute() throws RecognitionException {
		Local_attributeContext _localctx = new Local_attributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_local_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(WORD);
			setState(28);
			match(SEPARATOR);
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_attributeContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(DomainParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(DomainParser.WORD, i);
		}
		public Foreign_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_attribute; }
	}

	public final Foreign_attributeContext foreign_attribute() throws RecognitionException {
		Foreign_attributeContext _localctx = new Foreign_attributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_foreign_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(WORD);
			setState(32);
			match(T__0);
			setState(33);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\7\3"+
		"\25\n\3\f\3\16\3\30\13\3\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\6\7\2#\2\r\3\2\2\2\4\21\3\2\2\2\6\33"+
		"\3\2\2\2\b\35\3\2\2\2\n!\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\4\2\2\22\26\7\b\2\2"+
		"\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2"+
		"\27\5\3\2\2\2\30\26\3\2\2\2\31\34\5\b\5\2\32\34\5\n\6\2\33\31\3\2\2\2"+
		"\33\32\3\2\2\2\34\7\3\2\2\2\35\36\7\b\2\2\36\37\7\t\2\2\37 \t\2\2\2 \t"+
		"\3\2\2\2!\"\7\b\2\2\"#\7\3\2\2#$\7\b\2\2$\13\3\2\2\2\5\17\26\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}