import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testPermute() {

        int[] nums = new int[]{1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> res = solution.permute(nums);
        System.out.println(res.toString());
    }
}