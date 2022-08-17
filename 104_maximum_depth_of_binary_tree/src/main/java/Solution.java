
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

    public TreeNode generateTree() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        root.left = left;
        TreeNode right = new TreeNode(20);
        root.right = right;

        TreeNode rLeft = new TreeNode(15);
        TreeNode rRight = new TreeNode(7);

        right.left = rLeft;
        right.right = rRight;

        return root;
    }

    public static void main(String[] args) {
        Solution s3 = new Solution();
        TreeNode root = s3.generateTree();
        int maxDeep = s3.maxDepth(root);
        System.out.println(maxDeep);

    }
}
