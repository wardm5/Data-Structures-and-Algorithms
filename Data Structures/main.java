// import Node;

public class main {
    public static void main(String[] args) {
        Node test = new Node<Integer>();
        System.out.println(test.get());
        test.set(4);
        System.out.println(test.get());
        Node test2 = new Node<Integer>(10);
        System.out.println(test2.get());
        System.out.println("test2");
        LinkedList list = new LinkedList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.print();
    }
}
