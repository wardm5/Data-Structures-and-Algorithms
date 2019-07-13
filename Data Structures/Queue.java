public class Queue<T> {
    // FIFO
    private Node head;
    private int count;
    public Queue() {
        head = null;
        count = 0;
    }
    public Queue(T data) {
        head = new Node(data);
        count++;
    }
    public boolean add(T data) {
        if (head == null) {
            head = new Node(data);
            count++;
            return true;
        }
        Node prior;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        count++;
        return true;
    }
    public T remove() {
        Node temp = head;
        T result = temp.get();
        head = temp.next;
    }
}
