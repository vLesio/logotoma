
from interp.debugger import debug
from interp.objects.types import integer
from interp.objects.types import string
from interp.objects.types.value import Value_
from interp.error_handling.exceptions import LogoTomaValueError, LogoTomaLogicError


class Bool_(Value_):
    def __init__(self, value: str):
        try:
            if value in ['True', True]:
                value = True
            elif value in ['False', False]:
                value = False
            else:
                raise LogoTomaValueError(f"Value {value} cannot be parsed to {type(self)}.")
        except LogoTomaValueError:
            raise LogoTomaValueError(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__('bool', value)

    def __add__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case string.String_.__qualname__:
                return string.String_(str(self.value) + str(other.value))
            case _:
                raise LogoTomaLogicError(f"Cannot add {o_Type} to {type(self)}.")


    def __mul__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case integer.Integer_.__qualname__:
                if other.value < 0:
                    return Bool_(not self.value)
                else:
                    return Bool_(self.value)
            case _:
                raise LogoTomaLogicError(f"Cannot multiply {type(self)} with {o_Type}.")

    def __and__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Bool_.__qualname__:
                return Bool_(self.value and other.value)
            case _:
                raise LogoTomaLogicError(f"Cannot and {type(self)} with {o_Type}.")
            
    def __or__(self, other):
        o_Type = type(other)
        match o_Type.__qualname__:
            case Bool_.__qualname__:
                debug.log(f'Comparing {type(self)} with {o_Type}: {self.value or other.value}.')
                return Bool_(self.value or other.value)
            case _:
                raise LogoTomaLogicError(f"Cannot or {type(self)} with {o_Type}.")
            
    def __bool__(self):
        return self.value
    
    def cast(self, value: str):
        return Bool_(value)

