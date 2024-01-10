import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testIsValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Solution solution = new Solution();
        boolean flag = solution.isValidBST(root);
        System.out.println(flag);
    }
}