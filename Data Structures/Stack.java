public class Stack<T> {
    private Node<T> head;
    private int count;
    public Stack() {
        this.head = null;
        this.count = 0;
    }
    public Stack(T data) {
        this.head = new Node(data);
        this.count = 1;
    }
    public boolean push(T data) {
        if (head == null) {
            head = new Node(data);
            return true;
        }
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public T pop() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = temp.next;
        return temp.get();
    }
    public T peek() {
        if (head == null)
            return null;
        return head.get();
    }
    public int size() {
        return count;
    }
}
