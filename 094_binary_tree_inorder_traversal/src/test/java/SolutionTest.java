import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testInorderTraversal() {

        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = null;

        Solution solution = new Solution();
        List<Integer> list = solution.inorderTraversal(root);

        System.out.println(list.toString());

    }
}