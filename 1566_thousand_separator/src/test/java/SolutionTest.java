import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testThousandSeparator() {
        int n = 1234;
        Solution solution = new Solution();
        String res = solution.thousandSeparator(n);
        System.out.println(res);
    }

}