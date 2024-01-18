import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testCanJump() {
        int[] nums = new int[]{1,1,1,1,1,1,1};

        Solution solution = new Solution();
        boolean res = solution.canJump(nums);
        System.out.println(res);
    }
}