package Tree.Iterative;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
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
        Stack<TreeNode> st = new Stack<>();
        List<Integer> preOrderList = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                preOrderList.add(cur.data); // add root to list
                st.push(cur);
                cur = cur.left; // go to left
            }
            cur = st.pop();
            cur = cur.right;// go to right
        }
        return preOrderList;
    }
}


/*
Binary-Tree
       1
      / \
     2   3
    / \ / \
   4  5 6  7

PreOrder (Root-Left-Right)
[1, 2, 4, 5, 3, 6, 7]
*/