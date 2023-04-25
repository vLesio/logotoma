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
        return f'{self.value}'
    
    def __call__(self):
        return self.value
    
    
    def __lt__(self, other):
        return self.value < other.value
    
    def __le__(self, other):
        return self.value <= other.value
    
    def __eq__(self, other):
        return self.value == other.value
    
    def __ne__(self, other):
        return self.value != other.value
    
    def __gt__(self, other):
        return self.value > other.value
    
    def __ge__(self, other):
        return self.value >= other.value
    
