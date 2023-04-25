def handle_exception(func):
    def inner_function(*args, **kwargs):
        try:
            func(*args, **kwargs)
        except Exception as e:
            line = args[1].start.line
            print(f"Exception in line [{line}]: {e}")
            quit()
    return inner_function