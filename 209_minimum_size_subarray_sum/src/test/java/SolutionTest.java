import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMinSubArrayLen() {
        int target = 7;
        int[] nums = new int[]{2,3,1,2,4,3};
//        int target = 15;
//        int[] nums = new int[]{5,1,3,5,10,7,4,9,2,8};

        Solution solution = new Solution();
        int res = solution.minSubArrayLen(target, nums);
        System.out.println(res);
    }
}