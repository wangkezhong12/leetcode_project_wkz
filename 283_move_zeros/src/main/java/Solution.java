
public class Solution {
    public static void moveZeros(int[] nums) {

        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[s] = nums[i];
                s++;
            }
        }

        for (int i = s; i < nums.length; i++) {
            nums[i] = 0;
        }



    }

    public static void main(String[] args) {
        int[] testNums_1 = new int[]{0,1,0,3,12};
        moveZeros(testNums_1);
    }



}
