package Tree.Recursion;

import Tree.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
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

        System.out.println(inOrder(root));
    }
    public static List<Integer> inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            result.add(root.data);
            inOrder(root.right);
        }
        return result;
    }
}
