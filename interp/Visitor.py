from dist.LogoTomaVisitor import LogoTomaVisitor
from dist.LogoTomaParser import LogoTomaParser

class Visitor(LogoTomaVisitor):
    def visitProgram(self, ctx:LogoTomaParser.ProgramContext):
        return self.visitChildren(ctx)
    
    def visitComment(self, ctx:LogoTomaParser.CommentContext):
        return ctx.getText()
    
    # Visit a parse tree produced by LogoTomaParser#number.
    def visitNumber(self, ctx:LogoTomaParser.NumberContext):
        return int(ctx.getText())
        