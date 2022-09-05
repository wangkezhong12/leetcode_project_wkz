public class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length <= 1) return 0;

        int max = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            buyPrice = Math.min(prices[i], buyPrice);
            max = Math.max(max, prices[i] - buyPrice);
        }

        return max;


    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] prices = new int[]{7,1,5,3,6,4};
        int res = solution.maxProfit(prices);
        System.out.println(res);
    }


}
