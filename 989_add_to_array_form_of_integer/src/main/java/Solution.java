import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k ) {
        if (k == 0) {
            return Arrays.stream(num).boxed().collect(Collectors.toList());
        }

        List<Integer> result = new ArrayList<>();

        int sign = 0;
        int i = num.length-1;
        while(k > 0) {
            int remainder = k % 10;
            k = k/10;
            int tmp = 0;
            if ( i>=0 ){
                if (remainder == 0  ){
                    tmp = num[i] + sign;
                    result.add(0, tmp%10);
                    i--;
                    sign = tmp/10;
                    continue;
                } else {
                    tmp = remainder + num[i] + sign;
                    result.add(0, tmp%10);
                    sign = tmp/10;
                    i--;
                }


            } else {
                tmp = remainder + sign;
                result.add(0, tmp%10);
                sign = tmp/10;
            }


        }
        if (sign == 1) {
            if (i < 0) {
                result.add(0,sign);
            } else {
                while (i >= 0) {
                    int tmp = num[i] + sign;
                    result.add(0,tmp%10);
                    i--;
                    sign = tmp/10;

                }
                if (sign == 1) {
                    result.add(0,sign);
                }

            }
        } else  {
            for (int j = i; j >= 0 ; j--) {
                result.add(0,num[j]);
            }

        }

        return result;


    }
}
