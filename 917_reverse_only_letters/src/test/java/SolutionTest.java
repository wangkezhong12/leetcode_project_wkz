import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testReverseOnlyLetters() {

        String s= "ab-cd";
        Solution solution = new Solution();
        String res = solution.reverseOnlyLetters(s);
        System.out.println(res);

    }
}