import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            numsMap.put(nums1[i][0], nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (numsMap.containsKey(nums2[i][0])) {
                numsMap.put(nums2[i][0], numsMap.get(nums2[i][0]) + nums2[i][1]);
            } else {
                numsMap.put(nums2[i][0], nums2[i][1]);
            }
        }

        int[][] result = new int[numsMap.size()][2];
        List<Map.Entry<Integer, Integer>> x = numsMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        int i = 0;
        for (Map.Entry<Integer, Integer> entry: x) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }
        return result;
    }

    //归并排序法
    public int[][] mergeArrays_1(int[][] nums1, int[][] nums2) {


        return new int[1][1];

    }

}
