class LogoTomaException(Exception):
    def __init__(self, message, line=None, column=None):
        self.message = message
        self.line = line
        self.column = column
        
    def __name__(self):
        return self.__class__.__name__

    def __str__(self):
        return repr(self.message)
    
class LogoTomaSyntaxError(LogoTomaException):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
    
class LogoTomaSemanticError(LogoTomaException):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        
class LogoTomaRuntimeError(LogoTomaException):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        
class LogoTomaValueError(LogoTomaException):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

class LogoTomaLogicError(LogoTomaException):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)