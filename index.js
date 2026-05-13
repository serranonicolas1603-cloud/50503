import antlr4 from 'antlr4';
import fs from 'fs';

import MiniJSLexer from './generated/MiniJSLexer.js';
import MiniJSParser from './generated/MiniJSParser.js';

// Leer input
const input = fs.readFileSync('input.txt', 'utf8');

// Stream
const chars = new antlr4.InputStream(input);

// Lexer
const lexer = new MiniJSLexer(chars);

// Tokens
const tokens = new antlr4.CommonTokenStream(lexer);

tokens.fill();

// ============================
// TABLA DE TOKENS
// ============================

console.log("\n===== TABLA DE TOKENS =====\n");

tokens.tokens.forEach(token => {

    if(token.type !== -1){

        console.log(
            `Lexema: ${token.text} ---> Token: ${MiniJSLexer.symbolicNames[token.type]}`
        );
    }
});

// ============================
// PARSER
// ============================

const parser = new MiniJSParser(tokens);

parser.buildParseTrees = true;

const tree = parser.program();

// ============================
// ÁRBOL
// ============================

console.log("\n===== ARBOL SINTACTICO =====\n");

console.log(tree.toStringTree(parser.ruleNames));

// ============================
// EJECUCION
// ============================

console.log("\n===== EJECUCION =====\n");

import CustomVisitor from './CustomVisitor.js';

console.log("\n===== EJECUCION =====\n");

const visitor = new CustomVisitor();

visitor.visit(tree);