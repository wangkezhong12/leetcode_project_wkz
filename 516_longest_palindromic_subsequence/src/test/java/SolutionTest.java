import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testLongestPalindromeSubseq() {
        String s = "bbbab";
        Solution solution = new Solution();
        int n = solution.longestPalindromeSubseq(s);
        System.out.println(n);
    }
}