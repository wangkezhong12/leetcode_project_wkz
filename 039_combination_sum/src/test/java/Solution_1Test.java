import junit.framework.TestCase;

import java.util.List;

public class Solution_1Test extends TestCase {

    public void testCombinationSum() {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;

        Solution_1 solution = new Solution_1();
        List<List<Integer>> res = solution.combinationSum(candidates, target);
        System.out.println(res.toString());

    }
}