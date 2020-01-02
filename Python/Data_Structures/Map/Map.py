# descriptions from https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
from Data_Structures.Entry.Entry import *

class Map():
    def __init__(self, size):
        self.array = [None] * size
        self.size = size
        self.count = 0

    # Associates the specified value with the specified key in this map (optional operation).
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
        self.count = self.count + 1

    # Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
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

    # Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
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

    # Removes the mapping for a key from this map if it is present (optional operation).
    def remove(self, key):
        hashVal = hash(key) % self.size

    # Removes all of the mappings from this map (optional operation).
    def clear(self):
        self.array.clear()
        self.array = [None] * self.size

    # Returns true if this map contains no key-value mappings.
    def isEmpty(self):
        return self.count > 0

    def size(self):
        return self.count
