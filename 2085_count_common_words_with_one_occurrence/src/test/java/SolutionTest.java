import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testCountWords() {

        String[] words1 = new String[]{"leetcode","is","amazing","as","is"};
        String[] words2 = new String[]{"amazing","leetcode","is"};

        Solution solution = new Solution();
        int res = solution.countWords1(words1, words2);
        System.out.println(res);
    }
}