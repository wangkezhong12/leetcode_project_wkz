import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n!=1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }

        return n == 1;


    }

    public int getNext(int n) {
        int res = 0;

        while (n > 0) {
            int temp = n%10;
            res += Math.pow(temp, 2);
            n = n/10;
        }

        return res;
    }
}
