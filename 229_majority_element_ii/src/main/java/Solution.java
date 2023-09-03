import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {


        List<Integer> result = new ArrayList<>();
        if (nums.length < 3) {
            result = new ArrayList<>(Arrays.stream(nums).distinct().boxed().collect(Collectors.toList()));
            return result;
        }



        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) +1 );
            }
        }
        for (Map.Entry<Integer, Integer> entry:
             hashMap.entrySet()) {
            if (entry.getValue() > nums.length/3) {
                result.add(entry.getKey());
            }
        }


        return result;

    }
}
