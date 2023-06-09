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

    def setValue(self, value: Value_):
        if self.type != value.type:
            raise LogoTomaLogicError(f"Cannot set value of type '{value.type}' to variable of type '{self.type}'")
        self.value = value