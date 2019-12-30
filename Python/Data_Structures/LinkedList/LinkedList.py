from Data_Structures.Node.Node import *

class LinkedList():
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
        print("added ", value)

    def remove(self, val):
        print("remove")

    def search(self, val):
        print("search" + val)

    def clear():
        print("clear")

    def print(self):
        prior = self.head
        while (prior != None):
            print(prior.val, end="")
            prior = prior.next
