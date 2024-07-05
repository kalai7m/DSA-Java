package Tree.Iterative;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
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
        Stack<TreeNode> st = new Stack<>();
        List<Integer> postOrderList = new ArrayList<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !st.isEmpty()) {
            // Traverse to the leftmost node
            while (cur != null) {
                st.push(cur);
                cur = cur.left; // go to left
            }
            // Check if the right subtree needs to be visited or the current node should be processed
            TreeNode peekNode = st.peek();
            if(peekNode.right != null && peekNode.right != prev) {
                // Visit the right subtree
                cur = peekNode.right;
            } else {
                // Process the current node and backtrack
                postOrderList.add(peekNode.data);
                prev = st.pop();
            }
        }
        return postOrderList;
    }

}
/*
Binary-Tree
       1
      / \
     2   3
    / \ / \
   4  5 6  7

 PostOrder (Left-Right-Root)
[4, 5, 2, 6, 7, 3, 1]
*/