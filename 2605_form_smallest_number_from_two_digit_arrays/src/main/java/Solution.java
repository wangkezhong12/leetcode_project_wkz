import java.util.Arrays;

public class Solution {

    public int minNumber(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int nums1Min = nums1[0];
        int nums2Min = nums2[0];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    return nums1[i];
                }
            }

        }

        return nums1Min < nums2Min ? nums1Min*10+nums2Min : nums2Min*10+nums1Min;


    }
}
