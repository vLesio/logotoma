from functools import wraps
from interp.error_handling import exceptions as ex

def handle_exception(func):
    
    @wraps(func)
    def inner_function(*args, **kwargs):
        try:
            func(*args, **kwargs)
            
        except ex.LogoTomaException as e:
            
            # line_text 
            line_number = args[1].start.line
            character_number = args[1].start.column
            print('\n')
            print('- ' * 30)
            print(f"{e.__name__()} occured in line [{line_number} | {character_number}]:\n{e}\n")
            
            quit()
            
    return inner_function
