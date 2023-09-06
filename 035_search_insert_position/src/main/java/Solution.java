public class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (right-left)/2+left;
            if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid+1;
            } else {
                return mid;
            }

        }
        return left;

    }
}
