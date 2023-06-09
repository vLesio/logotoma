from interp.objects.variable import Variable


class Scope:
    def __init__(self, parent=None):
        self.parent = parent
        self.variables = {}

    def __str__(self):
        return f"Scope: {self.variables}"
    
    def __repr__(self):
        return f"Scope: {self.variables}"
    
    def add_variable(self, name, type):
        if name in self.variables:
            raise Exception(f"Variable '{name}' already exists.")
        self.variables[name] = Variable(type)
        print(f'Added variable: {self.variables[name]}')

    def set_variable(self, name, value):
        if name in self.variables:
            self.variables[name].setValue(value)
            print(f'Set variable: {self.variables[name]}')
            return
        if self.parent:
            self.parent.set_variable(name, value)
            return
        raise Exception(f"Variable '{name}' not found.")
    
    def get_variable(self, name):
        if name in self.variables:
            print(f'Got variable: {self.variables[name]}')
            return self.variables[name]
        if self.parent:
            return self.parent.get_variable(name)
        raise Exception(f"Variable '{name}' not found.")
    
    def get_value(self, name):
        return self.get_variable(name).value