from Data_Structures.Node.Node import *

# Node Tests
head = Node(0)
prior = head

# create linked list
for i in range(10):
    temp = Node(i + 1)
    prior.next = temp
    prior = prior.next

# test out linked list
prior = head
while (prior != None):
    print(prior.val, " ", end="")
    prior = prior.next
print()

from Data_Structures.LinkedList.LinkedList import *
list = LinkedList(5)
list.add(6)
list.print()



print()
# fix to issue with % sign showing at the end of the python script
# https://stackoverflow.com/questions/36270945/percent-sign-at-the-end-of-the-output-of-python-script
