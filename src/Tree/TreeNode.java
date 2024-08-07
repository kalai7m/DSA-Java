package Tree;

public class TreeNode {
    public  int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int data) {
        this.data = data;
    }
    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean equals(Object obj) {
        return this.data == ((TreeNode) obj).data;
    }

    @Override
    public String toString() {
        return this.data+"->";
    }
}
