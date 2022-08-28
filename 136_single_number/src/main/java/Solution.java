public class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            res = res ^ nums[i];
        }
        return res;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,2,1};
        int res = solution.singleNumber(nums);
        System.out.println(res);
    }
}
