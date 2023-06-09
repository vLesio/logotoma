from dist.LogoTomaVisitor import LogoTomaVisitor
from dist.LogoTomaParser import LogoTomaParser
# from interp.error_handling.exception_handler import handle_exception
from interp.kosmotoma import KosmoToma
from interp.makopen import Makopen

from interp.debugger import debug
from interp.objects.types.float import Float_

from interp.objects.types.integer import Integer_
from interp.objects.types.string import String_
from interp.objects.types.bool import Bool_
from interp.objects.function.function import Function_
from interp.objects.types.types import types

from copy import deepcopy

class Visitor(LogoTomaVisitor):

    def __init__(self, cmd: KosmoToma):
        super().__init__()
        self.cmd = cmd

    # Visit a parse tree produced by LogoTomaParser#program.
    # @handle_exception
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
        if ctx.logic_expression() is not None:
            value = self.visit(ctx.logic_expression())
            if not value:
                self.cmd.makolot.makopen.turnOffDrawing()
            elif value:
                self.cmd.makolot.makopen.turnOnDrawing()
        elif str(ctx.children[1]) == 'on':
                self.cmd.makolot.makopen.turnOnDrawing()
        elif str(ctx.children[1]) == 'off':
                self.cmd.makolot.makopen.turnOffDrawing()


    # Visit a parse tree produced by LogoTomaParser#spray_color.
    def visitSpray_color(self, ctx:LogoTomaParser.Spray_colorContext):
        if ctx.color() is not None:
            r, g, b = self.visitColor(ctx.color())
            print(r,g, b)
            print(type(r))
            self.cmd.makolot.makopen.setColor((r(), g(), b()))
        elif ctx.identifier() is not None:
            debug.log('identifier')
        elif ctx.f_call() is not None:
            debug.log('f_call')


    # Visit a parse tree produced by LogoTomaParser#spray_size.
    def visitSpray_size(self, ctx:LogoTomaParser.Spray_sizeContext):
        value = self.visit(ctx.expression())
        self.cmd.makolot.makopen.setWidth(value())

    # Visit a parse tree produced by LogoTomaParser#sleep.
    def visitSleep(self, ctx:LogoTomaParser.SleepContext):
        sleep_time = self.visit(ctx.expression())
        try:
            assert isinstance(sleep_time, Integer_)
            self.cmd.sleep(sleep_time())
        except AssertionError:
            raise Exception('Sleep time must be an integer.')


    # Visit a parse tree produced by LogoTomaParser#cast.
    def visitCast(self, ctx:LogoTomaParser.CastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#print.
    def visitPrint(self, ctx:LogoTomaParser.PrintContext):
        print(f'[PROGRAM]: {self.visit(ctx.value())}')
    

    # Visit a parse tree produced by LogoTomaParser#object.
    def visitObject(self, ctx:LogoTomaParser.ObjectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#assign.
    def visitAssign(self, ctx:LogoTomaParser.AssignContext):
        if ctx.type_name() is not None:
            self.cmd.env.add_variable(ctx.identifier().getText(), ctx.type_name().getText())
        self.cmd.env.set_variable(ctx.identifier().getText(), self.visit(ctx.value()))

    # Visit a parse tree produced by LogoTomaParser#deref.
    def visitDeref(self, ctx:LogoTomaParser.DerefContext):
        return self.cmd.env.get_value(self.visit(ctx.identifier()))


    # Visit a parse tree produced by LogoTomaParser#save.
    def visitSave(self, ctx:LogoTomaParser.SaveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#color.
    def visitColor(self, ctx:LogoTomaParser.ColorContext):
        r, g, b = [self.visitChildren(value) for value in ctx.value()]
        return r, g, b

    # Visit a parse tree produced by LogoTomaParser#type_name.
    def visitType_name(self, ctx:LogoTomaParser.Type_nameContext):
        return ctx.getText()


    # Visit a parse tree produced by LogoTomaParser#value.
    def visitValue(self, ctx:LogoTomaParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#ife.
    def visitIfe(self, ctx:LogoTomaParser.IfeContext):
        # There has to be '()' at the end of the visit to the logic_expression because it will
        # return bool value of Bool_ object instead of the Bool_ object itself
        val = self.visit(ctx.logic_expression())
        if val():
            self.visit(ctx.block())
        elif ctx.elsee() is not None:
            self.visit(ctx.elsee()) 

    # Visit a parse tree produced by LogoTomaParser#loope.
    def visitLoope(self, ctx:LogoTomaParser.LoopeContext):
        for __ in range(self.visit(ctx.value())()):
            self.visit(ctx.block())


    # Visit a parse tree produced by LogoTomaParser#whilee.
    def visitWhilee(self, ctx:LogoTomaParser.WhileeContext):
        while self.visit(ctx.value())():
            self.visit(ctx.block())

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

        if ctx.SIGN_OPERATORS() is not None and str(ctx.SIGN_OPERATORS().getText()) == '-':
            return value * Integer_(-1)
        else:
            return value


    # Visit a parse tree produced by LogoTomaParser#multiplyingExpression.
    def visitMultiplyingExpression(self, ctx:LogoTomaParser.MultiplyingExpressionContext):
        l = self.visit(ctx.signExpression(0))
        for index, i in enumerate(ctx.MULTIPLYING_OPERATORS()):
            operator = str(i)
            if operator == '*':
                l = l * self.visit(ctx.signExpression(index+1))
            elif operator == '/':
                if type(l) == type(1) and type(self.visit(ctx.signExpression(index+1))) == type(1):
                    l = l // self.visit(ctx.signExpression(index+1))
                else:
                    l = l / self.visit(ctx.signExpression(index+1))
            elif operator == '%':
                l = l % self.visit(ctx.signExpression(index+1))
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
                return value * Integer_(-1)
            else:
                return value
        elif ctx.expression() is not None:
            value = self.visit(ctx.expression())
            if negate:
                return value * Integer_(-1)
            else:
                return value
        elif ctx.bool_() is not None:
            value = self.visit(ctx.bool_())
            if negate:
                return value * Integer_(-1)
            else:
                return value
        
        

    # Visit a parse tree produced by LogoTomaParser#comparisonExpression.
    def visitComparisonExpression(self, ctx:LogoTomaParser.ComparisonExpressionContext):
        op = str(ctx.COMPARISON_OPERATORS())
        condition = None
        
        if ctx.COMPARISON_OPERATORS() is None:
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
        elif op == '!=':
            condition = self.visit(ctx.logicBit(0)) != self.visit(ctx.logicBit(1))
        return condition


    # Visit a parse tree produced by LogoTomaParser#logic_expression.
    def visitLogic_expression(self, ctx:LogoTomaParser.Logic_expressionContext):
        value = self.visit(ctx.comparisonExpression(0))
        if len(ctx.comparisonExpression()) > 1:
            for index, i in enumerate(ctx.comparisonExpression()[1:]):
                operator = ctx.LOGIC_OPERATORS(index).getText()
                if operator == '|':
                    value = value | self.visit(i)
                elif operator == '&':
                    value = value & self.visit(i)
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
        self.cmd.env.add_scope()
        for statement in ctx.statement():
            if statement.getText().startswith('return'):
                if statement.value() is not None:
                    self.cmd.env.remove_scope()
                    return self.visit(statement.value())
            elif self.visit(statement) is not None:
                self.visit(statement)
        self.cmd.env.remove_scope()


    # Visit a parse tree produced by LogoTomaParser#statement.
    def visitStatement(self, ctx:LogoTomaParser.StatementContext):
        if ctx.value() is not None:
            return self.visit(ctx.value())
        self.visit(ctx.line())
        
        
    # Visit a parse tree produced by LogoTomaParser#function.
    def visitFunction(self, ctx:LogoTomaParser.FunctionContext):
        f_name = self.visit(ctx.identifier(0))
        f_type_name = self.visit(ctx.type_name(0))
        debug.log(f_type_name)
        args = []
        if len(ctx.identifier()) > 1:
            args = [ (self.visit(ctx.type_name(i)), self.visit(ctx.identifier(i))) for i in range(1, len(ctx.identifier()[1:]) + 1)]
        
        # TEMP
        debug.log(f'new function: \n\tname: {f_name} \n\ttype: {f_type_name} \n\targs: {args}')
        
        new_function = Function_(f_name, f_type_name, args, ctx.block, self.cmd.env)
        
        self.cmd.env.add_function(f_name, new_function)
        
    
    # Visit a parse tree produced by LogoTomaParser#f_call.
    def visitF_call(self, ctx:LogoTomaParser.F_callContext):
        f_name = self.visit(ctx.identifier())
        args = [self.visit(i) for i in ctx.value()]
        self.cmd.env.add_scope(fun_scope=True)
        f_instance =  self.cmd.env.get_function(f_name)
        # f_instance =  self.cmd.env.call_function(f_name, *args)
        print(f_instance.is_void_type())
        if not f_instance.is_void_type():
            value = self.visit(f_instance(*args)())
            # f_instance.remove_vars_from_global_scope()
            self.cmd.env.remove_scope()
            return value
        
        self.visit(f_instance(*args)())
        self.cmd.env.remove_scope()
        # f_instance.remove_vars_from_global_scope()
        

    # Visit a parse tree produced by LogoTomaParser#comment.
    def visitComment(self, ctx:LogoTomaParser.CommentContext):
        return self.visitChildren(ctx)
    
    # Visit a parse tree produced by LogoTomaParser#identifier.
    def visitIdentifier(self, ctx:LogoTomaParser.IdentifierContext):
        return ctx.IDENTIFIER().getText()