public class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;
        int i = n & (n-1);
        return i == 0;

    }
}
