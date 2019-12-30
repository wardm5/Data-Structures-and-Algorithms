from Data_Structures.Entry.Entry import *

class Map():
    def __init__(self):
        self.array = [None] * 100
        self.size = 100

    def put(self, key, value):
        entry = Entry(key, value)
        hash = hash(key) % 100
        array
