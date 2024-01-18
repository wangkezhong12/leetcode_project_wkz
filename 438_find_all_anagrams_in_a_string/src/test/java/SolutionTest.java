import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class SolutionTest extends TestCase {

    public void testFindAnagrams() {
        String s = "cbaebabacd";
        String p = "abc";
        Solution solution = new Solution();
        List<Integer> res = solution.findAnagrams_1(s,p);
        System.out.println(res.toString());


        int[] a = new int[]{9,7,6};
        int[] b = new int[]{9,7,6};

        System.out.println(Arrays.equals(a,b));
    }
}