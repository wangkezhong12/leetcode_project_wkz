import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testLongestConsecutive() {
        int[] nums = new int[]{100,4,200,1,3,2};
        Solution solution = new Solution();
        int res = solution.longestConsecutive(nums);
        System.out.println(res);

    }
}