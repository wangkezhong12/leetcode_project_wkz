import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean canJump(int[] nums) {

        int len = nums.length;
        //终止条件
        if (nums[0] >= len - 1) {
            return true;
        } else if (nums[0] == 0) {
            return false;
        }

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        int p = len - 1;
        for (int i = len - 2; i >= 0; i--) {

            if (i + nums[i] >= p) {
                int[] x = list.subList(0, i + 1).stream().mapToInt(Integer::intValue).toArray();
                return canJump(x);
            } else {
                continue;
            }

        }


        return false;
    }

    public  boolean canJump1(int[] nums){

        int len = nums.length;

        int k = 0;
        for (int i = 0; i < len; i++) {
            if (i > k ) return false;
            k = Math.max(k,i+nums[i]);
        }

        return true;
    }

}
 