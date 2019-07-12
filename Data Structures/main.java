// import Node;

public class main {
    public static void main(String[] args) {
        Node test = new Node();
        System.out.println(test.get());
        test.set(4);
        System.out.println(test.get());
        Node test2 = new Node(10);
        System.out.println(test2.get());
    }
}
