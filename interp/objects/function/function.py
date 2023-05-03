class Function_:
    def __init__(self, name, return_type, args, body):
        self.name = name
        self.return_type = return_type
        self.args = args
        self.body = body

    def __repr__(self):
        return f"<Function {self.name} {self.args} {self.body}>"

    def __str__(self):
        return f"<Function {self.name} {self.args} {self.body}>"

    def __call__(self, *args):
        if self._check_input_integrity(*args):
            
            return self.body
        raise Exception(f"Wrong input for function '{self.name}'.")
    
    def _add_vars_to_scope(self, *args):
        for arg, arg_type in zip(args, self.args):
            self.scope[arg] = Variable(arg_type[0], arg_type[1], arg)
    
    def _check_input_integrity(self, *args):
        if len(args) != len(self.args):
            raise Exception(f"Wrong number of arguments for function '{self.name}'. Expected {len(self.args)}, got {len(args)}.")
        for i, (arg, arg_type) in enumerate(zip(args, self.args)):
            if arg_type[0].__qualname__ != type(arg).__qualname__:
                raise Exception(f"Wrong type of argument {i} for function '{self.name}'. Expected {arg_type[0]}, got {type(arg)}.")
        return True