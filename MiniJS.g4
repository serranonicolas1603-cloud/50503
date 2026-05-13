grammar MiniJS;

// ---------------- PARSER RULES ----------------

program
    : statement* EOF
    ;

statement
    : arrayDeclaration
    | forStatement
    | consoleStatement
    ;

arrayDeclaration
    : LET Identifier ASSIGN LBRACK expressionList RBRACK SEMICOLON
    ;

expressionList
    : expression (COMMA expression)*
    ;

forStatement
    : FOR LPAREN assignmentStatement SEMICOLON expression SEMICOLON assignmentStatement RPAREN block
    ;

assignmentStatement
    : Identifier ASSIGN expression
    ;

consoleStatement
    : CONSOLE DOT LOG LPAREN expression RPAREN SEMICOLON
    ;

block
    : LBRACE statement* RBRACE
    ;

expression
    : arithmeticExpression ((LT | GT | LE | GE | EQ) arithmeticExpression)? 
    ;
arithmeticExpression
    : term ((PLUS | MINUS | MULT | DIV) term)*
    ;

term
    : Identifier
    | Number
    | LPAREN expression RPAREN
    ;

// ---------------- LEXER RULES ----------------

LET         : 'let';
FOR         : 'for';
CONSOLE     : 'console';
LOG         : 'log';

ASSIGN      : '=';
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
LT          : '<';
GT          : '>';
LE          :'<=';
GE          :'>=';
EQ          :'==';

LPAREN      : '(';
RPAREN      : ')';

LBRACE      : '{';
RBRACE      : '}';

LBRACK      : '[';
RBRACK      : ']';

SEMICOLON   : ';';
COMMA       : ',';
DOT         : '.';

Identifier
    : [a-zA-Z] [a-zA-Z0-9_]*
    ;

Number
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;