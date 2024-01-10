import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testIsPowerOfThree() {

        int n = 9;
        Solution solution = new Solution();
        boolean res = solution.isPowerOfThree(n);
        System.out.println(res);
    }
}