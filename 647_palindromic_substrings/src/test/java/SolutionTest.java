import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testCountSubString() {
        String s = "aaa";
        Solution solution = new Solution();
        int n = solution.countSubString(s);
        System.out.println(n);
    }
}