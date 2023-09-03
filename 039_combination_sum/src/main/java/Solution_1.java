import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        Arrays.sort(candidates);
        backTrack(candidates, 0 ,target, path, res);

        return res;

    }

    public void backTrack(int[] candidates, int begin, int residue,
                          List<Integer> path,
                          List<List<Integer>> res) {
        if (residue < 0) {
            return;
        }
        if (residue == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            //因为数组是有序的，所以如果第i个值也不行的话，就可以直接跳出了
            if (residue - candidates[i] < 0) {
                break;
            }

            path.add(candidates[i]);
            // 从第i个开始，防止前边的多跑
            backTrack(candidates, i, residue - candidates[i], path, res);
            path.remove(path.size()-1);

        }


    }




}
