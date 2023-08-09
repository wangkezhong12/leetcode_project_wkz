public class Solution {
    public static int maxAbsoluteSum(int[] nums) {

        int max = Math.abs(nums[0]);

        int p1 = nums[0];
        int p2 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            p1 = Math.max(p1 + nums[i], nums[i]);  //数组中遇到负值p1就会减小
            p2 = Math.min(p2 + nums[i], nums[i]);
            max = Math.max(max, Math.max(Math.abs(p1), Math.abs(p2)));
        }


        return max;
    }

    public static void main(String[] args) {
        int[] testNums_1 = new int[]{1, -3, 2, 3, -4};
        int maxRes = maxAbsoluteSum(testNums_1);
        System.out.println(maxRes);
    }
}
