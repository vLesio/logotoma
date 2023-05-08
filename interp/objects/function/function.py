from interp.objects.variable import Variable
from interp.environment import Environment
class Function_:
    def __init__(self, name, return_type, args:list[tuple], body, global_scope:Environment = None):
        self.name = name
        self.return_type = return_type
        self.args = args
        self.body = body
        self.scope = {}
        self.global_scope = global_scope

    def __repr__(self):
        return f"<Function {self.name} {self.args} {self.body}>"

    def __str__(self):
        return f"<Function {self.name} {self.args} {self.body}>"

    def __call__(self, *args):
        if self._check_input_integrity(*args):
            # TODO: temporary solution (without local scope)
            self._add_vars_to_global_scope(*args)
            
            return self.body
        
        raise Exception(f"Wrong input for function '{self.name}'.")
    
    # def _add_vars_to_scope(self, *args):
    #     for arg, arg_type in zip(args, self.args):
    #         self.scope[arg_type[0]] = Variable(arg_type[0], arg_type[1], arg)
    
    def is_void_type(self):
        # TODO: to implement return void type
        return self.return_type == "void"
    
    def _add_vars_to_global_scope(self, *args):
        for arg, arg_type in zip(args, self.args):
            self.global_scope.add_global_variable(arg_type[0], arg_type[1])
            self.global_scope.set_global_variable(arg_type[0], arg)
            
    def remove_vars_from_global_scope(self, *args):
        for arg, arg_type in zip(args, self.args):
            self.global_scope.remove_global_variable(arg_type[0])
    
    # TODO: check if this is works
    def _check_input_integrity(self, *args):
        if len(args) != len(self.args):
            raise Exception(f"Wrong number of arguments for function '{self.name}'. Expected {len(self.args)}, got {len(args)}.")
        for i, (arg, arg_type) in enumerate(zip(args, self.args)):
            # Does qualname work?
            if arg_type[0].__qualname__ != type(arg).__qualname__:
                raise Exception(f"Wrong type of argument {i} for function '{self.name}'. Expected {arg_type[0]}, got {type(arg)}.")
        return True