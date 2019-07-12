import java.util.*;
public class BinarySearchTree<T> {
    private int count;
    public TreeNode root;
    public BinarySearchTree() {
        root = null;
        count = 0;
    }
    public BinarySearchTree(T data) {
        root = new TreeNode(data);
        count = 1;
    }
    public boolean add(T data) {
        if (root == null) {
            root = new TreeNode(data);
            return true;
        }
        // TreeNode tempRoot = root;
        // while (tempRoot != null) {
        //     if (tempRoot.get() > data && tempRoot.left == null) {
        //         tempRoot.left = new TreeNode(data);
        //     } else if (tempRoot.get() < data && tempRoot.right == null) {
        //         tempRoot.right = new TreeNod(data);
        //     } else if (tempRoot.get() > data) {
        //         tempRoot = tempRoot.left;
        //     } else  {
        //         tempRoot = tempRoot.right;
        //     }
        // }
        return true;
    }
    public void print() {
        if (root == null) {
            System.out.println("nothing in  tree");
            return;
        }
        if (root != null) {
            root.print();

        }
        System.out.println();
        // Stack<TreeNode> stack = new Stack<>();
        // stack.push(root);
        // while(!stack.isEmpty()) {
        //     tempRoot = stack.pop();
        //     if (tempRoot != null) {
        //         tempRoot.print();
        //     }
        //     stack.push(tempRoot.left);
        //     stack.push(tempRoot.right);
        // }
    }
}
