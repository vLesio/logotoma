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


    # Visit a parse tree produced by LogoTomaParser#engine.
    def visitEngine(self, ctx:LogoTomaParser.EngineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#wheel.
    def visitWheel(self, ctx:LogoTomaParser.WheelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#spray.
    def visitSpray(self, ctx:LogoTomaParser.SprayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#spray_color.
    def visitSpray_color(self, ctx:LogoTomaParser.Spray_colorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#spray_size.
    def visitSpray_size(self, ctx:LogoTomaParser.Spray_sizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#cast.
    def visitCast(self, ctx:LogoTomaParser.CastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#object.
    def visitObject(self, ctx:LogoTomaParser.ObjectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#assign.
    def visitAssign(self, ctx:LogoTomaParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#save.
    def visitSave(self, ctx:LogoTomaParser.SaveContext):
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


    # Visit a parse tree produced by LogoTomaParser#expression.
    def visitExpression(self, ctx:LogoTomaParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#atomicLogicExpression.
    def visitAtomicLogicExpression(self, ctx:LogoTomaParser.AtomicLogicExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#comparisonExpression.
    def visitComparisonExpression(self, ctx:LogoTomaParser.ComparisonExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#logic_expression.
    def visitLogic_expression(self, ctx:LogoTomaParser.Logic_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#integer.
    def visitInteger(self, ctx:LogoTomaParser.IntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LogoTomaParser#floate.
    def visitFloate(self, ctx:LogoTomaParser.FloateContext):
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



del LogoTomaParser