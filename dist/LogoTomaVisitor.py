# Generated from .\LogoToma.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LogoTomaParser import LogoTomaParser
else:
    from LogoTomaParser import LogoTomaParser

# This class defines a complete generic visitor for a parse tree produced by LogoTomaParser.

class LogoTomaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LogoTomaParser#program.
    def visitProgram(self, ctx:LogoTomaParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#line.
    def visitLine(self, ctx:LogoTomaParser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#command.
    def visitCommand(self, ctx:LogoTomaParser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#move.
    def visitMove(self, ctx:LogoTomaParser.MoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#assign.
    def visitAssign(self, ctx:LogoTomaParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#paint.
    def visitPaint(self, ctx:LogoTomaParser.PaintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#save.
    def visitSave(self, ctx:LogoTomaParser.SaveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#brush_shape.
    def visitBrush_shape(self, ctx:LogoTomaParser.Brush_shapeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#brush_color.
    def visitBrush_color(self, ctx:LogoTomaParser.Brush_colorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#brush_size.
    def visitBrush_size(self, ctx:LogoTomaParser.Brush_sizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#linee.
    def visitLinee(self, ctx:LogoTomaParser.LineeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#circle.
    def visitCircle(self, ctx:LogoTomaParser.CircleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#color.
    def visitColor(self, ctx:LogoTomaParser.ColorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#type_name.
    def visitType_name(self, ctx:LogoTomaParser.Type_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#name.
    def visitName(self, ctx:LogoTomaParser.NameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#value.
    def visitValue(self, ctx:LogoTomaParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#ife.
    def visitIfe(self, ctx:LogoTomaParser.IfeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#loope.
    def visitLoope(self, ctx:LogoTomaParser.LoopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#whilee.
    def visitWhilee(self, ctx:LogoTomaParser.WhileeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#elsee.
    def visitElsee(self, ctx:LogoTomaParser.ElseeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#signExpression.
    def visitSignExpression(self, ctx:LogoTomaParser.SignExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#multiplyingExpression.
    def visitMultiplyingExpression(self, ctx:LogoTomaParser.MultiplyingExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#nestedExpression.
    def visitNestedExpression(self, ctx:LogoTomaParser.NestedExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#expression.
    def visitExpression(self, ctx:LogoTomaParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#logic_expression.
    def visitLogic_expression(self, ctx:LogoTomaParser.Logic_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#number.
    def visitNumber(self, ctx:LogoTomaParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#bool.
    def visitBool(self, ctx:LogoTomaParser.BoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#deref.
    def visitDeref(self, ctx:LogoTomaParser.DerefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#string.
    def visitString(self, ctx:LogoTomaParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#block.
    def visitBlock(self, ctx:LogoTomaParser.BlockContext):
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



del LogoTomaParser