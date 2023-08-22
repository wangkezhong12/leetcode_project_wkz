public class Solution {

    //双指针+贪心
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int l = 0;
        //将左侧左右的0视为目前的座位间隔结果
        while (l < seats.length && seats[l] == 0) {
            ++l;
        }
        //如果左侧全是0，则res则为左侧0的个数
        res = Math.max(res,l);
        //如果还没有遍历完数组，出现了1，则开启双指针
        while (l < seats.length) {
            int r = l + 1;
            //出现了1之后，看1后边有多少0
            while (r < seats.length && seats[r] == 0) {
                ++r;
            }
            if (r == seats.length) {
                //如果r是最后一个了，则多了1，所以要先剪掉1
                res = Math.max( r-1-l , res );
            } else {
                res = Math.max( res, (r-l)/2);
            }
            //如果没有结束，那就将现在的r值赋值给l，然后再往后遍历
            l = r;

        }

        return res;
    }
}
