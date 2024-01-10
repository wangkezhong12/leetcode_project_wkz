import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testHammingWeight() {
        int n = -9;
        Solution solution = new Solution();
        int res = solution.hammingWeight(n);
        System.out.println(res);
    }
}