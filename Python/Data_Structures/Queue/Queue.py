from Data_Structures.Node.Node import *

    def __init__(self):
        self.head = None
        self.tail = None
        self.count = 0

    def __init__(self, value):
        self.head = Node(value)
        self.tail =  self.head
        self.count = 1

    def add(self, value):
        if (self.head == None):
            self.head = Node(value)
            self.tail = head
        else:
            tail.next =  Node(value)
            tail = tail.next
        self.count = self.count + 1
        return True

    def remove(self):
        if (self.head != None):
            res = self.head.val
            self.head = self.head.next
            self.count = self.count - 1
            return res
        else:
            return None

    def size(self):
        return self.count

    def contains():
        
