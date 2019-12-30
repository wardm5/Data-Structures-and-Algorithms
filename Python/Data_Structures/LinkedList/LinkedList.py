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
        print("added", value)

    def remove(self, value):
        print("remove")

    def search(self, value):
        print("search" + val)

    def clear():
        self.head = None
        print("cleared data")

    def print(self):
        prior = self.head
        while (prior != None):
            print(prior.val, end="")
            prior = prior.next
