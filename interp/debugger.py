class Debugger():
    debug = False

    def log(self, msg):
        if self.debug:
            print(f'[DEBUG-LOG]: {msg}')

    def logWarning(self, msg):
        if self.debug:
            print(f"[DEBUG-WARNING]: {msg}")

    def logError(self, msg):
        if self.debug:
            print(f"[DEBUG-ERROR]: {msg}")

debug = Debugger()