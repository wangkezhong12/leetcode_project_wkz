import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {

        int len = nums.length;
        if (len < 2) {
            return len;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        int maxLen = 0;

        for (Integer num: set) {

            //找到最小的数
            if (!set.contains(num-1)) {
                int currentNum = num;
                int currentLen = 1;

                while(set.contains(currentNum + 1)) {
                   currentLen ++;
                   currentNum ++;
                }

                maxLen = Math.max(maxLen, currentLen);
            }


        }



        return maxLen;
    }
}
