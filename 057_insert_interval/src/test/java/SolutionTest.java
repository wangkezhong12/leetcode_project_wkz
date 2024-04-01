import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    public void testInsert() {
        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
        int[] newInterval = new int[]{2, 5};
        Solution solution = new Solution();
        int[][] res = solution.insert(intervals, newInterval);
        System.out.println(res.length);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}