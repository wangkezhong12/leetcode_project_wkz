import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMaximumOddBinaryNumber() {

        String s = "0101";
        Solution solution = new Solution();
        String res = solution.maximumOddBinaryNumber(s);
        System.out.println(res);

    }
}