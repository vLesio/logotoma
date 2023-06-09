from interp.objects.types import bool

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
    
    def __repr__(self):
        return f'zmienna typu {self.type}'
    
    def __call__(self):
        return self.value
    
    
    def __lt__(self, other):
        return bool.Bool_(self.value < other.value)
    
    def __le__(self, other):
        return bool.Bool_(self.value <= other.value)
    
    def __eq__(self, other):
        return bool.Bool_(self.value == other.value)
    
    def __ne__(self, other):
        return bool.Bool_(self.value != other.value)
    
    def __gt__(self, other):
        return bool.Bool_(self.value > other.value)
    
    def __ge__(self, other):
        return bool.Bool_(self.value >= other.value)
    
