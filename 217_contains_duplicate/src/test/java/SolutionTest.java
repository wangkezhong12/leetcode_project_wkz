import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testContainsDuplicate() {

        int[] nums = new int[]{1,2,3,4};
        Solution solution = new Solution();
        boolean flag = solution.containsDuplicate(nums);
        System.out.println(flag);
    }
}