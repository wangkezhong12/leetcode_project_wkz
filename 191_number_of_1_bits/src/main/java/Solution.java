public class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            System.out.println("n: " + String.valueOf(n) + " : " + Integer.toBinaryString(n));
            System.out.println("n-1: " + String.valueOf(n-1) + " : " + Integer.toBinaryString(n-1));
            n &= (n-1);
            res ++;
        }
        return res;
    }
}
