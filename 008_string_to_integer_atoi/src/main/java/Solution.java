public class Solution {
    public int myAtoi(String s) {
        //1.删除前后空格
        s = s.strip();
        if (s.length() == 0) {
            return 0;
        }
        int len = s.length();
        long res = 0;
        //默认符号为正
        int sign = 1;
        int begin = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            begin = 1;
        } else if (s.charAt(0) == '+') {
            begin = 1;
        }

        for (int i = begin; i < len; i++) {
            int iNum = (int)(s.charAt(i)-'0');
            if ( 0 > iNum || iNum > 9) {
                break;
            } else {
                res = res*10 + (int)(s.charAt(i)-'0');
                System.out.println(res);
                if (sign == 1 && res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && res*sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            }


        }

        res = res*sign;


        return (int)res;

    }
}
