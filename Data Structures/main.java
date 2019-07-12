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
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.isEmpty());
        for (int i = 0; i <= 10; i++) {
            list.addToTail(i);
        }
        list.addToHead(-1);
        list.print();
        System.out.println(list.isEmpty());     // false
        System.out.println(list.contains(-1));  // true
        System.out.println(list.contains(3));   // true
        System.out.println(list.contains(11));  // false
        list.remove(3);
        System.out.println(list.contains(3));   // false
        System.out.println(list.contains(10));  // true
        list.remove(-2);
        list.print();
    }
}
