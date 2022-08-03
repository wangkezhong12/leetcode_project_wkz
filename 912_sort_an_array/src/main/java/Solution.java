import java.util.Arrays;

public class Solution {

    /**
     * 数组排序，多种排序方法
     * @param nums
     * @return
     */

    public int[] sortArray(int[] nums) {
        //快速排序
        //quickSort(nums, 0, nums.length-1);
        //冒泡排序
        bubbleSort(nums);
        return nums;

    }

    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public int[] bubbleSort(int[] nums){

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if ( nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }

        }
        return nums;
    }


    /**
     * 快速排序
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public int[] quickSort(int[] nums, int start, int end) {

        if (start > end) {return null;}
        int i = start;
        int j = end;
        int base = nums[start];
        while (i < j) {
            while (i < j && base <= nums[j]) j--;
            while (i < j && base >= nums[i]) i++;
            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, start, i);
        quickSort(nums, start,i-1);
        quickSort(nums, j+1, end);

        return nums;

    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{7,3,1,5,9,6,4,2,8};
        System.out.println("before the sort : " + Arrays.toString(nums));
        solution.sortArray(nums);
        System.out.println("after the sort : " + Arrays.toString(nums));

    }



}
