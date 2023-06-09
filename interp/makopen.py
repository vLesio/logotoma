import pygame
from copy import deepcopy
from interp.debugger import debug

class Makopen:

    def __init__(self, screen: pygame.Surface, canvas, position: tuple) -> None:
        self.screen: pygame.Surface = screen
        self.screen_size: tuple = screen.get_size()
        self.canvas = canvas

        self.color = (0,0,0)
        self.width = 1 
        self.isDrawing = True

    def setColor(self, color: tuple) -> None:
        self.color = color

    def draw(self, position: tuple) -> None:
        pos = deepcopy(position)
        if self.isDrawing:
            self.canvas.addDot(pos, self.color, self.width)
    
    def setWidth(self, width) -> None:
        self.width = width

    # def setDrawingState(self, isDrawing: bool) -> None:
    #     self.isDrawing = isDrawing
    
    def switchDrawingState(self) -> None:
        self.isDrawing = not self.isDrawing

    def turnOnDrawing(self) -> None:
        self.isDrawing = True
    
    def turnOffDrawing(self) -> None:
        self.isDrawing = False
        
    def saveCanvas(self, filename: str) -> None:
        pygame.image.save(self.screen, f'{filename}.png')
