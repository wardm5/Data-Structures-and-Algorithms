// import Node;
import java.util.*;
public class main {
    public static void main(String[] args) {
        newSpace();
        tests("Node");   // done
        tests("Linked List");   // done
        tests("Binary Tree");  // in progress
        tests("Queue");   // done
        tests("Stack");   // done
        newSpace();
        newSpace();
        Map<Integer, String> map = new Map<>();
        map.put(20, "hi");
        System.out.println(map.get(20));  // hi
        System.out.println(map.get(30));  // does not exist
        map.put(30, "test1");
        System.out.println(map.get(30));  // test1
        map.put(20, "test2");
        System.out.println(map.get(20));  // test2
        System.out.println(map.containsValue("elyse"));  // false
        map.put(300, "elyse");
        System.out.println(map.containsValue("elyse"));  // true
        map.clear();
        System.out.println(map.containsKey(30));         // false
        System.out.println(map.containsValue("elyse"));  // false
    }
    public static void tests(String test) {
        if (test.equals("Linked List"))
            linkedListTests(test);
        else if (test.equals("Node"))
            nodeTests(test);
        else if (test.equals("Binary Tree"))
            binaryTreeTests(test);
        else if (test.equals("Queue"))
            queueTests(test);
        else if (test.equals("Stack"))
            stackTests(test);
        newSpace();
    }
    // Linked List
    public static void linkedListTests(String test) {
        testIntro(test);
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
        System.out.println(list.contains(10));  // true
        System.out.println(list.contains(11));  // false
        list.remove(3);
        System.out.println(list.contains(3));   // false
        System.out.println(list.contains(10));  // true
        list.remove(-2);
        list.print();
    }
    public static void nodeTests(String test) {
        testIntro(test);
        Node testNode = new Node<Integer>();
        System.out.println(testNode.get());
        testNode.set(4);
        System.out.println(testNode.get());
        Node testNode2 = new Node<Integer>(10);
        System.out.println(testNode2.get());
    }
    public static void binaryTreeTests(String test) {
        testIntro(test);
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        // // Binary Tree
        // tree.add(5);
        // // System.out.println(tree.add(6));
        // for (int i = 0; i <= 10; i++) {
        //     tree.add(i);
        // }
    }
    public static void queueTests(String test) {
        testIntro(test);
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue.size());
        for (int i = 0; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.contains(-1));  // false
        System.out.println(queue.contains(5));   // true
        System.out.println(queue.contains(10));  // true
        System.out.println(queue.contains(11));  // false
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.remove() + " ");
        }
    }
    public static void stackTests(String test) {
        testIntro(test);
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size());
        for (int i = 0; i <= 10; i++) {
            stack.push(i);
            System.out.println(stack.peek());
        }
        System.out.println(stack.peek()); // should be 10
        System.out.println("Remove from stack");
        for (int i = 0; i < 8; i++) {
            System.out.println(stack.pop() + " ");
        }
        System.out.println("Testing stack methods indvidiually");
        System.out.println("Stack size:  " + stack.size()); // should be 2
        System.out.println("Stack peek:  " + stack.peek()); // should be 2
        System.out.println("Stack pop:   " + stack.pop()); // should be 2
        System.out.println("Stack pop:   " + stack.pop()); // should be 1
        stack.pop();
        stack.pop();
        stack.pop();
    }
    public static void testIntro(String test) {
        System.out.println("****** This is the test section for " + test.toUpperCase() + " ******");
    }
    public static void newSpace() {
        System.out.println();
    }
}
