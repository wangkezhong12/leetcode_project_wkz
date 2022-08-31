public class Solution {
    public int majorityElement(int[] nums) {

        int majorityElement = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count ++;
            } else {
                count --;
            }
            if (count < 0) {
                majorityElement = nums[i];
                count = 1;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,2,1,1,1,2,2,3};
        int res = solution.majorityElement(nums);
        System.out.println(res);
    }

}
