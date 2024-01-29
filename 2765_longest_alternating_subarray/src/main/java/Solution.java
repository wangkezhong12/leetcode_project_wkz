public class Solution {
    public int alternatingSubarray(int[] nums) {

        int len = nums.length;
        int res = -1;
        int i = 0;
        int j = 1;
        int m = 2;
        while(j < len) {
            int cu =(int) Math.pow(-1,m);
            if (nums[j] - nums[j-1] == cu){
                res = Math.max(res, j-i+1);
                m ++;
                j ++;
                continue;

            //符合的话向后移
            } else {
                //不符合重新来
                i++;
                j = i+1;
                m = 2;
                continue;

            }
        }


        return res;
    }
}
