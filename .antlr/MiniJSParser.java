// Generated from c:/Windows/System32/ssl-antlr-calculator/MiniJS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, FOR=2, CONSOLE=3, LOG=4, ASSIGN=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		LT=10, GT=11, LE=12, GE=13, EQ=14, LPAREN=15, RPAREN=16, LBRACE=17, RBRACE=18, 
		LBRACK=19, RBRACK=20, SEMICOLON=21, COMMA=22, DOT=23, Identifier=24, Number=25, 
		WS=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_arrayDeclaration = 2, RULE_expressionList = 3, 
		RULE_forStatement = 4, RULE_assignmentStatement = 5, RULE_consoleStatement = 6, 
		RULE_block = 7, RULE_expression = 8, RULE_arithmeticExpression = 9, RULE_term = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "arrayDeclaration", "expressionList", "forStatement", 
			"assignmentStatement", "consoleStatement", "block", "expression", "arithmeticExpression", 
			"term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'for'", "'console'", "'log'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "FOR", "CONSOLE", "LOG", "ASSIGN", "PLUS", "MINUS", "MULT", 
			"DIV", "LT", "GT", "LE", "GE", "EQ", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMICOLON", "COMMA", "DOT", "Identifier", "Number", 
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

	@Override
	public String getGrammarFileName() { return "MiniJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniJSParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ConsoleStatementContext consoleStatement() {
			return getRuleContext(ConsoleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				arrayDeclaration();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				forStatement();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				consoleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(MiniJSParser.LET, 0); }
		public TerminalNode Identifier() { return getToken(MiniJSParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJSParser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJSParser.LBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(MiniJSParser.RBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJSParser.SEMICOLON, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LET);
			setState(36);
			match(Identifier);
			setState(37);
			match(ASSIGN);
			setState(38);
			match(LBRACK);
			setState(39);
			expressionList();
			setState(40);
			match(RBRACK);
			setState(41);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJSParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			expression();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(44);
				match(COMMA);
				setState(45);
				expression();
				}
				}
				setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniJSParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJSParser.LPAREN, 0); }
		public List<AssignmentStatementContext> assignmentStatement() {
			return getRuleContexts(AssignmentStatementContext.class);
		}
		public AssignmentStatementContext assignmentStatement(int i) {
			return getRuleContext(AssignmentStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniJSParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniJSParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJSParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(FOR);
			setState(52);
			match(LPAREN);
			setState(53);
			assignmentStatement();
			setState(54);
			match(SEMICOLON);
			setState(55);
			expression();
			setState(56);
			match(SEMICOLON);
			setState(57);
			assignmentStatement();
			setState(58);
			match(RPAREN);
			setState(59);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJSParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJSParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Identifier);
			setState(62);
			match(ASSIGN);
			setState(63);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(MiniJSParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(MiniJSParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(MiniJSParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJSParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJSParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJSParser.SEMICOLON, 0); }
		public ConsoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleStatement; }
	}

	public final ConsoleStatementContext consoleStatement() throws RecognitionException {
		ConsoleStatementContext _localctx = new ConsoleStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_consoleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(CONSOLE);
			setState(66);
			match(DOT);
			setState(67);
			match(LOG);
			setState(68);
			match(LPAREN);
			setState(69);
			expression();
			setState(70);
			match(RPAREN);
			setState(71);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniJSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJSParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LBRACE);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(MiniJSParser.LT, 0); }
		public TerminalNode GT() { return getToken(MiniJSParser.GT, 0); }
		public TerminalNode LE() { return getToken(MiniJSParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniJSParser.GE, 0); }
		public TerminalNode EQ() { return getToken(MiniJSParser.EQ, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			arithmeticExpression();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) {
				{
				setState(83);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(84);
				arithmeticExpression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MiniJSParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiniJSParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MiniJSParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MiniJSParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(MiniJSParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(MiniJSParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MiniJSParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MiniJSParser.DIV, i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			term();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				term();
				}
				}
				setState(94);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJSParser.Identifier, 0); }
		public TerminalNode Number() { return getToken(MiniJSParser.Number, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJSParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJSParser.RPAREN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(Identifier);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(Number);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(LPAREN);
				setState(98);
				expression();
				setState(99);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u001ah\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u0003"+
		"2\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007L\b\u0007\n\u0007\f\u0007O\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bV\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t[\b\t\n\t\f\t^\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nf\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\n\u000e\u0001\u0000"+
		"\u0006\te\u0000\u0019\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004#\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\b"+
		"3\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000"+
		"\u0000\u000eI\u0001\u0000\u0000\u0000\u0010R\u0001\u0000\u0000\u0000\u0012"+
		"W\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016\u0018\u0003"+
		"\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001"+
		"\u0000\u0000\u0000\u001e\"\u0003\u0004\u0002\u0000\u001f\"\u0003\b\u0004"+
		"\u0000 \"\u0003\f\u0006\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000"+
		"\u0000#$\u0005\u0001\u0000\u0000$%\u0005\u0018\u0000\u0000%&\u0005\u0005"+
		"\u0000\u0000&\'\u0005\u0013\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0005"+
		"\u0014\u0000\u0000)*\u0005\u0015\u0000\u0000*\u0005\u0001\u0000\u0000"+
		"\u0000+0\u0003\u0010\b\u0000,-\u0005\u0016\u0000\u0000-/\u0003\u0010\b"+
		"\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001\u0007\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u000045\u0005\u000f\u0000"+
		"\u000056\u0003\n\u0005\u000067\u0005\u0015\u0000\u000078\u0003\u0010\b"+
		"\u000089\u0005\u0015\u0000\u00009:\u0003\n\u0005\u0000:;\u0005\u0010\u0000"+
		"\u0000;<\u0003\u000e\u0007\u0000<\t\u0001\u0000\u0000\u0000=>\u0005\u0018"+
		"\u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0003\u0010\b\u0000@\u000b\u0001"+
		"\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000BC\u0005\u0017\u0000\u0000"+
		"CD\u0005\u0004\u0000\u0000DE\u0005\u000f\u0000\u0000EF\u0003\u0010\b\u0000"+
		"FG\u0005\u0010\u0000\u0000GH\u0005\u0015\u0000\u0000H\r\u0001\u0000\u0000"+
		"\u0000IM\u0005\u0011\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u0012\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RU\u0003\u0012"+
		"\t\u0000ST\u0007\u0000\u0000\u0000TV\u0003\u0012\t\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0011\u0001\u0000\u0000\u0000"+
		"W\\\u0003\u0014\n\u0000XY\u0007\u0001\u0000\u0000Y[\u0003\u0014\n\u0000"+
		"ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u0013\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_f\u0005\u0018\u0000\u0000`f\u0005\u0019\u0000\u0000"+
		"ab\u0005\u000f\u0000\u0000bc\u0003\u0010\b\u0000cd\u0005\u0010\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000"+
		"\u0000ea\u0001\u0000\u0000\u0000f\u0015\u0001\u0000\u0000\u0000\u0007"+
		"\u0019!0MU\\e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}