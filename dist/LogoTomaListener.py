# Generated from .\LogoToma.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LogoTomaParser import LogoTomaParser
else:
    from LogoTomaParser import LogoTomaParser

# This class defines a complete listener for a parse tree produced by LogoTomaParser.
class LogoTomaListener(ParseTreeListener):

    # Enter a parse tree produced by LogoTomaParser#program.
    def enterProgram(self, ctx:LogoTomaParser.ProgramContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#program.
    def exitProgram(self, ctx:LogoTomaParser.ProgramContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#line.
    def enterLine(self, ctx:LogoTomaParser.LineContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#line.
    def exitLine(self, ctx:LogoTomaParser.LineContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#command.
    def enterCommand(self, ctx:LogoTomaParser.CommandContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#command.
    def exitCommand(self, ctx:LogoTomaParser.CommandContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#move.
    def enterMove(self, ctx:LogoTomaParser.MoveContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#move.
    def exitMove(self, ctx:LogoTomaParser.MoveContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#assign.
    def enterAssign(self, ctx:LogoTomaParser.AssignContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#assign.
    def exitAssign(self, ctx:LogoTomaParser.AssignContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#paint.
    def enterPaint(self, ctx:LogoTomaParser.PaintContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#paint.
    def exitPaint(self, ctx:LogoTomaParser.PaintContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#save.
    def enterSave(self, ctx:LogoTomaParser.SaveContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#save.
    def exitSave(self, ctx:LogoTomaParser.SaveContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#brush_shape.
    def enterBrush_shape(self, ctx:LogoTomaParser.Brush_shapeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#brush_shape.
    def exitBrush_shape(self, ctx:LogoTomaParser.Brush_shapeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#brush_color.
    def enterBrush_color(self, ctx:LogoTomaParser.Brush_colorContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#brush_color.
    def exitBrush_color(self, ctx:LogoTomaParser.Brush_colorContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#brush_size.
    def enterBrush_size(self, ctx:LogoTomaParser.Brush_sizeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#brush_size.
    def exitBrush_size(self, ctx:LogoTomaParser.Brush_sizeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#linee.
    def enterLinee(self, ctx:LogoTomaParser.LineeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#linee.
    def exitLinee(self, ctx:LogoTomaParser.LineeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#circle.
    def enterCircle(self, ctx:LogoTomaParser.CircleContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#circle.
    def exitCircle(self, ctx:LogoTomaParser.CircleContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#color.
    def enterColor(self, ctx:LogoTomaParser.ColorContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#color.
    def exitColor(self, ctx:LogoTomaParser.ColorContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#type_name.
    def enterType_name(self, ctx:LogoTomaParser.Type_nameContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#type_name.
    def exitType_name(self, ctx:LogoTomaParser.Type_nameContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#name.
    def enterName(self, ctx:LogoTomaParser.NameContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#name.
    def exitName(self, ctx:LogoTomaParser.NameContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#value.
    def enterValue(self, ctx:LogoTomaParser.ValueContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#value.
    def exitValue(self, ctx:LogoTomaParser.ValueContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#ife.
    def enterIfe(self, ctx:LogoTomaParser.IfeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#ife.
    def exitIfe(self, ctx:LogoTomaParser.IfeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#loope.
    def enterLoope(self, ctx:LogoTomaParser.LoopeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#loope.
    def exitLoope(self, ctx:LogoTomaParser.LoopeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#whilee.
    def enterWhilee(self, ctx:LogoTomaParser.WhileeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#whilee.
    def exitWhilee(self, ctx:LogoTomaParser.WhileeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#elsee.
    def enterElsee(self, ctx:LogoTomaParser.ElseeContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#elsee.
    def exitElsee(self, ctx:LogoTomaParser.ElseeContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#signExpression.
    def enterSignExpression(self, ctx:LogoTomaParser.SignExpressionContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#signExpression.
    def exitSignExpression(self, ctx:LogoTomaParser.SignExpressionContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#multiplyingExpression.
    def enterMultiplyingExpression(self, ctx:LogoTomaParser.MultiplyingExpressionContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#multiplyingExpression.
    def exitMultiplyingExpression(self, ctx:LogoTomaParser.MultiplyingExpressionContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#nestedExpression.
    def enterNestedExpression(self, ctx:LogoTomaParser.NestedExpressionContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#nestedExpression.
    def exitNestedExpression(self, ctx:LogoTomaParser.NestedExpressionContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#expression.
    def enterExpression(self, ctx:LogoTomaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#expression.
    def exitExpression(self, ctx:LogoTomaParser.ExpressionContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#logic_expression.
    def enterLogic_expression(self, ctx:LogoTomaParser.Logic_expressionContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#logic_expression.
    def exitLogic_expression(self, ctx:LogoTomaParser.Logic_expressionContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#number.
    def enterNumber(self, ctx:LogoTomaParser.NumberContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#number.
    def exitNumber(self, ctx:LogoTomaParser.NumberContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#bool.
    def enterBool(self, ctx:LogoTomaParser.BoolContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#bool.
    def exitBool(self, ctx:LogoTomaParser.BoolContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#deref.
    def enterDeref(self, ctx:LogoTomaParser.DerefContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#deref.
    def exitDeref(self, ctx:LogoTomaParser.DerefContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#string.
    def enterString(self, ctx:LogoTomaParser.StringContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#string.
    def exitString(self, ctx:LogoTomaParser.StringContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#block.
    def enterBlock(self, ctx:LogoTomaParser.BlockContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#block.
    def exitBlock(self, ctx:LogoTomaParser.BlockContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#function.
    def enterFunction(self, ctx:LogoTomaParser.FunctionContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#function.
    def exitFunction(self, ctx:LogoTomaParser.FunctionContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#f_call.
    def enterF_call(self, ctx:LogoTomaParser.F_callContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#f_call.
    def exitF_call(self, ctx:LogoTomaParser.F_callContext):
        pass


    # Enter a parse tree produced by LogoTomaParser#comment.
    def enterComment(self, ctx:LogoTomaParser.CommentContext):
        pass

    # Exit a parse tree produced by LogoTomaParser#comment.
    def exitComment(self, ctx:LogoTomaParser.CommentContext):
        pass



del LogoTomaParser