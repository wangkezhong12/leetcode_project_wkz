import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testAlternatingSubarray() {
        int[] nums = new int[]{4,5,6};
        Solution solution = new Solution();
        int res = solution.alternatingSubarray(nums);
        System.out.println(res);
    }
}