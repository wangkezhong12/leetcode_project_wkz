import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testFindMode() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        Solution solution = new Solution();
        int[] res = solution.findMode(root);
        System.out.println(Arrays.toString(res));
    }
}