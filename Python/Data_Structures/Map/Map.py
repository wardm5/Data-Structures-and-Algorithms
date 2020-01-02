from Data_Structures.Entry.Entry import *

class Map():
    def __init__(self, size):
        self.array = [None] * size
        self.size = size

    def put(self, key, value):
        hashVal = hash(key) % self.size
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
        hashVal = hash(key) % self.size
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
        hashVal = hash(key) % self.size
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

    # Returns true if this map contains a mapping for the specified key.
    def containsKey(self, key):
        hashVal = hash(key) % self.size
        if (self.array[hashVal] == None):
            return False
        else:
            curr = self.array[hashVal]
            while(curr != None):
                if (curr.key == key):
                    return True
                curr = curr.next
        return False

    # Returns true if this map maps one or more keys to the specified value.
    def containsValue(self, value):
        for item in self.array:
            if (item != None):
                curr = item
                while(curr != None):
                    if (curr.val == value):
                        return True
                    curr = curr.next
        return False

    def clear(self):
        self.array.clear()
        self.array = [None] * self.size

    # Returns true if this map contains no key-value mappings.
    def isEmpty(self):
        for item in self.array:
            if (item != None):
                return False
        return True
