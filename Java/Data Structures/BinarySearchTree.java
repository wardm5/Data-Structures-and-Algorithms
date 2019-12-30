public class BinarySearchTree<T extends Comparable<T>>  {
    private int count;
    public TreeNode<T> root;
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
        TreeNode<T> tempRoot = root;
        while (tempRoot != null) {
            if (tempRoot.get().compareTo(data) > 0 && tempRoot.left == null) {
                tempRoot.left = new TreeNode(data);
                count++;
                System.out.println("left  " + data);
            } else if (tempRoot.get().compareTo(data) < 0 && tempRoot.right == null) {
                tempRoot.right = new TreeNode(data);
                count++;
                System.out.println("right  " + data + "     " + tempRoot.get());
            } else if (tempRoot.get().compareTo(data) > 0) {
                tempRoot = tempRoot.left;
            } else  {
                tempRoot = tempRoot.right;
            }
        }
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
