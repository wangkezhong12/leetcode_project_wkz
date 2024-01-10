import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testNumDupDigitsAtMostN() {
        int n = 10000000 ;
        Solution solution = new Solution();
        int count = solution.numDupDigitsAtMostN(n);
        System.out.println(count);
    }
}