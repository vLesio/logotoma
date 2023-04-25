from interp.objects.types.value import Value_


class Integer_(Value_):
    def __init__(self, type: str, value: str):
        try:
            value = int(value)
        except ValueError:
            raise Exception(f"Value {value} cannot be parsed to {type(self)}.")
        super().__init__(type, value)
