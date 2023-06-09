class LogoTomaException(Exception):
    def __init__(self, message):
        self.message = message
        
    def __name__(self):
        return self.__class__.__name__

    def __str__(self):
        return repr(self.message)
    
class LogoTomaSyntaxError(LogoTomaException):
    def __init__(self, message):
        super().__init__(message)
    
class LogoTomaSemanticError(LogoTomaException):
    def __init__(self, message):
        super().__init__(message)
        
class LogoTomaRuntimeError(LogoTomaException):
    def __init__(self, message):
        super().__init__(message)
        
class LogoTomaValueError(LogoTomaException):
    def __init__(self, message):
        super().__init__(message)

class LogoTomaLogicError(LogoTomaException):
    def __init__(self, message):
        super().__init__(message)