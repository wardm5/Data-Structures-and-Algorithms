public class LinkedList<T> {
    // to be completed...
    public Node head;
    public LinkedList() {
        head = null;
    }
    public LinkedList(T data) {
        head = new Node(data);
    }
    public boolean add(T data) {
        if (head == null) {
            head = new Node(data);
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        return true;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
    }
}
