import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        m --;
        n --;
        while ( m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] :nums2[n--];
        }
        while(n >= 0) {
            nums1[p--] = nums2[n--];
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        solution.merge(nums1, 0, nums2,1);
        System.out.println(Arrays.toString(nums1));
    }

}
