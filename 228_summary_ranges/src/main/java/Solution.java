import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        if (nums.length == 0) return res;
        if (nums.length == 1) {
            res.add(String.valueOf(nums[0]));
            return res;
        }


        int rangeHead = nums[0];
        int tailPre = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] - tailPre == 1 ) {
                tailPre = nums[i];
            } else {
                String range = "";
                if (rangeHead == tailPre) {
                    range = range + String.valueOf(rangeHead);
                } else {
                    range = String.valueOf(rangeHead) + "->" + String.valueOf(tailPre);
                }
                res.add(range);
                rangeHead = nums[i];
                tailPre = nums[i];
            }
        }


        return res;

    }
}
