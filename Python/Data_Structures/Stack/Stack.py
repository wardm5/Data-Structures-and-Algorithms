from Data_Structures.Node.Node import *

class Stack():
    def __init__(self):
        self.head = None
        self.count = 0

    def push(self, value):
        if (self.head == None):
            self.head = Node(value)
        else:
            temp = Node(value)
            temp.next = self.head
            self.head = temp
        self.count = self.count + 1
        return True

    def peek(self):
        if (self.head == None):
            return None
        else:
            return self.head.val

    def pop(self):
        if (self.head == None):
            return None
        else:
            temp = self.head.val
            self.head = self.head.next
            self.count = self.count - 1
            return temp

    def isEmpty(self):
        return (self.count > 0)

    def clear(self):
        self.head = None
        self.count = 0
