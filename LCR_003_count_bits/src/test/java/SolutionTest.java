import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testCountBits() {

        int n = 5;
        Solution solution = new Solution();
        int[] res = solution.countBits(n);
        System.out.println(Arrays.toString(res));
    }
}