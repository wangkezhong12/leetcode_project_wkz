import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testPermuteUnique() {

        int[] nums = new int[]{1, 1, 2};
        Solution solution = new Solution();
        List<List<Integer>> res = solution.permuteUnique(nums);
        System.out.println(res.toString());
    }
}