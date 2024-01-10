import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testTribonacci() {

        int n = 25;
        Solution solution = new Solution();
        int res = solution.tribonacci(n);
        System.out.println(res);
    }

    public void testTribonacci1() {
        int n = 25;
        Solution solution = new Solution();
        int res = solution.tribonacci1(n);
        System.out.println(res);
    }
}