import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if ( k%len == 0) {
            return;
        }

        //当轮转长度超过数组长度时，即为 k%len
        if (k > len) {
            k = k%len;
        }

        int[] kArr = new int[k];

        for (int i = 0; i < k; i++) {
            int m = len-k+i;
            if (len-k+i >= len) {
                break;
            }
            kArr[i] = nums[len-k+i];
        }


        for (int i = len-1; i >= k; i--) {
            nums[i] = nums[i-k];
        }

        for (int i = 0; i < kArr.length; i++) {
            nums[i] = kArr[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 空间复杂度为O（1）的方案
     * 时间复杂度为O(k*n) 对k过大时容易超时
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {

        int len = nums.length;

        if (k % len == 0) {
            return;
        }

        if (k > len) {
            k = k%len;
        }


        for (int i = 0; i < k; i++) {

            int temp = nums[len-1];
            for (int j = len-1 ; j > 0; j--) {
                nums[j] = nums[j-1];

            }

            nums[0] = temp;

        }

        System.out.println(Arrays.toString(nums));

    }
}
