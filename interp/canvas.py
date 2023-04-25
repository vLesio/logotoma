import pygame

class Dot:
    def __init__(self, position: tuple, color: tuple, size: float) -> None:
        self.position = position
        self.color = color
        self.size = size

class Canvas:
    def __init__(self, screen: pygame.Surface) -> None:
        self.screen = screen
        self.canvas = pygame.Surface(screen.get_size())
        self.canvas.fill((255, 255, 255))

        self.points = []

    def nextFrame(self) -> None:
        for dot in self.points:
            pygame.draw.circle(self.screen, dot.color, dot.position, dot.size)
    
    def addDot(self, position: tuple, color: tuple, size=1.0) -> None:
        self.points.append(Dot(position, color, size))