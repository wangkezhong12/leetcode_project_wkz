import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testClimbStairs() {
        int n = 4;
        Solution solution = new Solution();
        int res = solution.climbStairs(n);
        System.out.println(res);
    }
}