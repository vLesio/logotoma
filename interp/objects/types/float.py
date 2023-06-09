from interp.objects.types import integer
from interp.objects.types import string
from interp.objects.types.value import Value_
from interp.error_handling.exceptions import LogoTomaValueError, LogoTomaLogicError


class Float_(Value_):
    def __init__(self, value: str):
        try:
            value = float(value)
        except ValueError:
            raise LogoTomaValueError(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__('float', value)

    def __add__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Float_(self.value + other.value)
            case Float_.__qualname__:
                return Float_(self.value + other.value)
            case string.String_.__qualname__:
                return string.String_(str(self.value) + str(other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot add {o_Type} to {type(self)}.")
        
    def __sub__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Float_(self.value - other.value)
            case Float_.__qualname__:
                return Float_(self.value - other.value)
            case _:
                raise LogoTomaLogicError(f"Cannot subtract {o_Type} from {type(self)}.")
            
    def __mul__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Float_(self.value * other.value)
            case Float_.__qualname__:
                return Float_(self.value * other.value)
            case _:
                raise LogoTomaLogicError(f"Cannot multiply {type(self)} by {o_Type}.")
    
    def __truediv__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Float_(self.value / other.value)
            case Float_.__qualname__:
                return Float_(self.value / other.value)
            case _:
                raise LogoTomaLogicError(f"Cannot divide {type(self)} by {o_Type}.")
            
    def __mod__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Float_(self.value % other.value)
            case Float_.__qualname__:
                return Float_(self.value % other.value)
            case _:
                raise LogoTomaLogicError(f"Cannot modulo {type(self)} by {o_Type}.")
