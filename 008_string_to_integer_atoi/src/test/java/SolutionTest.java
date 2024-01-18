import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMyAtoi() {
        String s= "-91283472332";
        Solution solution = new Solution();
        int x = solution.myAtoi(s);
        System.out.println(x);
    }
}