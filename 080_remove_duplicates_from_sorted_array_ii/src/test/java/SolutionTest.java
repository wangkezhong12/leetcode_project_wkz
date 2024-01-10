import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testRemoveDuplicates() {
        int[] nums = new int[] {1,1,1,2,2,3};
        Solution solution = new Solution();

        int result = solution.removeDuplicates1(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));

    }
}