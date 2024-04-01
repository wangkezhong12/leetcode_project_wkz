import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int len = intervals.length;

        if (len == 0) {
            return new int[][]{newInterval};
        }

        int l = 0, r = len-1;

        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));

        while (l <= r) {
            int lv0 = intervals[l][0];

            if (lv0 < newInterval[0]) {
                l++;
            } else {
                list.add(l, newInterval);
                while(l <= r) {
                    r--;
                }
            }

        }

        ArrayList<int[]> result = new ArrayList<>();
        int[] tempArr = new int[]{list.get(0)[0], list.get(0)[1]};
        for (int i = 1; i < list.size(); i++) {
            int[] val = list.get(i);
            //比较范围大小，如果范围有扩大，就扩大，如果没有扩大，就不变
            if (val[0] == tempArr[0]) {
                tempArr[1] = Math.max(val[1], tempArr[1]);
            } else if (val[0] <= tempArr[1]) {
                tempArr[1] = Math.max(tempArr[1], val[1]);
            } else {
                result.add(new int[]{tempArr[0], tempArr[1]});
                tempArr[0] = val[0];
                tempArr[1] = val[1];
            }
        }
        result.add(tempArr);

        return result.toArray(new int[result.size()][]);

    }
}
