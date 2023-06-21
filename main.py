import sys
from antlr4 import *
from dist.LogoTomaLexer import LogoTomaLexer
from dist.LogoTomaParser import LogoTomaParser
from interp.listener import Listener
from interp.visitor import Visitor
from interp.kosmotoma import KosmoToma
from interp.debugger import debug
from antlr4.error.ErrorListener import ErrorListener
from interp.error_handling.exceptions import LogoTomaException, LogoTomaSemanticError, LogoTomaRuntimeError, LogoTomaValueError, LogoTomaLogicError

import pygame

class MyErrorListener( ErrorListener ):

    def __init__(self):
        super(MyErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise LogoTomaSemanticError(msg, line=line, column=column)

    # def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
    #     raise LogoTomaLogicError("Ambiguity", recognizer=recognizer, dfa=dfa, line=startIndex, stopIndex=stopIndex, exact=exact, ambigAlts=ambigAlts, configs=configs)

    # def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
    #     raise LogoTomaLogicError("Where context", recognizer=recognizer, dfa=dfa, line=startIndex, stopIndex=stopIndex, conflictingAlts=conflictingAlts, configs=configs)

    # def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
    #     raise LogoTomaLogicError("Sensitive context", recognizer=recognizer, dfa=dfa, line=startIndex, stopIndex=stopIndex, prediction=prediction, configs=configs)

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
    parser.addErrorListener( MyErrorListener() )
    try:
        tree = parser.program()
    except LogoTomaException as e:
                    # line_text 
            line_number = e.line
            column = e.column
            print('\n')
            print('- ' * 30)
            print(f"{e.__name__()} occured in line [{line_number}|{column}]:\n{e}\n")
            
            quit()
        

    # First run
    # output = ParseTreeWalker().walk(Listener(cmd), tree)

    # Second run
    output = Visitor(cmd).visit(tree)

    debug.log(f"Output: {output}")