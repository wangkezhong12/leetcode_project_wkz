public class Solution {
    //斐波那契额数列变形
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int p = 0, q = 1, r = 2 ;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;

        }
        return r;
    }
}
