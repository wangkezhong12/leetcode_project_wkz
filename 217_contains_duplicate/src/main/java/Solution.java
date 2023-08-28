import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                int val = hashMap.get(nums[i]);
                hashMap.put(nums[i], val+1);
            } else {
                hashMap.put(nums[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                flag = true;
            }
        }

        return flag;

    }
}
