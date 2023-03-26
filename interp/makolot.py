import pygame

class Makolot:

    def __init__(self, screen: pygame.Surface) -> None:
        self.screen: pygame.Surface = screen
        self.screen_size: tuple = screen.get_size()
        self.makolot = pygame.image.load('./interp/assets/makolot.png').convert_alpha()
        self.img_size = (32, 32)

        self.position: tuple = (self.screen_size[0]/2 - self.img_size[0]/2,
                                self.screen_size[1]/2 - self.img_size[1]/2)
        self.rotation: int = 0

        self.is_engine_enabled: bool = False
        self.velocity: tuple = (0, 0)
        self.wheel_status: int = 0

    def nextFrame(self) -> None:
        self.rotate()
        self.accelerate()

        rotated_image = pygame.transform.rotate(self.makolot, -self.rotation)
        self.move(self.velocity[0], self.velocity[1])

        self.screen.blit(rotated_image, self.position)

    def rotate(self):
        self.rotation += self.wheel_status * 90
        if self.rotation < 0:
            self.rotation += 360
        elif self.rotation > 359:
            self.rotation -= 360

    def accelerate(self):
        if not self.is_engine_enabled:
            return
        if self.rotation == 0:
            self.velocity = (self.velocity[0], self.velocity[1] + 1)
        elif self.rotation == 90:
            self.velocity = (self.velocity[0] + 1, self.velocity[1])
        elif self.rotation == 180:
            self.velocity = (self.velocity[0], self.velocity[1] - 1)
        elif self.rotation == 270:
            self.velocity = (self.velocity[0] - 1, self.velocity[1])

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
        