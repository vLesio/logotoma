from interp.objects.types.value import Value_

from interp.objects.types import float
from interp.objects.types import string
from interp.objects.types import color


class Integer_(Value_):
    def __init__(self, value: str):
        try:
            value = int(value)
        except ValueError:
            raise Exception(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__('int', value)
        
    def __repr__(self) -> str:
        return super().__repr__()

    def __add__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Integer_.__qualname__:
                return Integer_(self.value + other.value)
            case float.Float_.__qualname__:
                return float.Float_(self.value + other.value)
            case string.String_.__qualname__:
                return string.String_(str(self.value) + str(other.value))
            case _:
                raise Exception(f"Cannot add {o_Type} to {type(self)}.")
            
    def __sub__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Integer_.__qualname__:
                return Integer_(self.value - other.value)
            case float.Float_.__qualname__:
                return float.Float_(self.value - other.value)
            case _:
                raise Exception(f"Cannot subtract {o_Type} from {type(self)}.")
            
    def __mul__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Integer_.__qualname__:
                return Integer_(self.value * other.value)
            case float.Float_.__qualname__:
                return float.Float_(self.value * other.value)
            case _:
                raise Exception(f"Cannot multiply {type(self)} by {o_Type}.")
            
    def __truediv__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Integer_.__qualname__:
                return Integer_(self.value // other.value)
            case float.Float_.__qualname__:
                return float.Float_(self.value / other.value)
            case _:
                raise Exception(f"Cannot divide {type(self)} by {o_Type}.")
            
    def __mod__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Integer_.__qualname__:
                return Integer_(self.value % other.value)
            case float.Float_.__qualname__:
                return float.Float_(self.value % other.value)
            case _:
                raise Exception(f"Cannot modulo {type(self)} by {o_Type}.")
            