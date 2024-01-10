import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testFib() {
        int n = 4;
        Solution solution = new Solution();
        int res = solution.fib(n);
        System.out.println(res);
    }

    public void testFib1() {
        int n = 4;
        Solution solution = new Solution();
        int res = solution.fib1(n);
        System.out.println(res);
    }
}