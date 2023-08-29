import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {

        int len = nums.length;

        List<List<Integer>> resList = new ArrayList<>();
        if (len == 0) {
            return resList;
        }

        boolean[] used = new boolean[len];

        List<Integer> path = new ArrayList<>();

        dfs(nums, len,0, used, path, resList);

        return resList;
    }

    private void dfs(int[] nums, int len, int depth, boolean[] used,
                     List<Integer> path,
                     List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth+1, used, path, res);
                //回溯上一层节点
                used[i] = false;
                path.remove(path.size()-1);


            }
        }



    }
}
