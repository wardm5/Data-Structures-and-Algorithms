from Data_Structures.Node.Node import *

# Node Tests
print("Node Tests: ")
head = Node(0)
prior = head

# create linked list
for i in range(10):
    temp = Node(i + 1)
    prior.next = temp
    prior = prior.next

# test out linked list
print("Create 10 items, print items out. ")
prior = head
while (prior != None):
    print(prior.val, " ", end="")
    prior = prior.next
print("\n")

print("LinkedList Tests: ")
from Data_Structures.LinkedList.LinkedList import *

list = LinkedList(5)
print(list.contains(6))
list.add(6)
list.add(8)
list.print()
list.remove(8)
print(list.contains(6))
list.print()
list.clear()
list.print()

from Data_Structures.Map.Map import *
map = Map()
# map.put(23, "test")
# map.put(100, "test2")
# print(map.get(23)) # print test
# print(map.get(24)) # print none
# print(map.getOrDefault(24, 0)) # print 0
# print(map.get(100)) # should print test2
for i in range(100):
    value = "test" + str(i)
    map.put(i, value)

print(map.get(12))  # prints test12
print(map.getOrDefault(101, 0)) # print 0
print(map.get(101))  # prints test12
map.put(101, "test101")
print(map.getOrDefault(101, 0)) # print 0
print(map.get(101))  # prints test12
map.clear()
print(map.get(101))


# print()
# fix to issue with % sign showing at the end of the python script
# https://stackoverflow.com/questions/36270945/percent-sign-at-the-end-of-the-output-of-python-script
