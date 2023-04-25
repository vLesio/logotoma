types = ['bool', 'int', 'float', 'string', 'color']

class Value_():
    type = None
    value = None

    def __init__(self, type, value):
        if type not in types:
            raise Exception(f"Unknown type: {type}")
        self.type = type
        self.value = value

    def __str__(self):
        return f'Type: {self.type}, Value: {self.value}'
    
    def __call__(self):
        return self.value