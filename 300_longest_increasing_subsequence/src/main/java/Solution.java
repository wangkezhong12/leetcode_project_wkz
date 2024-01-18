public class Solution {

    /**
     * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
     *
     * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
     * 方法：动态规划，动态转移方程
     * f(i) = f(i-1) + 1(xi < xi-1)
     *
     * @param nums
     * @return
     */

    public int lengthOfLIS(int[] nums) {

        int len = nums.length;

        if (len == 1) {
            return 1;
        }

        int maxLen = 1;

        int[][] dp = new int[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        for (int i = 0; i < len; i++) {
            //将当前位置的数值视为最大值
            int max = nums[i];

            for (int j = i+1; j < len; j++) {
                if (j > len) {
                    break;
                }
                if (nums[j] > max) {
                    dp[i][j] = dp[i][j-1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                    max = nums[j];
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }






        return maxLen;


    }


    public int lengthOfLIS1(int[] nums) {
        int len = nums.length;

        int[] dp = new int[len];
        dp[0] =1;
        int maxLen = 1;

        for (int i = 1; i < len; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}
