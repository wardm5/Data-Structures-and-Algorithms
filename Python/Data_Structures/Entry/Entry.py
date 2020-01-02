# Entry object to store the key/value data and a pointer to the next Entry object
class Entry():
    def __init__(self, key, value):
        self.key = key
        self.val = value
        self.next = None
