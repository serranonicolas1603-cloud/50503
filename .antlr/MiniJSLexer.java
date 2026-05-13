// Generated from c:/Windows/System32/ssl-antlr-calculator/MiniJS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniJSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, FOR=2, CONSOLE=3, LOG=4, ASSIGN=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		LT=10, GT=11, LE=12, GE=13, EQ=14, LPAREN=15, RPAREN=16, LBRACE=17, RBRACE=18, 
		LBRACK=19, RBRACK=20, SEMICOLON=21, COMMA=22, DOT=23, Identifier=24, Number=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "FOR", "CONSOLE", "LOG", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", 
			"LT", "GT", "LE", "GE", "EQ", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMICOLON", "COMMA", "DOT", "Identifier", "Number", 
			"WS"
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


	public MiniJSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJS.g4"; }

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
		"\u0004\u0000\u001a\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017u\b\u0017\n\u0017"+
		"\f\u0017x\t\u0017\u0001\u0018\u0004\u0018{\b\u0018\u000b\u0018\f\u0018"+
		"|\u0001\u0019\u0004\u0019\u0080\b\u0019\u000b\u0019\f\u0019\u0081\u0001"+
		"\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t"+
		"\n\r\r  \u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00039\u0001"+
		"\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007E\u0001\u0000\u0000"+
		"\u0000\tI\u0001\u0000\u0000\u0000\u000bK\u0001\u0000\u0000\u0000\rM\u0001"+
		"\u0000\u0000\u0000\u000fO\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000"+
		"\u0000\u0013S\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017"+
		"W\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000\u0000\u001b]\u0001"+
		"\u0000\u0000\u0000\u001d`\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000"+
		"\u0000!d\u0001\u0000\u0000\u0000#f\u0001\u0000\u0000\u0000%h\u0001\u0000"+
		"\u0000\u0000\'j\u0001\u0000\u0000\u0000)l\u0001\u0000\u0000\u0000+n\u0001"+
		"\u0000\u0000\u0000-p\u0001\u0000\u0000\u0000/r\u0001\u0000\u0000\u0000"+
		"1z\u0001\u0000\u0000\u00003\u007f\u0001\u0000\u0000\u000056\u0005l\u0000"+
		"\u000067\u0005e\u0000\u000078\u0005t\u0000\u00008\u0002\u0001\u0000\u0000"+
		"\u00009:\u0005f\u0000\u0000:;\u0005o\u0000\u0000;<\u0005r\u0000\u0000"+
		"<\u0004\u0001\u0000\u0000\u0000=>\u0005c\u0000\u0000>?\u0005o\u0000\u0000"+
		"?@\u0005n\u0000\u0000@A\u0005s\u0000\u0000AB\u0005o\u0000\u0000BC\u0005"+
		"l\u0000\u0000CD\u0005e\u0000\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005"+
		"l\u0000\u0000FG\u0005o\u0000\u0000GH\u0005g\u0000\u0000H\b\u0001\u0000"+
		"\u0000\u0000IJ\u0005=\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005+"+
		"\u0000\u0000L\f\u0001\u0000\u0000\u0000MN\u0005-\u0000\u0000N\u000e\u0001"+
		"\u0000\u0000\u0000OP\u0005*\u0000\u0000P\u0010\u0001\u0000\u0000\u0000"+
		"QR\u0005/\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005<\u0000\u0000"+
		"T\u0014\u0001\u0000\u0000\u0000UV\u0005>\u0000\u0000V\u0016\u0001\u0000"+
		"\u0000\u0000WX\u0005<\u0000\u0000XY\u0005=\u0000\u0000Y\u0018\u0001\u0000"+
		"\u0000\u0000Z[\u0005>\u0000\u0000[\\\u0005=\u0000\u0000\\\u001a\u0001"+
		"\u0000\u0000\u0000]^\u0005=\u0000\u0000^_\u0005=\u0000\u0000_\u001c\u0001"+
		"\u0000\u0000\u0000`a\u0005(\u0000\u0000a\u001e\u0001\u0000\u0000\u0000"+
		"bc\u0005)\u0000\u0000c \u0001\u0000\u0000\u0000de\u0005{\u0000\u0000e"+
		"\"\u0001\u0000\u0000\u0000fg\u0005}\u0000\u0000g$\u0001\u0000\u0000\u0000"+
		"hi\u0005[\u0000\u0000i&\u0001\u0000\u0000\u0000jk\u0005]\u0000\u0000k"+
		"(\u0001\u0000\u0000\u0000lm\u0005;\u0000\u0000m*\u0001\u0000\u0000\u0000"+
		"no\u0005,\u0000\u0000o,\u0001\u0000\u0000\u0000pq\u0005.\u0000\u0000q"+
		".\u0001\u0000\u0000\u0000rv\u0007\u0000\u0000\u0000su\u0007\u0001\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w0\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000y{\u0007\u0002\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}2\u0001\u0000\u0000\u0000~\u0080\u0007\u0003\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0019\u0000\u0000\u00844\u0001"+
		"\u0000\u0000\u0000\u0004\u0000v|\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}