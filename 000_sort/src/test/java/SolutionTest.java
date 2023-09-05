import junit.framework.TestCase;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    int[] nums = new int[]{4,3,7,1,9,2,6};

    Solution solution = new Solution();



    public void testSelectSort() {
        int[] selectSortResult = solution.selectSort(nums);
        System.out.println(Arrays.toString(selectSortResult));
    }



    public void testInsertSort() {
        int[] insertSortResult = solution.insertSort(nums);
        System.out.println(Arrays.toString(insertSortResult));;
    }

    public void testBubbleSort() {
        int[] res = solution.bubbleSort(nums);
        System.out.println(Arrays.toString(res));
    }

    public void testQuickSort() {
        int[] res = solution.quickSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(res));
    }
}