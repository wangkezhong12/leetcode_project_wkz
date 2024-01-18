import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testRotate() {
        int[] nums = new int[]{-1,-100,3,99};
        int k = 4;
        Solution solution = new Solution();
        solution.rotate(nums,k);
    }

    public void testRotate1() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 4;
        Solution solution = new Solution();
        solution.rotate1(nums,k);

    }
}