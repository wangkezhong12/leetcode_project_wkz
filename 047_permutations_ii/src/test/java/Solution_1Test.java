import junit.framework.TestCase;

import java.util.List;

public class Solution_1Test extends TestCase {

    public void testPermuteUnique() {
        int[] nums = new int[]{1, 1, 2};
        Solution_1 solution = new Solution_1();
        List<List<Integer>> res = solution.permuteUnique(nums);
        System.out.println(res.toString());

    }
}