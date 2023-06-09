from interp.objects.types.bool import Bool_
from interp.objects.types.color import Color_
from interp.objects.types.float import Float_
from interp.objects.types.integer import Integer_
from interp.objects.types.string import String_
from interp.objects.types.types import types
from interp.objects.types.value import Value_

class Variable():
    type: str
    value: any

    def __init__(self, type: str):
        if type not in types.keys():
            raise Exception(f"Unknown type: {type}")
        self.type = type
        self.value = None

    def setValue(self, value: Value_):
        if self.type != value.type:
            raise Exception(f"Cannot set value of type '{value.type}' to variable of type '{self.type}'")
        self.value = value
        