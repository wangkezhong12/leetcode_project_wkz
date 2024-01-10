import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testSummaryRanges() {
//        int[] nums = new int[] {0,1,2,4,5,7};
        int[] nums = new int[] {0,2,3,4,6,8,9};
        Solution solution = new Solution();
        List<String> res = solution.summaryRanges(nums);

        System.out.println(res.toString());
    }
}