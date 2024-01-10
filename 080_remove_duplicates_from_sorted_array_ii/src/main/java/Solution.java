import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int pre = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == pre) {
                count ++;
                if (count > 2) {
                    temp.remove(nums[i]);
                }
            } else {
                pre = nums[i];
                count = 1;
            }
        }

        nums = temp.stream().mapToInt(Integer::intValue).toArray();

        return nums.length;
    }


    public int removeDuplicates1(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;

    }

}
