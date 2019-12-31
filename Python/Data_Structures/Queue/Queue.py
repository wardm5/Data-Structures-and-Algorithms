from Data_Structures.Node.Node import *

    def __init__(self):
        self.head = None
        self.tail = None
        self.count = 0

    def __init__(self, value):
        self.head = Node(value)
        self.tail =  self.head
        self.count = 0

    def add(self, value):
        if (self.head == None):
            self.head = Node(value)
            self.tail = head
        else:
            tail.next =  Node(value)
            tail = tail.next
        return True


    def remove(self):
        if (self.head != None):
            res = self.head.val
            self.head = self.head.next
            return res
        else:
            return None
