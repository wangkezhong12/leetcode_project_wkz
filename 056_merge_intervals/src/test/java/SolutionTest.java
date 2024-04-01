import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testMerge() {
        int[][] intervals = new int[][]{{1,4}, {0,1}};
        Solution solution = new Solution();
        int[][] res = solution.merge(intervals);

        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}