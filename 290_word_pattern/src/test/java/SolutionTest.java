import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testWordPattern() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        Solution solution = new Solution();
        boolean res = solution.wordPattern(pattern, s);
        System.out.println(res);
    }
}