public class Solution {
    //递归的方法会存在重复计算，在n较大时，会存在计算超时
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public int fib1(int n) {
        if (n < 2) {
            return n;
        }

        int p = 0, q = 0, r = 1 ;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;

        }
        return r;

    }
}
