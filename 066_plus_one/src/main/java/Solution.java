import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int[] plusOne(int[] digits) {
        int mark = 0;

        if (digits[digits.length - 1] + 1 < 10) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            mark = 1;
            for (int i = digits.length-1; i >= 0; i--) {
                if (digits[i] + mark < 10) {
                    digits[i] += mark;
                    return digits;
                } else {
                    mark = 1;
                    digits[i] = (digits[i] + mark) % 10;
                }
            }

        }

        if (mark == 1) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for (int i = 1; i < res.length ; i++) {
                res[i] = digits[i-1];
            }
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = new int[]{4,3,2,1};
        int[] result = solution.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }


}
