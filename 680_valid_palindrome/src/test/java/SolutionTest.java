import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testValidPalindrome() {
        String s = "abca";
        Solution solution = new Solution();
        boolean flag = solution.validPalindrome(s);
        System.out.println(flag);
    }
}