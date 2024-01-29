import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testProductExceptSelf() {
        int[] nums = new int[]{-1,1,0,-3,3};
        Solution solution = new Solution();
        int[] res = solution.productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}