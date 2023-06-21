
from interp.error_handling.exceptions import LogoTomaLogicError
from interp.objects.types.value import Value_

from interp.objects.types import integer


class Color_(Value_):
    def __init__(self, value: tuple):
        checks = [
            type(value) is tuple,
            len(value) == 3,
            all([type(x) is integer.Integer_ for x in value]),
        ]
        if not all(checks):
            raise ValueError(f"Value {value} cannot be parsed to {type(self)}.")
        
        vals = []
        for val in value:
            vals.append(integer.Integer_(abs(val()) % 256))
        super().__init__('color', tuple(vals))
        

    def __repr__(self) -> str:
        return super().__repr__()
        
    def __str__(self) -> str:
        return f"({self.value[0]}, {self.value[1]}, {self.value[2]})"
        
    def __call__(self):
        return (self.value[0](), self.value[1](), self.value[2]())
        
    def __add__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Color_.__qualname__:
                return Color_((self.value[0] + other.value[0], self.value[1] + other.value[1], self.value[2] + other.value[2]))
            case integer.Integer_.__qualname__:
                return Color_((self.value[0] + other.value, self.value[1] + other.value, self.value[2] + other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot add {o_Type} to {type(self)}.")
            
    def __sub__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Color_.__qualname__:
                return Color_((self.value[0] - other.value[0], self.value[1] - other.value[1], self.value[2] - other.value[2]))
            case integer.Integer_.__qualname__:
                return Color_((self.value[0] - other.value, self.value[1] - other.value, self.value[2] - other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot subtract {o_Type} from {type(self)}.")
            
    def __mul__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Color_((self.value[0] * other.value, self.value[1] * other.value, self.value[2] * other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot multiply {type(self)} by {o_Type}.")
            
    def __truediv__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Color_((self.value[0] // other.value, self.value[1] // other.value, self.value[2] // other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot divide {type(self)} by {o_Type}.")
            
    def __mod__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                return Color_((self.value[0] % other.value, self.value[1] % other.value, self.value[2] % other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot modulo {type(self)} by {o_Type}.")
    
    def cast(self, value: tuple):
        return Color_(value)
