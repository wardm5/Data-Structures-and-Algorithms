from Data_Structures.Node.Node import *

class LinkedList():
    # initalize with no value
    def __init__(self):
        self.head = None
        self.count = 0

    # initalize with first value
    def __init__(self, value):
        self.head = Node(value)
        self.count = 1

    def add(self, value):
        if (self.head == None):
            self.head = Node(value)
        else:
            prior = self.head
            while (prior.next != None):
                prior = prior.next
            prior.next = Node(value)
        self.count = self.count + 1
        return True

    def remove(self, value):
        prior = None
        curr = self.head
        if (curr != None):
            if (curr.val == value):
                self.head = curr.next
                self.count = self.count - 1
                return
        while(curr != None):
            if (curr.val == value):
                prev.next = curr.next
                return True
                self.count = self.count - 1
                return
            prev = curr
            curr = curr.next
        return False

    def contains(self, value):
        prior = self.head
        while (prior != None):
            if (prior.val == value):
                return True
            prior = prior.next
        return False

    def clear(self):
        self.head = None
        self.count = 0
        return True

    def print(self):
        if (self.head == None):
            print("nothing in list")
        else:
            prior = self.head
            while (prior != None):
                print(prior.val, "", end="")
                prior = prior.next
        print("")
