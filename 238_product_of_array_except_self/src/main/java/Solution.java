public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] rightProducts = new int[len];
        int[] leftProducts = new int[len];

        leftProducts[0] = 1;
        for (int i = 1; i < len; i++) {
            leftProducts[i] = leftProducts[i-1] * nums[i-1];
        }
        rightProducts[len-1] = 1;
        for (int i = len-2; i >= 0 ; i--) {
            rightProducts[i] = rightProducts[i+1]*nums[i+1];
        }

        for (int i = 0; i < len; i++) {
            res[i] = leftProducts[i]*rightProducts[i];
        }

        return res;
    }
}
