
public class Solution {
    public int maxArea(int[] height) {

        int maxMeasure = 0;
        int left = 0;
        int right = height.length-1;

        while (left < right) {
            maxMeasure = Math.max(maxMeasure, (right-left)*Math.min(height[left], height[right]));
            if (height[left] < height[right]) { //比较短的是面积的决定性因素
                left++;
            } else {
                right--;
            }
        }

        return maxMeasure;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] hi = new int[]{1,8,6,2,5,4,8,3,7};
        int[] x = new int[]{1,1};
        int[] another = new int[]{2,3,4,5,18,17,6};
        int maxAreaMeasure = solution.maxArea(another);
        System.out.println(maxAreaMeasure);

    }
}
