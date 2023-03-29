import pygame

class Canvas:
    def __init__(self, screen: pygame.Surface) -> None:
        self.screen = screen
        self.canvas = pygame.Surface(screen.get_size())
        self.canvas.fill((255, 255, 255))

    def nextFrame(self) -> None:
        self.screen.blit(self.canvas, (0, 0))