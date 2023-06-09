from interp.objects.scopes.scope import Scope


class BigScope:
    def __init__(self):
        self.scopes = []

    def add_scope(self):
        self.scopes.append(Scope(self.get_scope()))

    def get_scope(self):
        return self.scopes[-1]
    
    def remove_scope(self):
        self.scopes.pop()