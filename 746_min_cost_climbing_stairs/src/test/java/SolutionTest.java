import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMinCostClimbingStairs() {
        int[] cost = new int[]{10,15,20};
        Solution solution = new Solution();
        int totalCost = solution.minCostClimbingStairs(cost);

        System.out.println(totalCost);

    }

    public void testMinCostClimbingStairs1() {
        int[] cost = new int[]{10,15,20};
        Solution solution = new Solution();
        int totalCost = solution.minCostClimbingStairs1(cost);

        System.out.println(totalCost);
    }
}