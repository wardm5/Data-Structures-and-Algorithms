from Data_Structures.Entry.Entry import *

class Map():
    def __init__(self):
        self.array = [None] * 100

    def put(self, key, value):
        hashVal = hash(key) % 100
        if (self.array[hashVal] == None):
            self.array[hashVal] = Entry(key, value)
        else:
            curr = self.array[hashVal]
            while (curr.next != None):
                if (curr.key == key):
                    oldVal = curr.val
                    curr.val = value
                    return oldVal
                curr = curr.next
            curr.next = Entry(key, value)

    def getOrDefault(self, key, defaultVal):
        hashVal = hash(key) % 100
        if (self.array[hashVal] == None):
            return defaultVal
        else:
            curr = self.array[hashVal]
            while (curr != None):
                if (curr.key == key):
                    return curr.val
                else:
                    curr = curr.next
            return defaultVal

    def get(self, key):
        hashVal = hash(key) % 100
        if (self.array[hashVal] == None):
            return None
        else:
            curr = self.array[hashVal]
            while (curr != None):
                if (curr.key == key):
                    return curr.val
                else:
                    curr = curr.next
            return None

    def clear(self):
        self.array.clear()
        self.array = [None] * 100
