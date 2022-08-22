
public class Solution {
    public boolean isBalanced(TreeNode root) {

        return treeDeepth(root) >= 0;
    }

    public int treeDeepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = treeDeepth(root.left);
        int rd = treeDeepth(root.right);
        if (ld >=0 && rd >=0 && Math.abs(ld-rd) <= 1) {
            return Math.max(ld,rd)+1;
        } else {
            return -1;
        }

    }


    public TreeNode generateTree() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        root.left = left;
        TreeNode right = new TreeNode(20);
        root.right = right;
        TreeNode rLeft = new TreeNode(15);
        right.left = rLeft;
        TreeNode rRight = new TreeNode(7);
        right.right = rRight;

        return root;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root =  solution.generateTree();
        boolean x = solution.isBalanced(root);
        System.out.println(x);
    }

}
