public class Solution {

    /**
     * 动态规划，字符串长度为 l
     *  l == 1: 只有一个回文
     *  l > 1: 如果当前字符串为回文，则字符串 s[i+1->j-1] 也为回文
     *
     * @param s
     * @return
     */

    public int countSubString(String s) {
        int len = s.length();

        if (len == 1) {
            return 1;
        }

        char[] charArr = s.toCharArray();
        int dp[][] = new int[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        //字符串长度 L = j-i+1，枚举L长度
        for (int L = 2; L <= len ; L++) {
            for (int i = 0; i < len; i++) {
                int j = L + i - 1;   //计算右值
                if (j >= len) {      //j不可以越界
                    break;
                }

                char iChar = charArr[i];
                char jChar = charArr[j];
                if (iChar != jChar) {
                    dp[i][j] = 0;
                } else {
                    if (j-i < 3) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i+1][j-1];

                    }
                }

            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                count += dp[i][j];
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


        return count;
    }
}
