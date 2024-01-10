import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testIsPowerOfFour() {

        int n = 32;
        Solution solution = new Solution();
        boolean flag = solution.isPowerOfFour(n);
        System.out.println(flag);
    }
}