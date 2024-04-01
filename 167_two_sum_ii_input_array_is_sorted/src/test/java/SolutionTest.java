import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testTwoSum() {
        int[] numbers = new int[]{-1,0};
        int target = -1;
        Solution solution = new Solution();
        int[] res = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
}