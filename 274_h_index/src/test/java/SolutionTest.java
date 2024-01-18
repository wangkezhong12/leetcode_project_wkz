import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testHIndex() {
        int[] citations = new int[]{1};
        Solution solution = new Solution();
        int res = solution.hIndex(citations);
        System.out.println(res);
    }
}