import junit.framework.TestCase;

public class SolutionTest extends TestCase {



    public void testSearchInsert() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        Solution solution = new Solution();
        int index = solution.searchInsert(nums, target);
        System.out.println(index);
    }
}