import pygame

class Makopen:

    def __init__(self, screen: pygame.Surface, position: tuple) -> None:
        self.screen: pygame.Surface = screen
        self.screen_size: tuple = screen.get_size()

        self.last_position = position

        self.color = (0,0,0)

        self.isDrawing = True

    def setColor(self, color: tuple) -> None:
        self.color = color

    def draw(self, position: tuple) -> None:
        if self.isDrawing:
            pygame.draw.line(self.screen, self.color, self.last_position, position)
        self.last_position = position

    def setDrawingState(self, isDrawing: bool) -> None:
        self.isDrawing = isDrawing
    
    def switchDrawingState(self) -> None:
        self.isDrawing = not self.isDrawing

    def turnOnDrawing(self) -> None:
        self.isDrawing = True
    
    def turnOffDrawing(self) -> None:
        self.isDrawing = False