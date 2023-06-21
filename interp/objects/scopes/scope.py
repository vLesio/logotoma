from interp.objects.variable import Variable
from interp.debugger import debug
from interp.error_handling.exceptions import LogoTomaValueError, LogoTomaLogicError, LogoTomaSemanticError

class Scope:
    def __init__(self, parent=None):
        self.parent = parent
        self.index = self.parent.index + 1 if self.parent else 0
        self.variables = {}
        debug.log(f'Scope created: {self}')

    def __del__(self):
        debug.log(f'Scope destroyed: {self}')

    def __str__(self):
        return f"<Scope [index:{self.index}] [vars:{self.variables}]>"
    
    def __repr__(self):
        return f"<Scope [index:{self.index}] [vars:{self.variables}]>"
    
    def add_variable(self, name, type):
        if name in self.variables:
            raise LogoTomaLogicError(f"Variable '{name}' already exists.")
        self.variables[name] = Variable(type)

    def set_variable(self, name, value):
        if name in self.variables:
            self.variables[name].setValue(value)
            return
        if self.parent:
            self.parent.set_variable(name, value)
            return
        raise LogoTomaSemanticError(f"Variable '{name}' not found.")
    
    def get_variable(self, name):
        if name in self.variables:
            return self.variables[name]
        if self.parent:
            return self.parent.get_variable(name)
        raise LogoTomaSemanticError(f"Variable '{name}' not found.")
    
    def get_value(self, name):
        if name not in self.variables:
            raise LogoTomaSemanticError(f"Variable '{name}' not found.")
        return self.get_variable(name).value