from interp.objects.scopes.scope import Scope
from interp.objects.variable import Variable
from interp.objects.function.function import Function_
from interp.error_handling.exceptions import LogoTomaValueError, LogoTomaLogicError, LogoTomaSemanticError


class Environment():
    
    def __init__(self) -> None:
        self.global_scope = {}
        self.scope_stack = [Scope(None)]
        self.functions = {}

# =================================================================================================
# ======================================== SCOPES ==============================================
# =================================================================================================

    def add_scope(self, fun_scope=False):
        # if fun_scope:
            # self.scope_stack.append(Scope(None))
            # return
        self.scope_stack.append(Scope(self.get_scope()))

    def get_scope(self):
        return self.scope_stack[-1]

    def remove_scope(self):
        self.scope_stack.pop()

# =================================================================================================
# ======================================== VARIABLES ===========================================
# =================================================================================================
    
    def add_variable(self, name, type):
        self.get_scope().add_variable(name, type)

    def get_variable(self, name):
        return self.get_scope().get_variable(name)
    
    def get_value(self, name):
        return self.get_variable(name).value
    
    def set_variable(self, name, value):
        self.get_scope().set_variable(name, value)

# =================================================================================================
# ======================================== GLOBAL VARIABLES ===========================================
# =================================================================================================
    
    def add_global_variable(self, name, type):
        if name in self.global_scope:
            raise LogoTomaLogicError(f"Variable '{name}' already exists.")
        self.global_scope[name] = Variable(type)

    def get_global_variable(self, name):
        # print(self.global_scope.keys())
        if name in self.global_scope.keys():
            return self.global_scope[name]
        raise LogoTomaSemanticError(f"Variable '{name}' not found.")
    
    def get_global_value(self, name):
        return self.get_global_variable(name).value
    
    def set_global_variable(self, name, value):
        if name in self.global_scope:
            self.global_scope[name].setValue(value)
            return
        raise LogoTomaSemanticError(f"Variable '{name}' not found.")
    
    def remove_global_variable(self, name):
        if name not in self.global_scope:
            raise LogoTomaLogicError(f"Variable '{name}' already not exists.")
        self.global_scope.pop(name)
          


# =================================================================================================
# ======================================== FUNCTIONS ===========================================
# =================================================================================================

    def add_function(self, name: str, function: Function_):
        if name in self.functions:
            raise LogoTomaLogicError(f"Function '{name}' already exists.")
        self.functions[name] = function

    def get_function(self, name: str) -> Function_:
        if name in self.functions:
            return self.functions[name]
        raise LogoTomaSemanticError(f"Function '{name}' not found.")
    
    def call_function(self, name: str, *args):
        if name in self.functions:
            return self.functions[name](*args)
        raise LogoTomaSemanticError(f"Function '{name}' not found.")
    
    def set_function(self, name: str, function: Function_):
        if name in self.functions:
            self.functions[name] = function
            return
        raise LogoTomaSemanticError(f"Function '{name}' not found.")
    