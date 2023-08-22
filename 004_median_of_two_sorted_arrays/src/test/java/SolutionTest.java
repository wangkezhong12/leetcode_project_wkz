import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testFindMedianSortedArrays() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};

        Solution solution = new Solution();
        double res = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}