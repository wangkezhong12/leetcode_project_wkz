public class Solution {
    //递归重复 计算容易超出时间限制
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        } if (n == 2) {
            return 1;
        } else {
            return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        }

    }

    public int tribonacci1(int n) {

        if (n < 2) return n;
        if (n == 2) return 1;

        // o::n-3, p::n-2, q::n-1, r::n 目前的状态为 n = 3时的取值
        int o = 0, p = 1, q = 1, r = 2;

        for (int i = 4; i <=n ; i++) {
            o = p;
            p = q;
            q = r;
            r = o+p+q;
        }


        return r;

    }


}
