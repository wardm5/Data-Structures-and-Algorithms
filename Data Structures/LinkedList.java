public class LinkedList<T> {
    // to be completed...
    private int count;
    public Node head;
    public LinkedList() {
        head = null;
        count = 0;
    }
    public LinkedList(T data) {
        head = new Node(data);
        count = 1;
    }
    public boolean addToTail(T data) {
        if (head == null) {
            head = new Node(data);
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        count++;
        return true;
    }
    public boolean addToHead(T data) {
        if (head == null) {
            head = new Node(data);
            return true;
        }
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        return true;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
        System.out.println();
    }
    public boolean remove(T data) {
        // if (head == null)
        //     return false;
        // Node temp = head;
        // while (temp.next != null) {
        //     if (temp.get() == data) {
        //
        //     }
        // }
        return true;
    }
    public boolean contains() {
        // if (head == null)
        //     return false;
        // Node temp = head;
        // while (temp.next != null) {
        //     if (temp.get() == data) {
        //
        //     }
        // }
        return true;
    }
    public boolean isEmpty() {
        return (count == 0);
    }

}
