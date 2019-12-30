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
            count++;
            return true;
        }
        count++;
        Node<T> temp = new Node(data);
        temp.next = head;
        head = temp;
        return true;
    }
    public T pop() {
        if (head == null) {
            return null;
        }
        count--;
        Node<T> temp = head;
        head = temp.next;
        T result = temp.get();
        return result;
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
