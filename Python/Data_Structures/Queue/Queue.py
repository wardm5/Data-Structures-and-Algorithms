from Data_Structures.Node.Node import *

class Queue():
    def __init__(self, value = 0):
        self.head = None
        self.tail = None
        self.count = 0

    def add(self, value):
        if (self.head == None):
            self.head = Node(value)
            self.tail = self.head
        else:
            curr = self.head
            while (curr.next != None):
                curr = curr.next
            curr.next = Node(value)
            tail = curr.next
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

    def peek(self):
        if (self.head != None):
            return self.head.val
        else:
            return None

    def size(self):
        return self.count

    def contains(self, value):
        curr = self.head
        while (curr != None):
            if (curr.val == value):
                return True
            curr = curr.next
        return False

    def clear(self):
        self.head = None
        self.tail =  None
        self.count = 0
