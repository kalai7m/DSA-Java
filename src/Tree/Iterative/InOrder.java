package Tree.Iterative;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
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
        Stack<TreeNode> st = new Stack<>();
        List<Integer> inOrderList = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                st.push(cur);
                cur = cur.left; // go to left
            }
            cur = st.pop(); // process the node
            inOrderList.add(cur.data);
            cur = cur.right;
        }
        return inOrderList;
    }
}

/*
Binary-Tree
       1
      / \
     2   3
    / \ / \
   4  5 6  7

InOrder (Left-Root-Right)
[4, 2, 5, 1, 6, 3, 7]
*/
