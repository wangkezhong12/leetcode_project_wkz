import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMaxProfit() {
        int[] price = new int[] {1,2,3,4,5};

        Solution solution = new Solution();
        int res = solution.maxProfit(price);
        System.out.println(res);
    }
}