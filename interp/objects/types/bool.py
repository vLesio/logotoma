
from interp.debugger import debug
from interp.objects.types import integer
from interp.objects.types.value import Value_


class Bool_(Value_):
    def __init__(self, value: str):
        try:
            if value in ['True', True]:
                value = True
            elif value in ['False', False]:
                value = False
            else:
                raise ValueError
        except ValueError:
            raise Exception(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__('bool', value)

    def __mul__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                if other.value < 0:
                    return Bool_(not self.value)
                else:
                    return Bool_(self.value)
            case _:
                raise Exception(f"Cannot multiply {type(self)} with {o_Type}.")

    def __and__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Bool_.__qualname__:
                return Bool_(self.value and other.value)
            case _:
                raise Exception(f"Cannot and {type(self)} with {o_Type}.")
            
    def __or__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Bool_.__qualname__:
                debug.log(f'Comparing {type(self)} with {o_Type}: {self.value or other.value}.')
                return Bool_(self.value or other.value)
            case _:
                raise Exception(f"Cannot or {type(self)} with {o_Type}.")
            
    def __bool__(self):
        return self.value
    

