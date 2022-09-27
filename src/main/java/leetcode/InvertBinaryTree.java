package leetcode;
//Given the root of a binary tree, invert the tree, and return its root.

//Example 1:
//Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]
//
//Example 2:
//Input: root = [2,1,3]
//Output: [2,3,1]
//
//Example 3:
//Input: root = []
//Output: []

public class InvertBinaryTree {
    public static void main(String[] args) {
//        TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//        System.out.println(invertTree(tree));

        TreeNode tree = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(invertTree(tree));
    }

    public static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public static void invert(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode newRight = root.left;
        root.left = root.right;
        root.right = newRight;

        invert(root.left);
        invert(root.right);
    }
}
