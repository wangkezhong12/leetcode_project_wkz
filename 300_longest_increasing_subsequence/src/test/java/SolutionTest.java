import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testLengthOfLIS() {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        Solution solution = new Solution();
        int n = solution.lengthOfLIS(nums);
        System.out.println(n);
    }

    public void testLengthOfLIS1() {
        int[] nums = new int[]{0,1,0,3,2,3};
        Solution solution = new Solution();
        int n = solution.lengthOfLIS1(nums);
        System.out.println(n);
    }
}