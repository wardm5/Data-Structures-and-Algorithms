public class TreeNode<T> {
    public TreeNode right;
    public TreeNode left;
    private T data;
    public TreeNode() {
        this.data = null;
        right = null;
        left = null;
    }
    public TreeNode(T data) {
        this.data = data;
        right = null;
        left = null;
    }
    public void set(T data) {
        this.data = data;
    }
    public T get() {
        return this.data;
    }
    public void print() {
        System.out.print(this.data + " ");
    }
}
