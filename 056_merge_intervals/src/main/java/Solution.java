import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {


        int len = intervals.length;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });


        List<int[]> arrList = new ArrayList<>();

        int[] tempArr = new int[]{intervals[0][0], intervals[0][1]};
        for (int i = 1; i < len; i++) {
            int[] val = intervals[i];
            //比较范围大小，如果范围有扩大，就扩大，如果没有扩大，就不变
            if (val[0] == tempArr[0]) {
                tempArr[1] = Math.max(val[1], tempArr[1]);
            } else if (val[0] <= tempArr[1]) {
                tempArr[1] = Math.max(tempArr[1], val[1]);
            } else {
                arrList.add(new int[]{tempArr[0], tempArr[1]});
                tempArr[0] = val[0];
                tempArr[1] = val[1];
            }
        }
        arrList.add(tempArr);

        return arrList.toArray(new int[arrList.size()][]);
    }
}
