public class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];

        res[0] = 0;

        for (int i = 1; i <= n; i++) {
            int ret = 0;
            int k = i;
            while (k !=0 ) {
                k &= (k-1);
                ret++;
            }
            res[i] = ret;
        }
        return res;
    }
}
