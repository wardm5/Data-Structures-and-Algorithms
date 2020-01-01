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
        return true

    def peek(self):
        if (self.head == None):
            return None
        else:
            return self.head.val

    
