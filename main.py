import sys
from antlr4 import *
from dist.LogoTomaLexer import LogoTomaLexer
from dist.LogoTomaParser import LogoTomaParser
from interp.listener import Listener
from interp.visitor import Visitor
from interp.kosmotoma import KosmoToma

import pygame

if __name__ == "__main__":
    program = None
    if len(sys.argv) < 2:
        program = input('>>> ')
    else:
        with open(sys.argv[1]) as file:
            program = file.read()

    cmd = KosmoToma()

    data =  InputStream(program)
    lexer = LogoTomaLexer(data)
    stream = CommonTokenStream(lexer)
    parser = LogoTomaParser(stream)
    tree = parser.program()
    output = ParseTreeWalker().walk(Listener(cmd), tree)
    output = Visitor(cmd).visit(tree)

    print(cmd.env.scope_stack)
    print(output)