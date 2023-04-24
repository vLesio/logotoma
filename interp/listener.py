from dist.LogoTomaListener import LogoTomaListener
from dist.LogoTomaParser import LogoTomaParser
from interp.kosmotoma import KosmoToma

class Listener(LogoTomaListener):

    def __init__(self, cmd: KosmoToma):
        super().__init__()
        self.cmd = cmd
    

    # Enter a parse tree produced by LogoTomaParser#assign.
    def enterAssign(self, ctx:LogoTomaParser.AssignContext):
        if ctx.type_name() is not None:
            self.cmd.env.add_global_variable(ctx.identifier().getText(), ctx.type_name().getText())

    # Enter a parse tree produced by LogoTomaParser#block.
    def enterBlock(self, ctx:LogoTomaParser.BlockContext):
        # self.cmd.env.add_scope()
        pass

    # Exit a parse tree produced by LogoTomaParser#block.
    def exitBlock(self, ctx:LogoTomaParser.BlockContext):
        # self.cmd.env.remove_scope()
        pass
