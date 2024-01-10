import java.util.Arrays;

public class Solution {
    public int maxProfit(int[] prices){

        int len = prices.length;
        if (len < 2) {
            return 0;
        }


        int[][] dp = new int[len][2];

        //默认第一天就买入了的情况
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]-prices[i]);
        }

        for (int i = 0; i < len; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[len-1][0];
    }
}
