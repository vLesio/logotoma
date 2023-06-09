import pygame
import math
from interp.makopen import Makopen

class Makolot:
    def __init__(self, screen: pygame.Surface, canvas) -> None:
        self.velocity_value = 0
        self.screen: pygame.Surface = screen
        self.screen_size: tuple = screen.get_size()
        self.makolot = pygame.image.load('./interp/assets/makolot2.png').convert_alpha()
        self.img_size = (32, 32)

        self.position: tuple = (self.screen_size[0]/2 - self.img_size[0]/2,
                                self.screen_size[1]/2 - self.img_size[1]/2)
        self.rotation: int = 90
        self.is_engine_enabled: bool = False
        self.is_visible: bool = True
        self.velocity: tuple = (0, 0)
        self.wheel_status: int = 0
        self.makopen = Makopen(screen, canvas, self.get_center_position())

    def nextFrame(self) -> None:
        self.rotate()
        self.accelerate()
        
        rotated_image = pygame.transform.rotate(self.makolot, -self.rotation)
        self.move(self.velocity[0], self.velocity[1])
        if self.is_visible:
            self.makopen.draw(self.get_center_position())
            self.screen.blit(rotated_image, self.position)
        

    def hide(self) -> None:
        self.is_visible = False

    def show(self) -> None:
        self.is_visible = True

    def rotate(self):
        self.rotation += self.wheel_status * 1
        self.rotation %= 360

    def accelerate(self):
        if not self.is_engine_enabled:
            return
        # Convert rotation to radians
        theta = math.radians(self.rotation)

        # Calculate x and y components of velocity
        x_vel = math.sin(theta)
        y_vel = math.cos(theta)

        # Scale velocity by a constant factor
        velocity_scale = 0.2
        self.velocity = (self.velocity[0] + x_vel * velocity_scale, self.velocity[1] + y_vel * velocity_scale)

    def move(self, right: int, up: int):
        self.position = (self.position[0] + right, self.position[1] - up)
        while self.position[0] + self.img_size[0]/2 < 0:
            self.position = (self.position[0] + self.screen_size[0], self.position[1])
        while self.position[0] + self.img_size[0]/2 > self.screen_size[0]:
            self.position = (self.position[0] - self.screen_size[0], self.position[1])   
        while self.position[1] + self.img_size[1]/2 < 0:
            self.position = (self.position[0], self.position[1] + self.screen_size[1])
        while self.position[1] + self.img_size[1]/2 > self.screen_size[1]:
            self.position = (self.position[0], self.position[1] - self.screen_size[1])   

    def enable_engine(self):
        self.is_engine_enabled = True

    def disable_engine(self):
        self.is_engine_enabled = False

    def set_wheel_state(self, state: str):
        if state.lower() == 'left':
            self.wheel_status = -1
        elif state.lower() == 'right':
            self.wheel_status = 1
        else:
            self.wheel_status = 0
    
    def get_center_position(self) -> tuple:
        return (self.position[0] + self.img_size[0]/2, self.position[1] + self.img_size[1]/2)
        