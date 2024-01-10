public class Solution {


    /**
     * 选择排序
     * @param nums
     * @return
     */
    public int[] selectSort(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            int min = i;
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int tempNum = nums[i];
            nums[i] = nums[min];
            nums[min] = tempNum;

        }

        return nums;

    }

    /**
     * 插入排序
     * @param nums
     * @return
     */
    public int[] insertSort(int[] nums) {

        if (nums == null || nums.length < 2) {
            return nums;
        }

        int len = nums.length;

        for (int i = 1; i < len; i++) {
            int mark = nums[i];
            int k = i-1;

//          找到要插入的位置
            while(k >= 0 && nums[k] > mark) {
                k--;
            }
//          将较大的数统一后移
            for (int j = i; j > k+1 ; j--) {
                nums[j] = nums[j-1];
            }

            nums[k+1] = mark;

        }

        return nums;
    }

    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public int[] bubbleSort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if (nums[j] > nums[j+1]) {
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
     * @param left
     * @param right
     * @return
     */
    public int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = partition(nums, left, right);

            nums = quickSort(nums, left, mid-1);
            nums = quickSort(nums, mid+1, right);
        }


        return nums;
    }

    public int partition(int[] nums, int left, int right) {
        //把最左端的元素作为中枢元素
        int pivot = nums[left];
        int i = left + 1;
        int j = right;

        while(true) {
            //1.左侧数值小于中枢数值时，将i向右平移一位
            while (i<=j && nums[i] <= pivot) {i++;}
            //2.右侧数值大于中枢数值时，将j向左平移一位
            while (i<=j && nums[j] >= pivot) {j--;}
            //3.如果此时i>j 则跳出循环
            if (i > j) {
                break;
            }
            //上述1.2.3条件均不符合时，说明出现i<=j 的时候 num[i] > pivot && nums[j] < pivot
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        //最后将pivot和nums[j]互换位置
        nums[left] = nums[j];
        nums[j] = pivot;

        return j;
    }


    /**
     * 归并排序
     * @param nums
     * @return
     */
    public int[] mergeSort(int[] nums) {

        int[] res = new int[5];
        return res;
    }


}
