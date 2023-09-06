import junit.framework.TestCase;

public class SolutionTest extends TestCase {


    Solution solution = new Solution();
    public void testSearch() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int res = solution.search(nums,9);
        System.out.println(res);



    }
}