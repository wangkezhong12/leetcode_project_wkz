public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int l = 0;
         int r = 0;
         int res = 0;
         int sum = 0;

         while(r < nums.length) {
             //先看右指针，如果加上右值结果>=target,则满足条件，将结果长度+1

             if (sum < target && sum + nums[r] >= target) {
                 res = r-l+1;
             }
             sum += nums[r];
             //当减掉左值结果仍然 >= target时，则将左指针右移
             while (l < r && sum - nums[l] >= target) {
                 sum -= nums[l];
                 l++;
                 res = Math.min(r-l+1, res);
             }
             r++;

         }

         return res;
    }
}
