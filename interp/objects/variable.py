types = {
    "bool": bool,
    "int": int,
    "float": float,
    "string": str,
    "color": tuple
}

class Variable():
    type: str
    value: any

    def __init__(self, type: str):
        if type not in types.keys():
            raise Exception(f"Unknown type: {type}")
        self.type = type
        self.value = None

    def setValue(self, value: any):
        if type(value) is not types[self.type]:
            raise Exception(f"Type mismatch: {self.type} != {type(value)}")
        self.value = value