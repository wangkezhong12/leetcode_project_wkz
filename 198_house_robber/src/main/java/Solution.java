public class Solution {

    /**
     * 动态规划状态转移方程  f(n) = max(f(n-2)+n, f(n-1))
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int len = nums.length;
        int[] robMoney = new int[len+1];

        robMoney[0] = 0;
        robMoney[1] = nums[0];

        for (int i = 2; i <= len ; i++) {
            robMoney[i] = Math.max(robMoney[i-2] + nums[i-1], robMoney[i-1]);
        }

        return robMoney[len];

    }
    //滚动数组版
    public int rob1(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int p = 0;
        int q = nums[0];
        int r = 0;

        for (int i = 1; i < len ; i++) {
            r= Math.max(p + nums[i], q);
            p = q;
            q = r;
        }

        return r;

    }
}
