package Tree.Recursion;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class postOrder {
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        System.out.println(postOrder(root));
    }
    public static List<Integer> postOrder(TreeNode root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            result.add(root.data);
        }
        return result;
    }
}
