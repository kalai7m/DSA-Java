package Tree.Recursion;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
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

        System.out.println(preOrder(root));
    }
    public static List<Integer> preOrder(TreeNode root) {
        if(root != null) {
            result.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        return result;
    }
}
