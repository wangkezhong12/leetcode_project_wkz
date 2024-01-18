public class Solution {
    //构造数组
    public int minCostClimbingStairs(int[] cost) {

        int len = cost.length;
        //当前阶梯数
        int[] dp = new int[len+1];

        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= len ; i++) {
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2] + cost[i-2]);
        }

        return dp[len];

    }
    //滚动数组
    public int minCostClimbingStairs1(int[] cost) {
        int len = cost.length;
        if (len < 2) {
            return 0;
        }
        int p = 0, q = 0, r = 0;
        for (int i = 2; i <= len; i++) {
           r = Math.min(cost[i-2] + p, cost[i-1] + q);
           p = q;
           q = r;

        }
        return r;
    }

}
