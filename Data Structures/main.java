// import Node;

public class main {
    public static void main(String[] args) {
        // Node
        Node test = new Node<Integer>();
        System.out.println(test.get());
        test.set(4);
        System.out.println(test.get());
        Node test2 = new Node<Integer>(10);
        System.out.println(test2.get());
        System.out.println("test2");
        // linked list
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
        newSpace();
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        // // Binary Tree
        // tree.add(5);
        // // System.out.println(tree.add(6));
        // for (int i = 0; i <= 10; i++) {
        //     tree.add(i);
        // }

        // Queue
        newSpace();
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue.size());
        for (int i = 0; i <= 10; i++) {
            queue.add(i);
        }
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void newSpace() {
        System.out.println();
        System.out.println();
    }
}
