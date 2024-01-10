import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testIsAnagram() {
        String s = "car";
        String t = "rat";

        Solution solution = new Solution();
        boolean flag = solution.isAnagram(s,t);
        System.out.println(flag);
    }
}