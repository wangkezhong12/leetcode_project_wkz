import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testRob() {
        int[] nums = new int[]{2,7,9,3,1};
        Solution solution = new Solution();
        int res = solution.rob(nums);
        System.out.println(res);
    }

    public void testRob1() {
        int[] nums = new int[]{2,7,9,3,1,8};
        Solution solution = new Solution();
        int res = solution.rob1(nums);
        System.out.println(res);
    }
}