from interp.objects.types.bool import Bool_
from interp.objects.types.color import Color_
from interp.objects.types.float_ import Float_
from interp.objects.types.integer import Integer_
from interp.objects.types.string import String_
from interp.objects.types.types import types
from interp.objects.types.value import Value_
from interp.error_handling.exceptions import LogoTomaSemanticError, LogoTomaLogicError

class Variable():
    type: str
    value: any

    def __init__(self, type: str):
        if type not in types.keys():
            raise LogoTomaSemanticError(f"Unknown type: {type}")
        self.type = type
        self.value = None

    def __repr__(self):
        return f"<Variable {self.type} : {self.value}>"

    def setValue(self, value: Value_):
        if self.type != value.type:
            raise LogoTomaLogicError(f"Cannot set value of type '{value.type}' to variable of type '{self.type}'")
        self.value = value
        