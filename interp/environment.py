from interp.objects.variable import Variable


class Environment():
    
    def __init__(self) -> None:
        self.global_scope = {}
        self.scope_stack = [{}]

    def add_scope(self):
        self.scope_stack.append({})

    def get_scope(self):
        return self.scope_stack[-1]

    def remove_scope(self):
        self.scope_stack.pop()

    
    def add_variable(self, name, type):
        if name in self.get_scope():
            raise Exception(f"Variable '{name}' already exists.")
        self.get_scope()[name] = Variable(type)

    def get_variable(self, name):
        for scope in reversed(self.scope_stack):
            if name in scope:
                return scope[name]
        raise Exception(f"Variable '{name}' not found.")
    
    def get_value(self, name):
        return self.get_variable(name).value
    
    def set_variable(self, name, value):
        for scope in reversed(self.scope_stack):
            if name in scope:
                scope[name].setValue(value)
                return
        raise Exception(f"Variable '{name}' not found.")
    
    # PO CO MY TO ROBIMY???
    
    def add_global_variable(self, name, type):
        if name in self.global_scope:
            raise Exception(f"Variable '{name}' already exists.")
        self.global_scope[name] = Variable(type)

    def get_global_variable(self, name):
        print(self.global_scope.keys())
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
