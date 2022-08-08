public class Solution {



    //数值计算的方法
    public int reverse(int x) {
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE  || x == 0){
            return 0;
        }
        if (x < 10 && x > -10){
            return x;
        }
        char[] xCharSet = String.valueOf(x).toCharArray();
        int res = 0;


        for (int i = xCharSet.length - 1; i > 0; i--) {

            int a = Integer.parseInt(String.valueOf(xCharSet[i]));


            if (xCharSet[0] == '-'){
                res = (int) (res + a * Math.pow(10,i-1));
            }
            else {
                res = (int) (res + a * Math.pow(10,i));
            }
            if (res <= Integer.MIN_VALUE || res >= Integer.MAX_VALUE) {
                return 0;
            }

        }
        if (xCharSet[0] == '-') {
            res = res * -1;
        } else {
            res = res + Integer.parseInt(String.valueOf(xCharSet[0]));
        }


        return res;
    }

    //字符串的方法   在可以使用64位存储的情况下
    public int reverse1(int x) {
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE  || x == 0){
            return 0;
        }
        if (x < 10 && x > -10){
            return x;
        }
        char[] xCharSet = String.valueOf(x).toCharArray();

        long res = 0;
        if (x < 0) {

            for (int i = 1; i < xCharSet.length/2+1 ; i++) {
                char y = xCharSet[xCharSet.length - i];
                xCharSet[xCharSet.length - i] = xCharSet[i];
                xCharSet[i] = y;
            }

        } else {
            for (int i = 0; i < xCharSet.length/2; i++) {
                char y = xCharSet[xCharSet.length - i - 1];
                xCharSet[xCharSet.length - i - 1] = xCharSet[i];
                xCharSet[i] = y;
            }

        }
        res = Long.parseLong(String.copyValueOf(xCharSet));

        if (res <= Integer.MIN_VALUE || res >= Integer.MAX_VALUE) {
            return 0;
        }

        return Integer.parseInt(String.copyValueOf(xCharSet));
    }

    //直接取余数的方法
    public int reverse2(int x) {
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = -190;
        int result = solution.reverse1(x);
        System.out.println(result);
    }

}
