import java.util.*;

public class Solution {

    /**
     * 动态规划状态转移方程长度为 l
     * l==1: true
     * l==2: 两个字符相等 true
     * l>2: if s[i->j] true, then s[i+1 -> j-1] true
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        int len = s.length();
        //l==1: true
        if (len < 2) {
            return s;
        }

        char[] charArr = s.toCharArray();

        //dp[i][j]表示s[i->j]是否是回文
        boolean[][] dp = new boolean[len][len];

        //当i == j 时，表示单个字母
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int maxLen = 1;
        int begin = 0;

        //枚举字符串长度，从长度为2的开始
        for (int L = 2; L <= len; L++) {
            //i为左边界
            for (int i = 0; i < len; i++) {
                //通过L和左边界来确定有边界，L = j-i+1
                int j = L + i - 1;
                //右边界不能超出字符串的长度
                if(j >= len) {
                    break;
                }
                //两端的字符不相同，则表示s[i->j] 不是回文
                if (charArr[i] != charArr[j]) {
                    dp[i][j] = false;
                } else {
                    //如果 i和j 相等，且字符串长度 <3,则表明时一个回文串，这里限制了L从2开始，所以最短就是2
                    if (j-i<3) {
                        dp[i][j] = true;
                    } else {  //长度>2 的时候，符合第三个状态转移方程
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                //更新最大长度和回文串的开始字符下标
                if(dp[i][j] && j-i+1 > maxLen) {
                    maxLen = j-i+1;
                    begin = i;
                }

            }

        }


//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                System.out.println(String.valueOf(dp[i][j]).trim() + " ");
//            }
//            System.out.println("\n");
//        }

        String result = s.substring(begin, begin+maxLen);


        return result;
    }


    public static void main(String[] args) {
        String s = "babad";
        Solution solution = new Solution();
        String result = solution.longestPalindrome(s);

        System.out.println(result);
    }
}
