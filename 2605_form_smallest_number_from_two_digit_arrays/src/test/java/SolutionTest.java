import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMinNumber() {
        int[] nums1 = new int[]{4,1,3};
        int[] nums2 = new int[]{5,7};
        Solution solution = new Solution();
        int result = solution.minNumber(nums1, nums2);
        System.out.println(result);
    }
}