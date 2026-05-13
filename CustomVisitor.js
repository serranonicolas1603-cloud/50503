import MiniJSVisitor from './generated/MiniJSVisitor.js';

export default class CustomVisitor extends MiniJSVisitor {

    constructor() {
        super();

        this.memory = {};
    }

    visitArrayDeclaration(ctx) {

        const id = ctx.Identifier().getText();

        const expressions = ctx.expressionList().expression();

        const values = expressions.map(exp => this.visit(exp));

        this.memory[id] = values;

        return null;
    }

    visitAssignmentStatement(ctx) {

        const id = ctx.Identifier().getText();

        const value = this.visit(ctx.expression());

        this.memory[id] = value;

        return value;
    }

    visitConsoleStatement(ctx) {

        const value = this.visit(ctx.expression());

        console.log(value);

        return null;
    }

    visitBlock(ctx) {

        for(const stmt of ctx.statement()) {

            this.visit(stmt);
        }

        return null;
    }

    visitForStatement(ctx) {

        this.visit(ctx.assignmentStatement(0));

        while(this.visit(ctx.expression())) {

            this.visit(ctx.block());

            this.visit(ctx.assignmentStatement(1));
        }

        return null;
    }

    visitExpression(ctx) {

        if(ctx.arithmeticExpression().length > 1) {

            const left = this.visit(ctx.arithmeticExpression(0));

            const right = this.visit(ctx.arithmeticExpression(1));

            if(ctx.LT()) return left < right;

            if(ctx.GT()) return left > right;

            if(ctx.LE()) return left <= right;

            if(ctx.GE()) return left >= right;

            if(ctx.EQ()) return left == right;
        }

        return this.visit(ctx.arithmeticExpression(0));
    }

    visitArithmeticExpression(ctx) {

        let result = this.visit(ctx.term(0));

        for(let i = 1; i < ctx.term().length; i++) {

            const right = this.visit(ctx.term(i));

            const operator = ctx.getChild(2*i - 1).getText();

            switch(operator) {

                case '+':
                    result += right;
                    break;

                case '-':
                    result -= right;
                    break;

                case '*':
                    result *= right;
                    break;

                case '/':
                    result /= right;
                    break;
            }
        }

        return result;
    }

    visitTerm(ctx) {

        if(ctx.Number()) {

            return Number(ctx.Number().getText());
        }

        if(ctx.Identifier()) {

            const id = ctx.Identifier().getText();

            return this.memory[id];
        }

        return this.visit(ctx.expression());
    }
}