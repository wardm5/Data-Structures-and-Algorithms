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
    public boolean add(T data)

}
