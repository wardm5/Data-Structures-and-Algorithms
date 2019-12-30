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
        if (self.head == None):
            return
        # else:
            # prior = self.head
            # while(prior != None)
        print("remove")

    def contains(self, value):
        print("search" + val)

    def clear(self):
        self.head = None
        self.count = 0
        print("cleared data", self.count)

    def print(self):
        if (self.head == None):
            print("nothing in list")
        else:
            prior = self.head
            while (prior != None):
                print(prior.val, "", end="")
                prior = prior.next
        print("")
