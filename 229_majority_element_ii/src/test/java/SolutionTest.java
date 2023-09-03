import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testMajorityElement() {
        int[] nums = new int[]{2,2};
        Solution solution = new Solution();
        List<Integer> res = solution.majorityElement(nums);
        System.out.println(res);

    }
}