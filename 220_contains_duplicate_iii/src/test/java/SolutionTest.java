import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testContainsNearbyAlmostDuplicate() {

        int[] nums = new int[]{1,5,9,1,5,9};
        int indexDiff = 2;
        int valueDiff = 3;

        Solution solution = new Solution();
        boolean flag = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);

        System.out.println(flag);

    }
}