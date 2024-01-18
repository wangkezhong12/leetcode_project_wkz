public class Solution {

    /**
     * 动态规划
     *
     * @param s
     * @return n
     */
    public int longestPalindromeSubseq(String s) {

        int len = s.length();

        int[][] dp = new int[len][len];


        char[] charArr = s.toCharArray();

        for (int i = len-1; i >= 0; i--) {
            dp[i][i] = 1;

            for (int j = i+1; j < len ; j++) {
                if (i > j) {
                    break;
                }
                char iChar = charArr[i];
                char jChar = charArr[j];
                if (iChar == jChar) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }

            }
        }


//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                System.out.print(dp[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

        return dp[0][len-1];
    }
}
