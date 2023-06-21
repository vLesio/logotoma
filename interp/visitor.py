from dist.LogoTomaVisitor import LogoTomaVisitor
from dist.LogoTomaParser import LogoTomaParser
from interp.exception_handler import handle_exception
from interp.kosmotoma import KosmoToma
from interp.makopen import Makopen

from interp.debugger import debug
from interp.objects.types.float_ import Float_

from interp.objects.types.integer import Integer_
from interp.objects.types.string import String_
from interp.objects.types.bool import Bool_
from interp.objects.function.function import Function_
from interp.objects.types.types import types
from interp.error_handling.exceptions import LogoTomaValueError

class Visitor(LogoTomaVisitor):

    def __init__(self, cmd: KosmoToma):
        super().__init__()
        self.cmd = cmd

    # Visit a parse tree produced by LogoTomaParser#program.
    @handle_exception
    def visitProgram(self, ctx:LogoTomaParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#line.
    @handle_exception
    def visitLine(self, ctx:LogoTomaParser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#command.
    @handle_exception
    def visitCommand(self, ctx:LogoTomaParser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#engine.
    @handle_exception
    def visitEngine(self, ctx:LogoTomaParser.EngineContext):
        if ctx.logic_expression() is not None:
            value = self.visit(ctx.logic_expression())
            if value():
                self.cmd.makolot.enable_engine()
            else:
                self.cmd.makolot.disable_engine()
        elif str(ctx.children[1]) == 'on':
            self.cmd.makolot.enable_engine()
        elif str(ctx.children[1]) == 'off':
            self.cmd.makolot.disable_engine()
        else:
            raise LogoTomaValueError(f'\'{ctx.children[1].getText()}\' is not a valid value for \'engine\' command')


    # Visit a parse tree produced by LogoTomaParser#wheel.
    @handle_exception
    def visitWheel(self, ctx:LogoTomaParser.WheelContext):
        if str(ctx.children[1]) == 'right':
            # print('setting right')
            self.cmd.makolot.set_wheel_state('right')
        elif str(ctx.children[1]) == 'left':
            # print('setting left')
            self.cmd.makolot.set_wheel_state('left')
        elif str(ctx.children[1]) == 'off':
            # print('turning off')
            self.cmd.makolot.set_wheel_state('off')
        else:
            raise LogoTomaValueError(f'\'{ctx.children[1]}\' is not a valid value for \'wheel\' command')


    # Visit a parse tree produced by LogoTomaParser#spray.
    @handle_exception
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
        else:
            raise LogoTomaValueError(f'\'{ctx.children[1]}\' is not a valid value for \'spray\' command')


    # Visit a parse tree produced by LogoTomaParser#spray_color.
    @handle_exception
    def visitSpray_color(self, ctx:LogoTomaParser.Spray_colorContext):
        if ctx.color() is not None:
            r, g, b = self.visit(ctx.color())
            self.cmd.makolot.makopen.setColor((abs(r())%256, abs(g())%256, abs(b())%256))
        elif ctx.identifier() is not None:
            debug.log('identifier')
        elif ctx.f_call() is not None:
            r, g, b = self.visit(ctx.f_call())
            if r is not None:
                self.cmd.makolot.makopen.setColor((abs(r())%256, abs(g())%256, abs(b())%256))
        else:
            raise LogoTomaValueError('Invalid color value.')
            

    # Visit a parse tree produced by LogoTomaParser#spray_size.
    @handle_exception
    def visitSpray_size(self, ctx:LogoTomaParser.Spray_sizeContext):
        value = self.visit(ctx.expression())
        if value is None:
            raise LogoTomaValueError('Spray size must be an integer.')
        self.cmd.makolot.makopen.setWidth(value())


    # Visit a parse tree produced by LogoTomaParser#sleep.
    @handle_exception
    def visitSleep(self, ctx:LogoTomaParser.SleepContext):
        sleep_time = self.visit(ctx.expression())
        try:
            assert isinstance(sleep_time, Integer_)
            self.cmd.sleep(sleep_time())
        except AssertionError:
            raise LogoTomaValueError('Sleep time must be an integer.')
        
        
    # Visit a parse tree produced by LogoTomaParser#hide.
    @handle_exception
    def visitHide(self, ctx:LogoTomaParser.HideContext):
        if ctx.logic_expression() is not None:
            value = self.visit(ctx.logic_expression())
            if value:
                self.cmd.makolot.hide()
            elif not value:
                self.cmd.makolot.show()
            else:
                raise LogoTomaValueError(f'\'{ctx.children[1]}\' is not a valid value for \'hide\' command')
        elif str(ctx.children[1]) == 'off':
            self.cmd.makolot.show()
        elif str(ctx.children[1]) == 'on':
            self.cmd.makolot.hide()
        else:
            raise LogoTomaValueError(f'\'{ctx.children[1]}\' is not a valid value for \'hide\' command')


    # Visit a parse tree produced by LogoTomaParser#cast.
    @handle_exception
    def visitCast(self, ctx:LogoTomaParser.CastContext):
        type_to_cast = self.visit(ctx.type_name())
        value_to_cast = str(self.visit(ctx.value()))
        
        if type_to_cast == 'int':
            return Integer_.cast(self, value_to_cast)
        elif type_to_cast == 'float':
            return Float_.cast(self, value_to_cast)
        elif type_to_cast == 'string':
            return String_.cast(self, value_to_cast)
        elif type_to_cast == 'bool':
            return Bool_.cast(self, value_to_cast)
        elif type_to_cast == 'color':
            # return Color_.cast(value_to_cast)
            pass
        else:
            raise LogoTomaValueError(f"Invalid type: {type_to_cast}")


    # Visit a parse tree produced by LogoTomaParser#print.
    @handle_exception
    def visitPrint(self, ctx:LogoTomaParser.PrintContext):
        print(f'[PROGRAM]: {self.visit(ctx.value())}')
    

    # Visit a parse tree produced by LogoTomaParser#object.
    @handle_exception
    def visitObject(self, ctx:LogoTomaParser.ObjectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#assign.
    @handle_exception
    def visitAssign(self, ctx:LogoTomaParser.AssignContext):
        if ctx.type_name() is not None:
            self.cmd.env.add_variable(ctx.identifier().getText(), ctx.type_name().getText())
        self.cmd.env.set_variable(ctx.identifier().getText(), self.visit(ctx.value()))

    # Visit a parse tree produced by LogoTomaParser#deref.
    @handle_exception
    def visitDeref(self, ctx:LogoTomaParser.DerefContext):
        return self.cmd.env.get_value(self.visit(ctx.identifier()))


    # Visit a parse tree produced by LogoTomaParser#save.
    @handle_exception
    def visitSave(self, ctx:LogoTomaParser.SaveContext):
        filename = self.visit(ctx.string())
        if not filename.match(r'.*\.$'):
            raise LogoTomaValueError('Filename must have an extension.')
        self.cmd.makolot.makopen.saveCanvas(filename)


    # Visit a parse tree produced by LogoTomaParser#color.
    @handle_exception
    def visitColor(self, ctx:LogoTomaParser.ColorContext):
        r, g, b = [self.visitChildren(value) for value in ctx.value()]
        return r, g, b

    # Visit a parse tree produced by LogoTomaParser#type_name.
    @handle_exception
    def visitType_name(self, ctx:LogoTomaParser.Type_nameContext):
        return ctx.getText()


    # Visit a parse tree produced by LogoTomaParser#value.
    @handle_exception
    def visitValue(self, ctx:LogoTomaParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#ife.
    @handle_exception
    def visitIfe(self, ctx:LogoTomaParser.IfeContext):
        # There has to be '()' at the end of the visit to the logic_expression because it will
        # return bool value of Bool_ object instead of the Bool_ object itself
        val = self.visit(ctx.logic_expression())
        if val is None:
            raise LogoTomaValueError('If condition must be a boolean value.')
        if val():
            return self.visit(ctx.block())
        elif ctx.elsee() is not None:
            return self.visit(ctx.elsee())
        else:
            raise LogoTomaValueError('If condition must be a boolean value.')

    # Visit a parse tree produced by LogoTomaParser#loope.
    @handle_exception
    def visitLoope(self, ctx:LogoTomaParser.LoopeContext):
        for __ in range(self.visit(ctx.value())()):
            value = self.visit(ctx.block())
            if value is not None:
                return value


    # Visit a parse tree produced by LogoTomaParser#whilee.
    @handle_exception
    def visitWhilee(self, ctx:LogoTomaParser.WhileeContext):
        if self.visit(ctx.value())() is None:
            raise LogoTomaValueError('While condition must be a boolean value.')
        while self.visit(ctx.value())():
            value = self.visit(ctx.block())
            if value is not None:
                return value

    # Visit a parse tree produced by LogoTomaParser#elsee.
    @handle_exception
    def visitElsee(self, ctx:LogoTomaParser.ElseeContext):
        return self.visit(ctx.block())


    # Visit a parse tree produced by LogoTomaParser#signExpression.
    @handle_exception
    def visitSignExpression(self, ctx:LogoTomaParser.SignExpressionContext):
        value = None
        if ctx.expression() is not None:
            value = self.visit(ctx.expression())
        else:
            value = self.visitChildren(ctx)
            
        if value is None:
            raise LogoTomaValueError('Value cannot be None.')

        if ctx.SIGN_OPERATORS() is not None and str(ctx.SIGN_OPERATORS().getText()) == '-':
            return value * Integer_(-1)
        else:
            return value


    # Visit a parse tree produced by LogoTomaParser#multiplyingExpression.
    @handle_exception
    def visitMultiplyingExpression(self, ctx:LogoTomaParser.MultiplyingExpressionContext):
        l = self.visit(ctx.signExpression(0))
        if l is None:
            raise LogoTomaValueError('Value cannot be None.')
        for index, i in enumerate(ctx.MULTIPLYING_OPERATORS()):
            operator = str(i)
            second_value = second_value
            if second_value is None:
                raise LogoTomaValueError('Value cannot be None.')
            
            if operator == '*':
                l = l * second_value
            elif operator == '/':
                if type(l) == type(1) and type(second_value) == type(1):
                    l = l // second_value
                else:
                    l = l / second_value
            elif operator == '%':
                l = l % second_value
            else:
                raise LogoTomaValueError('Unknown operator: ' + operator)
        return l


    # Visit a parse tree produced by LogoTomaParser#expression.
    @handle_exception
    def visitExpression(self, ctx:LogoTomaParser.ExpressionContext):
        l = self.visit(ctx.multiplyingExpression(0))
        if l is None:
            raise LogoTomaValueError('Value cannot be None.')
        for i, op in enumerate(ctx.SIGN_OPERATORS()):
            op = str(op)
            second_value = self.visit(ctx.multiplyingExpression(i+1))
            if second_value is None:
                raise LogoTomaValueError('Value cannot be None.')
            if op == '+':
                l = l + second_value
            elif op == '-':
                l = l - second_value
            else:
                raise LogoTomaValueError('Unknown operator: ' + op)
        return l


    # Visit a parse tree produced by LogoTomaParser#logicBit.
    @handle_exception
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
        else:
            raise LogoTomaValueError('Value cannot be None.')
        
        

    # Visit a parse tree produced by LogoTomaParser#comparisonExpression.
    @handle_exception
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
        else:
            raise LogoTomaValueError('Unknown operator: ' + op)
        return condition


    # Visit a parse tree produced by LogoTomaParser#logic_expression.
    @handle_exception
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
    @handle_exception
    def visitInteger(self, ctx:LogoTomaParser.IntegerContext):
        # return int(ctx.getText())
        return Integer_(ctx.getText())


    # Visit a parse tree produced by LogoTomaParser#floate.
    @handle_exception
    def visitFloate(self, ctx:LogoTomaParser.FloateContext):
        return Float_(ctx.getText())


    # Visit a parse tree produced by LogoTomaParser#bool.
    @handle_exception
    def visitBool(self, ctx:LogoTomaParser.BoolContext):
        # return self.visitChildren(ctx)
        return Bool_(ctx.BOOL().getText())

    # Visit a parse tree produced by LogoTomaParser#string.
    @handle_exception
    def visitString(self, ctx:LogoTomaParser.StringContext):
        # return ctx.STRING().getText()
        return String_(ctx.STRING().getText()[1:-1])


    # Visit a parse tree produced by LogoTomaParser#block.
    @handle_exception
    def visitBlock(self, ctx:LogoTomaParser.BlockContext):
        value = None
        self.cmd.env.add_scope()
        for statement in ctx.statement():
            if statement.getText().startswith('loop while'):
                value = self.visit(statement)
                if value is not None:
                    break
            elif statement.getText().startswith('loop'):
                value = self.visit(statement)
                if value is not None:
                    break
            elif statement.getText().startswith('if'):
                value = self.visit(statement)
                if value is not None:
                    break
            elif statement.getText().startswith('return'):
                if statement.value() is not None:
                    value = self.visit(statement.value())
                break
            elif self.visit(statement) is not None:
                value = self.visit(statement)
            else:
                raise LogoTomaValueError('Value cannot be None.')
        self.cmd.env.remove_scope()
        return value


    # Visit a parse tree produced by LogoTomaParser#statement.
    @handle_exception
    def visitStatement(self, ctx:LogoTomaParser.StatementContext):
        if ctx.value() is not None:
            return self.visit(ctx.value())
        return self.visit(ctx.line())
        
        
    # Visit a parse tree produced by LogoTomaParser#function.
    @handle_exception
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
    @handle_exception
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
    @handle_exception
    def visitComment(self, ctx:LogoTomaParser.CommentContext):
        return self.visitChildren(ctx)
    
    # Visit a parse tree produced by LogoTomaParser#identifier.
    @handle_exception
    def visitIdentifier(self, ctx:LogoTomaParser.IdentifierContext):
        return ctx.IDENTIFIER().getText()
    