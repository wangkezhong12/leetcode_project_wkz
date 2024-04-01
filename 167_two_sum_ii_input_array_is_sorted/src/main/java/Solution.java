public class Solution {
    /**
     * O(nlogn)复杂度，用例可通过，但是超时
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {

        int len = numbers.length;

        int l=0,r=1;

        while (l < len) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l+1, r+1};
            } else {

                if (r == len-1 || numbers[l] + numbers[r] > target) {
                    l++;
                    r = l+1;
                    continue;
                } else if (numbers[l] + numbers[r] < target){
                    r++;
                    continue;
                }
            }
        }

        return new int[2];
    }

    public int[] twoSum_1(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;

        while (l<r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                return new int[]{l+1,r+1};
            }
        }
        return new int[2];
    }


}
