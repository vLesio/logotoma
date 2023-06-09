from interp.objects.scopes.scope import Scope
from interp.objects.variable import Variable
from interp.objects.function.function import Function_


class Environment():
    
    def __init__(self) -> None:
        self.global_scope = {}
        self.scope_stack = [Scope(None)]
        self.functions = {}

# =================================================================================================
# ======================================== SCOPES ==============================================
# =================================================================================================

    def add_scope(self, fun_scope=False):
        if fun_scope:
            self.scope_stack.append(Scope(None))
            print(f'Added function scope: {self.get_scope()}')
            return
        self.scope_stack.append(Scope(self.get_scope()))
        print(f'Added scope: {self.get_scope()}')

    def get_scope(self):
        return self.scope_stack[-1]

    def remove_scope(self):
        print(f'Removed scope: {self.get_scope()}')
        self.scope_stack.pop()

# =================================================================================================
# ======================================== VARIABLES ===========================================
# =================================================================================================
    
    def add_variable(self, name, type):
        self.get_scope().add_variable(name, type)
        # if name in self.get_scope():
        #     raise Exception(f"Variable '{name}' already exists.")
        # self.get_scope()[name] = Variable(type)

    def get_variable(self, name):
        return self.get_scope().get_variable(name)
        # for scope in reversed(self.scope_stack):
        #     if name in scope:
        #         return scope[name]
        # raise Exception(f"Variable '{name}' not found.")
    
    def get_value(self, name):
        return self.get_variable(name).value
    
    def set_variable(self, name, value):
        self.get_scope().set_variable(name, value)
        # for scope in reversed(self.scope_stack):
        #     if name in scope:
        #         scope[name].setValue(value)
        #         return
        # raise Exception(f"Variable '{name}' not found.")
    
    # PO CO MY TO ROBIMY???

# =================================================================================================
# ======================================== GLOBAL VARIABLES ===========================================
# =================================================================================================
    
    def add_global_variable(self, name, type):
        if name in self.global_scope:
            raise Exception(f"Variable '{name}' already exists.")
        self.global_scope[name] = Variable(type)

    def get_global_variable(self, name):
        # print(self.global_scope.keys())
        if name in self.global_scope.keys():
            return self.global_scope[name]
        raise Exception(f"Variable '{name}' not found.")
    
    def get_global_value(self, name):
        return self.get_global_variable(name).value
    
    def set_global_variable(self, name, value):
        if name in self.global_scope:
            self.global_scope[name].setValue(value)
            return
        raise Exception(f"Variable '{name}' not found.")
    
    def remove_global_variable(self, name):
        if name not in self.global_scope:
            raise Exception(f"Variable '{name}' already not exists.")
        self.global_scope.pop(name)


# =================================================================================================
# ======================================== FUNCTIONS ===========================================
# =================================================================================================

    def add_function(self, name: str, function: Function_):
        if name in self.functions:
            raise Exception(f"Function '{name}' already exists.")
        self.functions[name] = function

    def get_function(self, name: str) -> Function_:
        if name in self.functions:
            return self.functions[name]
        raise Exception(f"Function '{name}' not found.")
    
    def call_function(self, name: str, *args):
        if name in self.functions:
            return self.functions[name](*args)
        raise Exception(f"Function '{name}' not found.")
    
    def set_function(self, name: str, function: Function_):
        if name in self.functions:
            self.functions[name] = function
            return
        raise Exception(f"Function '{name}' not found.")
    