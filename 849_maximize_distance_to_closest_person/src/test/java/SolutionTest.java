import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMaxDistToClosest() {

        Solution solution = new Solution();
        int[] seats = new int[]{1,0,0,0,1,0,1};
        int res = solution.maxDistToClosest(seats);
        System.out.println(res);
    }
}