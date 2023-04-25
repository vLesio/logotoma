
from interp.objects.types.value import Value_


class Bool_(Value_):
    def __init__(self, value: str):
        try:
            if value in ['True']:
                value = True
            elif value in ['False']:
                value = False
            else:
                raise ValueError
        except ValueError:
            raise Exception(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__('bool', value)

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
                return Bool_(self.value or other.value)
            case _:
                raise Exception(f"Cannot or {type(self)} with {o_Type}.")
    

