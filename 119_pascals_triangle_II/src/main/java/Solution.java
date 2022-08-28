import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        Integer[] preArr = new Integer[0];
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            Integer[] curArr = new Integer[i+1];

            if (i < 2){
                for (int j = i; j >= 0 ; j--) {
                    curArr[j] = 1;
                }
            } else {
                curArr[0] = curArr[i] = 1;
                for (int j = 1; j < i; j++) {
                    curArr[j] = preArr[j-1] + preArr[j];
                }
            }
            result.add(Arrays.asList(curArr));
            preArr = curArr;
        }


        return result;

    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] preArr = new Integer[0];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            Integer[] curArr = new Integer[i+1];

            if (i < 2){
                for (int j = i; j >= 0 ; j--) {
                    curArr[j] = 1;
                }
            } else {
                curArr[0] = curArr[i] = 1;
                for (int j = 1; j < i; j++) {
                    curArr[j] = preArr[j-1] + preArr[j];
                }
            }
            result = Arrays.asList(curArr);
            preArr = curArr;
        }

        return  result;


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        List<List<Integer>> res = solution.generate(1);
//        System.out.println(Arrays.toString(res.toArray()));
        List<Integer> res = solution.getRow(3);
        System.out.println(Arrays.toString(res.toArray()));


    }
}
