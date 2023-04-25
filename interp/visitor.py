from dist.LogoTomaVisitor import LogoTomaVisitor
from dist.LogoTomaParser import LogoTomaParser
from interp.kosmotoma import KosmoToma

from interp.debugger import debug
from interp.objects.types.float import Float_

from interp.objects.types.integer import Integer_
from interp.objects.types.string import String_
from interp.objects.types.bool import Bool_

class Visitor(LogoTomaVisitor):

    def __init__(self, cmd: KosmoToma):
        super().__init__()
        self.cmd = cmd

    # Visit a parse tree produced by LogoTomaParser#program.
    def visitProgram(self, ctx:LogoTomaParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#line.
    def visitLine(self, ctx:LogoTomaParser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#command.
    def visitCommand(self, ctx:LogoTomaParser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#engine.
    def visitEngine(self, ctx:LogoTomaParser.EngineContext):
        if str(ctx.children[1]) == 'on':
            self.cmd.makolot.enable_engine()
        elif str(ctx.children[1]) == 'off':
            self.cmd.makolot.disable_engine()


    # Visit a parse tree produced by LogoTomaParser#wheel.
    def visitWheel(self, ctx:LogoTomaParser.WheelContext):
        if str(ctx.children[1]) == 'right':
            print('setting right')
            self.cmd.makolot.set_wheel_state('right')
        elif str(ctx.children[1]) == 'left':
            print('setting left')
            self.cmd.makolot.set_wheel_state('left')
        elif str(ctx.children[1]) == 'off':
            print('turning off')
            self.cmd.makolot.set_wheel_state('off')


    # Visit a parse tree produced by LogoTomaParser#spray.
    def visitSpray(self, ctx:LogoTomaParser.SprayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#spray_color.
    def visitSpray_color(self, ctx:LogoTomaParser.Spray_colorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#spray_size.
    def visitSpray_size(self, ctx:LogoTomaParser.Spray_sizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#sleep.
    def visitSleep(self, ctx:LogoTomaParser.SleepContext):
        self.cmd.sleep(self.visit(ctx.expression()))


    # Visit a parse tree produced by LogoTomaParser#cast.
    def visitCast(self, ctx:LogoTomaParser.CastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#object.
    def visitObject(self, ctx:LogoTomaParser.ObjectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#assign.
    def visitAssign(self, ctx:LogoTomaParser.AssignContext):
        self.cmd.env.set_global_variable(ctx.identifier().getText(), self.visit(ctx.value()))

    # Visit a parse tree produced by LogoTomaParser#deref.
    def visitDeref(self, ctx:LogoTomaParser.DerefContext):
        return self.cmd.env.get_global_value(self.visit(ctx.identifier()))


    # Visit a parse tree produced by LogoTomaParser#save.
    def visitSave(self, ctx:LogoTomaParser.SaveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#color.
    def visitColor(self, ctx:LogoTomaParser.ColorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#type_name.
    def visitType_name(self, ctx:LogoTomaParser.Type_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#value.
    def visitValue(self, ctx:LogoTomaParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#ife.
    def visitIfe(self, ctx:LogoTomaParser.IfeContext):
        val = self.visit(ctx.logic_expression())
        if val:
            self.visit(ctx.block())
        elif ctx.elsee() is not None:
            self.visit(ctx.elsee()) 

    # Visit a parse tree produced by LogoTomaParser#loope.
    def visitLoope(self, ctx:LogoTomaParser.LoopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#whilee.
    def visitWhilee(self, ctx:LogoTomaParser.WhileeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#elsee.
    def visitElsee(self, ctx:LogoTomaParser.ElseeContext):
        self.visit(ctx.block())


    # Visit a parse tree produced by LogoTomaParser#signExpression.
    def visitSignExpression(self, ctx:LogoTomaParser.SignExpressionContext):
        value = None
        if ctx.expression() is not None:
            value = self.visit(ctx.expression())
        else:
            value = self.visitChildren(ctx)

        if ctx.SIGN_OPERATORS() is not None and str(ctx.SIGN_OPERATORS()[-1]) == '-':
            return value * -1
        else:
            return value


    # Visit a parse tree produced by LogoTomaParser#multiplyingExpression.
    def visitMultiplyingExpression(self, ctx:LogoTomaParser.MultiplyingExpressionContext):
        l = self.visit(ctx.signExpression(0))
        for i, op in enumerate(ctx.MULTIPLYING_OPERATORS()):
            op = str(op)
            if op == '*':
                l = l * self.visit(ctx.signExpression(i+1))
            elif op == '/':
                if type(l) == type(1) and type(self.visit(ctx.signExpression(i+1))) == type(1):
                    l = l // self.visit(ctx.signExpression(i+1))
                else:
                    l = l / self.visit(ctx.signExpression(i+1))
            elif op == '%':
                l = l % self.visit(ctx.signExpression(i+1))
        return l


    # Visit a parse tree produced by LogoTomaParser#expression.
    def visitExpression(self, ctx:LogoTomaParser.ExpressionContext):
        l = self.visit(ctx.multiplyingExpression(0))
        for i, op in enumerate(ctx.SIGN_OPERATORS()):
            op = str(op)
            if op == '+':
                l = l + self.visit(ctx.multiplyingExpression(i+1))
            elif op == '-':
                l = l - self.visit(ctx.multiplyingExpression(i+1))
        debug.log("Expression: " + str(l))
        return l


    # Visit a parse tree produced by LogoTomaParser#logicBit.
    def visitLogicBit(self, ctx:LogoTomaParser.LogicBitContext):
        negate = False
        value = None

        if ctx.NEGATION_OPERATOR() is not None:
            negate = True

        if ctx.logic_expression() is not None:
            value = self.visit(ctx.logic_expression())
            if negate:
                return not value
            else:
                return value
        else:
            value = self.visitChildren(ctx)
            debug.log(f'LogicBit: {value} | {type(value)}')
            if negate:
                return not value
            else:
                return value
        
        

    # Visit a parse tree produced by LogoTomaParser#comparisonExpression.
    def visitComparisonExpression(self, ctx:LogoTomaParser.ComparisonExpressionContext):
        op = str(ctx.COMPARISON_OPERATORS())
        condition = None
        
        if ctx.COMPARISON_OPERATORS is None:
            condition = self.visit(ctx.logicBit(0))
        elif op == '>=':
            condition = self.visit(ctx.logicBit(0)) >= self.visit(ctx.logicBit(1))
        elif op == '<=':
            condition = self.visit(ctx.logicBit(0)) <= self.visit(ctx.logicBit(1))
        elif op == '>':
            condition = self.visit(ctx.logicBit(0)) > self.visit(ctx.logicBit(1))
        elif op == '<':
            condition = self.visit(ctx.logicBit(0)) < self.visit(ctx.logicBit(1))
        elif op == '==':
            condition = self.visit(ctx.logicBit(0)) == self.visit(ctx.logicBit(1))
        return condition


    # Visit a parse tree produced by LogoTomaParser#logic_expression.
    def visitLogic_expression(self, ctx:LogoTomaParser.Logic_expressionContext):
        value = bool(self.visit(ctx.comparisonExpression(0)))
        if len(ctx.comparisonExpression()) > 1:
            for index, i in enumerate(ctx.comparisonExpression()[1:]):
                operator = self.visit(ctx.LOGIC_OPERATORS(index - 1))
                if operator == '|':
                    value = value or bool(self.visit(i))
                elif operator == '&':
                    value = value and bool(self.visit(i))
        debug.log(f'Logic expression: {value} | {type(value)}')
        return value
    

    # Visit a parse tree produced by LogoTomaParser#integer.
    def visitInteger(self, ctx:LogoTomaParser.IntegerContext):
        # return int(ctx.getText())
        return Integer_(ctx.getText())


    # Visit a parse tree produced by LogoTomaParser#floate.
    def visitFloate(self, ctx:LogoTomaParser.FloateContext):
        return Float_(ctx.getText())


    # Visit a parse tree produced by LogoTomaParser#bool.
    def visitBool(self, ctx:LogoTomaParser.BoolContext):
        # return self.visitChildren(ctx)
        return Bool_(ctx.BOOL().getText())


    # Visit a parse tree produced by LogoTomaParser#string.
    def visitString(self, ctx:LogoTomaParser.StringContext):
        # return ctx.STRING().getText()
        return String_(ctx.STRING().getText()[1:-1])


    # Visit a parse tree produced by LogoTomaParser#block.
    def visitBlock(self, ctx:LogoTomaParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#statement.
    def visitStatement(self, ctx:LogoTomaParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#function.
    def visitFunction(self, ctx:LogoTomaParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#f_call.
    def visitF_call(self, ctx:LogoTomaParser.F_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#comment.
    def visitComment(self, ctx:LogoTomaParser.CommentContext):
        return self.visitChildren(ctx)
    
    # Visit a parse tree produced by LogoTomaParser#identifier.
    def visitIdentifier(self, ctx:LogoTomaParser.IdentifierContext):
        return ctx.IDENTIFIER().getText()