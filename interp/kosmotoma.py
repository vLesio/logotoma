import pygame
import time
from interp.canvas import Canvas
from interp.environment import Environment

from interp.makolot import Makolot

class KosmoToma:

    window_name: str = 'LogoToma'
    window_size: tuple = (800, 600)
    default_color: tuple = (255, 255, 255)

    def __init__(self) -> None:
        pygame.init()
        pygame.display.set_caption(self.window_name)
        self.screen = pygame.display.set_mode((800, 600))
        self.env = Environment()
        self.canvas = Canvas(self.screen)
        self.makolot = Makolot(self.screen, self.canvas)

    def nextFrame(self) -> None:
            self.screen.fill(self.default_color)
            self.canvas.nextFrame()
            self.makolot.nextFrame()
            pygame.display.flip()

    def sleep(self, frames: int):
         for _ in range(frames):
              self.nextFrame()
              time.sleep(0.05)
