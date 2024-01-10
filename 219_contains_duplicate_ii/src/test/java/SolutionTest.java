import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testContainsNearbyDuplicate() {
        int nums[] = new int[]{1,0,1,1};
        int k = 1;

        Solution solution = new Solution();
        boolean flag = solution.containsNearbyDuplicate(nums, k);
        System.out.println(flag);
    }

    public void testContainsNearbyDuplicate1() {
        int nums[] = new int[]{1,2,3,4,5,6,7,8,9,9};
        int k = 3;

        Solution solution = new Solution();
        boolean flag = solution.containsNearbyDuplicate1(nums, k);
        System.out.println(flag);

    }

    public void testContainsNearbyDuplicate2() {
        int nums[] = new int[]{1,2,3,4,5,6,7,8,9,9};
        int k = 3;

        Solution solution = new Solution();
        boolean flag = solution.containsNearbyDuplicate2(nums, k);
        System.out.println(flag);
    }
}