import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testCombinationSum() {

        int[] candidates = new int[]{2,3,6,7};
        int target = 7;

        Solution solution = new Solution();
        List<List<Integer>> res = solution.combinationSum(candidates, target);
        System.out.println(res.toString());
    }

    public void testCombinationSum1() {

        int[] candidates = new int[]{2};
        int target = 1;

        Solution solution = new Solution();
        List<List<Integer>> res = solution.combinationSum(candidates, target);
        System.out.println(res.toString());
    }
}