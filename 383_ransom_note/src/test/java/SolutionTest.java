import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testCanConstruct() {
        String ransomNote = "aa";
        String magazine = "ab";
        Solution solution = new Solution();
        boolean flag = solution.canConstruct(ransomNote, magazine);
        System.out.println(flag);

    }
}