
from interp.debugger import debug
from interp.objects.types.value import Value_

from interp.objects.types import float
from interp.objects.types import integer
from interp.objects.types import color


class String_(Value_):
    def __init__(self, value: str):
        try:
            value = str(value)
        except ValueError:
            raise Exception(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__('string', value)

    def __add__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case String_.__qualname__:
                return String_(self.value + other.value)
            case integer.Integer_.__qualname__:
                return String_(self.value + str(other.value))
            case float.Float_.__qualname__:
                return String_(self.value + str(other.value))
            case color.Color_.__qualname__:
                return String_(self.value + str(other.value))
            case _:
                raise Exception(f"Cannot add {o_Type} to {type(self)}.")
            
    def __mul__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return String_(self.value * other.value)
            case _:
                raise Exception(f"Cannot multiply {type(self)} by {o_Type}.")
    

