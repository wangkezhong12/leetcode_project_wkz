import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testAddToArrayForm() {
        int[] num = new int[]{2,7,4};
        int k = 181;
        Solution solution = new Solution();
        List<Integer> list= solution.addToArrayForm(num, k);
        System.out.println(list.toString());

    }
}