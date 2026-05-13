// Generated from MiniJS.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import MiniJSListener from './MiniJSListener.js';
import MiniJSVisitor from './MiniJSVisitor.js';

const serializedATN = [4,1,26,104,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,5,0,24,8,0,10,0,
12,0,27,9,0,1,0,1,0,1,1,1,1,1,1,3,1,34,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
2,1,3,1,3,1,3,5,3,47,8,3,10,3,12,3,50,9,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,
4,1,4,1,4,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,5,7,76,
8,7,10,7,12,7,79,9,7,1,7,1,7,1,8,1,8,1,8,3,8,86,8,8,1,9,1,9,1,9,5,9,91,8,
9,10,9,12,9,94,9,9,1,10,1,10,1,10,1,10,1,10,1,10,3,10,102,8,10,1,10,0,0,
11,0,2,4,6,8,10,12,14,16,18,20,0,2,1,0,10,14,1,0,6,9,101,0,25,1,0,0,0,2,
33,1,0,0,0,4,35,1,0,0,0,6,43,1,0,0,0,8,51,1,0,0,0,10,61,1,0,0,0,12,65,1,
0,0,0,14,73,1,0,0,0,16,82,1,0,0,0,18,87,1,0,0,0,20,101,1,0,0,0,22,24,3,2,
1,0,23,22,1,0,0,0,24,27,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,28,1,0,0,
0,27,25,1,0,0,0,28,29,5,0,0,1,29,1,1,0,0,0,30,34,3,4,2,0,31,34,3,8,4,0,32,
34,3,12,6,0,33,30,1,0,0,0,33,31,1,0,0,0,33,32,1,0,0,0,34,3,1,0,0,0,35,36,
5,1,0,0,36,37,5,24,0,0,37,38,5,5,0,0,38,39,5,19,0,0,39,40,3,6,3,0,40,41,
5,20,0,0,41,42,5,21,0,0,42,5,1,0,0,0,43,48,3,16,8,0,44,45,5,22,0,0,45,47,
3,16,8,0,46,44,1,0,0,0,47,50,1,0,0,0,48,46,1,0,0,0,48,49,1,0,0,0,49,7,1,
0,0,0,50,48,1,0,0,0,51,52,5,2,0,0,52,53,5,15,0,0,53,54,3,10,5,0,54,55,5,
21,0,0,55,56,3,16,8,0,56,57,5,21,0,0,57,58,3,10,5,0,58,59,5,16,0,0,59,60,
3,14,7,0,60,9,1,0,0,0,61,62,5,24,0,0,62,63,5,5,0,0,63,64,3,16,8,0,64,11,
1,0,0,0,65,66,5,3,0,0,66,67,5,23,0,0,67,68,5,4,0,0,68,69,5,15,0,0,69,70,
3,16,8,0,70,71,5,16,0,0,71,72,5,21,0,0,72,13,1,0,0,0,73,77,5,17,0,0,74,76,
3,2,1,0,75,74,1,0,0,0,76,79,1,0,0,0,77,75,1,0,0,0,77,78,1,0,0,0,78,80,1,
0,0,0,79,77,1,0,0,0,80,81,5,18,0,0,81,15,1,0,0,0,82,85,3,18,9,0,83,84,7,
0,0,0,84,86,3,18,9,0,85,83,1,0,0,0,85,86,1,0,0,0,86,17,1,0,0,0,87,92,3,20,
10,0,88,89,7,1,0,0,89,91,3,20,10,0,90,88,1,0,0,0,91,94,1,0,0,0,92,90,1,0,
0,0,92,93,1,0,0,0,93,19,1,0,0,0,94,92,1,0,0,0,95,102,5,24,0,0,96,102,5,25,
0,0,97,98,5,15,0,0,98,99,3,16,8,0,99,100,5,16,0,0,100,102,1,0,0,0,101,95,
1,0,0,0,101,96,1,0,0,0,101,97,1,0,0,0,102,21,1,0,0,0,7,25,33,48,77,85,92,
101];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class MiniJSParser extends antlr4.Parser {

    static grammarFileName = "MiniJS.g4";
    static literalNames = [ null, "'let'", "'for'", "'console'", "'log'", 
                            "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
                            "'<='", "'>='", "'=='", "'('", "')'", "'{'", 
                            "'}'", "'['", "']'", "';'", "','", "'.'" ];
    static symbolicNames = [ null, "LET", "FOR", "CONSOLE", "LOG", "ASSIGN", 
                             "PLUS", "MINUS", "MULT", "DIV", "LT", "GT", 
                             "LE", "GE", "EQ", "LPAREN", "RPAREN", "LBRACE", 
                             "RBRACE", "LBRACK", "RBRACK", "SEMICOLON", 
                             "COMMA", "DOT", "Identifier", "Number", "WS" ];
    static ruleNames = [ "program", "statement", "arrayDeclaration", "expressionList", 
                         "forStatement", "assignmentStatement", "consoleStatement", 
                         "block", "expression", "arithmeticExpression", 
                         "term" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = MiniJSParser.ruleNames;
        this.literalNames = MiniJSParser.literalNames;
        this.symbolicNames = MiniJSParser.symbolicNames;
    }



	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, MiniJSParser.RULE_program);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 25;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 14) !== 0)) {
	            this.state = 22;
	            this.statement();
	            this.state = 27;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 28;
	        this.match(MiniJSParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, MiniJSParser.RULE_statement);
	    try {
	        this.state = 33;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 30;
	            this.arrayDeclaration();
	            break;
	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 31;
	            this.forStatement();
	            break;
	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 32;
	            this.consoleStatement();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	arrayDeclaration() {
	    let localctx = new ArrayDeclarationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, MiniJSParser.RULE_arrayDeclaration);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 35;
	        this.match(MiniJSParser.LET);
	        this.state = 36;
	        this.match(MiniJSParser.Identifier);
	        this.state = 37;
	        this.match(MiniJSParser.ASSIGN);
	        this.state = 38;
	        this.match(MiniJSParser.LBRACK);
	        this.state = 39;
	        this.expressionList();
	        this.state = 40;
	        this.match(MiniJSParser.RBRACK);
	        this.state = 41;
	        this.match(MiniJSParser.SEMICOLON);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expressionList() {
	    let localctx = new ExpressionListContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, MiniJSParser.RULE_expressionList);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 43;
	        this.expression();
	        this.state = 48;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===22) {
	            this.state = 44;
	            this.match(MiniJSParser.COMMA);
	            this.state = 45;
	            this.expression();
	            this.state = 50;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	forStatement() {
	    let localctx = new ForStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, MiniJSParser.RULE_forStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 51;
	        this.match(MiniJSParser.FOR);
	        this.state = 52;
	        this.match(MiniJSParser.LPAREN);
	        this.state = 53;
	        this.assignmentStatement();
	        this.state = 54;
	        this.match(MiniJSParser.SEMICOLON);
	        this.state = 55;
	        this.expression();
	        this.state = 56;
	        this.match(MiniJSParser.SEMICOLON);
	        this.state = 57;
	        this.assignmentStatement();
	        this.state = 58;
	        this.match(MiniJSParser.RPAREN);
	        this.state = 59;
	        this.block();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	assignmentStatement() {
	    let localctx = new AssignmentStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, MiniJSParser.RULE_assignmentStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 61;
	        this.match(MiniJSParser.Identifier);
	        this.state = 62;
	        this.match(MiniJSParser.ASSIGN);
	        this.state = 63;
	        this.expression();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	consoleStatement() {
	    let localctx = new ConsoleStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, MiniJSParser.RULE_consoleStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 65;
	        this.match(MiniJSParser.CONSOLE);
	        this.state = 66;
	        this.match(MiniJSParser.DOT);
	        this.state = 67;
	        this.match(MiniJSParser.LOG);
	        this.state = 68;
	        this.match(MiniJSParser.LPAREN);
	        this.state = 69;
	        this.expression();
	        this.state = 70;
	        this.match(MiniJSParser.RPAREN);
	        this.state = 71;
	        this.match(MiniJSParser.SEMICOLON);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	block() {
	    let localctx = new BlockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, MiniJSParser.RULE_block);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 73;
	        this.match(MiniJSParser.LBRACE);
	        this.state = 77;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 14) !== 0)) {
	            this.state = 74;
	            this.statement();
	            this.state = 79;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 80;
	        this.match(MiniJSParser.RBRACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expression() {
	    let localctx = new ExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, MiniJSParser.RULE_expression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 82;
	        this.arithmeticExpression();
	        this.state = 85;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 31744) !== 0)) {
	            this.state = 83;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 31744) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 84;
	            this.arithmeticExpression();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	arithmeticExpression() {
	    let localctx = new ArithmeticExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, MiniJSParser.RULE_arithmeticExpression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 87;
	        this.term();
	        this.state = 92;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 960) !== 0)) {
	            this.state = 88;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 960) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 89;
	            this.term();
	            this.state = 94;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	term() {
	    let localctx = new TermContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, MiniJSParser.RULE_term);
	    try {
	        this.state = 101;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 24:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 95;
	            this.match(MiniJSParser.Identifier);
	            break;
	        case 25:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 96;
	            this.match(MiniJSParser.Number);
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 97;
	            this.match(MiniJSParser.LPAREN);
	            this.state = 98;
	            this.expression();
	            this.state = 99;
	            this.match(MiniJSParser.RPAREN);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

MiniJSParser.EOF = antlr4.Token.EOF;
MiniJSParser.LET = 1;
MiniJSParser.FOR = 2;
MiniJSParser.CONSOLE = 3;
MiniJSParser.LOG = 4;
MiniJSParser.ASSIGN = 5;
MiniJSParser.PLUS = 6;
MiniJSParser.MINUS = 7;
MiniJSParser.MULT = 8;
MiniJSParser.DIV = 9;
MiniJSParser.LT = 10;
MiniJSParser.GT = 11;
MiniJSParser.LE = 12;
MiniJSParser.GE = 13;
MiniJSParser.EQ = 14;
MiniJSParser.LPAREN = 15;
MiniJSParser.RPAREN = 16;
MiniJSParser.LBRACE = 17;
MiniJSParser.RBRACE = 18;
MiniJSParser.LBRACK = 19;
MiniJSParser.RBRACK = 20;
MiniJSParser.SEMICOLON = 21;
MiniJSParser.COMMA = 22;
MiniJSParser.DOT = 23;
MiniJSParser.Identifier = 24;
MiniJSParser.Number = 25;
MiniJSParser.WS = 26;

MiniJSParser.RULE_program = 0;
MiniJSParser.RULE_statement = 1;
MiniJSParser.RULE_arrayDeclaration = 2;
MiniJSParser.RULE_expressionList = 3;
MiniJSParser.RULE_forStatement = 4;
MiniJSParser.RULE_assignmentStatement = 5;
MiniJSParser.RULE_consoleStatement = 6;
MiniJSParser.RULE_block = 7;
MiniJSParser.RULE_expression = 8;
MiniJSParser.RULE_arithmeticExpression = 9;
MiniJSParser.RULE_term = 10;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_program;
    }

	EOF() {
	    return this.getToken(MiniJSParser.EOF, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterProgram(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitProgram(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitProgram(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_statement;
    }

	arrayDeclaration() {
	    return this.getTypedRuleContext(ArrayDeclarationContext,0);
	};

	forStatement() {
	    return this.getTypedRuleContext(ForStatementContext,0);
	};

	consoleStatement() {
	    return this.getTypedRuleContext(ConsoleStatementContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArrayDeclarationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_arrayDeclaration;
    }

	LET() {
	    return this.getToken(MiniJSParser.LET, 0);
	};

	Identifier() {
	    return this.getToken(MiniJSParser.Identifier, 0);
	};

	ASSIGN() {
	    return this.getToken(MiniJSParser.ASSIGN, 0);
	};

	LBRACK() {
	    return this.getToken(MiniJSParser.LBRACK, 0);
	};

	expressionList() {
	    return this.getTypedRuleContext(ExpressionListContext,0);
	};

	RBRACK() {
	    return this.getToken(MiniJSParser.RBRACK, 0);
	};

	SEMICOLON() {
	    return this.getToken(MiniJSParser.SEMICOLON, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterArrayDeclaration(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitArrayDeclaration(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitArrayDeclaration(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpressionListContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_expressionList;
    }

	expression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ExpressionContext,i);
	    }
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniJSParser.COMMA);
	    } else {
	        return this.getToken(MiniJSParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterExpressionList(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitExpressionList(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitExpressionList(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ForStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_forStatement;
    }

	FOR() {
	    return this.getToken(MiniJSParser.FOR, 0);
	};

	LPAREN() {
	    return this.getToken(MiniJSParser.LPAREN, 0);
	};

	assignmentStatement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AssignmentStatementContext);
	    } else {
	        return this.getTypedRuleContext(AssignmentStatementContext,i);
	    }
	};

	SEMICOLON = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniJSParser.SEMICOLON);
	    } else {
	        return this.getToken(MiniJSParser.SEMICOLON, i);
	    }
	};


	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(MiniJSParser.RPAREN, 0);
	};

	block() {
	    return this.getTypedRuleContext(BlockContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterForStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitForStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitForStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AssignmentStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_assignmentStatement;
    }

	Identifier() {
	    return this.getToken(MiniJSParser.Identifier, 0);
	};

	ASSIGN() {
	    return this.getToken(MiniJSParser.ASSIGN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterAssignmentStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitAssignmentStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitAssignmentStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConsoleStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_consoleStatement;
    }

	CONSOLE() {
	    return this.getToken(MiniJSParser.CONSOLE, 0);
	};

	DOT() {
	    return this.getToken(MiniJSParser.DOT, 0);
	};

	LOG() {
	    return this.getToken(MiniJSParser.LOG, 0);
	};

	LPAREN() {
	    return this.getToken(MiniJSParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(MiniJSParser.RPAREN, 0);
	};

	SEMICOLON() {
	    return this.getToken(MiniJSParser.SEMICOLON, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterConsoleStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitConsoleStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitConsoleStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class BlockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_block;
    }

	LBRACE() {
	    return this.getToken(MiniJSParser.LBRACE, 0);
	};

	RBRACE() {
	    return this.getToken(MiniJSParser.RBRACE, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterBlock(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitBlock(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitBlock(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_expression;
    }

	arithmeticExpression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ArithmeticExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ArithmeticExpressionContext,i);
	    }
	};

	LT() {
	    return this.getToken(MiniJSParser.LT, 0);
	};

	GT() {
	    return this.getToken(MiniJSParser.GT, 0);
	};

	LE() {
	    return this.getToken(MiniJSParser.LE, 0);
	};

	GE() {
	    return this.getToken(MiniJSParser.GE, 0);
	};

	EQ() {
	    return this.getToken(MiniJSParser.EQ, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitExpression(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitExpression(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArithmeticExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_arithmeticExpression;
    }

	term = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TermContext);
	    } else {
	        return this.getTypedRuleContext(TermContext,i);
	    }
	};

	PLUS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniJSParser.PLUS);
	    } else {
	        return this.getToken(MiniJSParser.PLUS, i);
	    }
	};


	MINUS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniJSParser.MINUS);
	    } else {
	        return this.getToken(MiniJSParser.MINUS, i);
	    }
	};


	MULT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniJSParser.MULT);
	    } else {
	        return this.getToken(MiniJSParser.MULT, i);
	    }
	};


	DIV = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(MiniJSParser.DIV);
	    } else {
	        return this.getToken(MiniJSParser.DIV, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterArithmeticExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitArithmeticExpression(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitArithmeticExpression(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TermContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = MiniJSParser.RULE_term;
    }

	Identifier() {
	    return this.getToken(MiniJSParser.Identifier, 0);
	};

	Number() {
	    return this.getToken(MiniJSParser.Number, 0);
	};

	LPAREN() {
	    return this.getToken(MiniJSParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(MiniJSParser.RPAREN, 0);
	};

	enterRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.enterTerm(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof MiniJSListener ) {
	        listener.exitTerm(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof MiniJSVisitor ) {
	        return visitor.visitTerm(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




MiniJSParser.ProgramContext = ProgramContext; 
MiniJSParser.StatementContext = StatementContext; 
MiniJSParser.ArrayDeclarationContext = ArrayDeclarationContext; 
MiniJSParser.ExpressionListContext = ExpressionListContext; 
MiniJSParser.ForStatementContext = ForStatementContext; 
MiniJSParser.AssignmentStatementContext = AssignmentStatementContext; 
MiniJSParser.ConsoleStatementContext = ConsoleStatementContext; 
MiniJSParser.BlockContext = BlockContext; 
MiniJSParser.ExpressionContext = ExpressionContext; 
MiniJSParser.ArithmeticExpressionContext = ArithmeticExpressionContext; 
MiniJSParser.TermContext = TermContext; 
