import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {


    public List<List<Integer>> permuteUnique(int[] nums) {

        int len = nums.length;

        List<List<Integer>> resList = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        boolean[] used = new boolean[len];


        Arrays.sort(nums);

        dfs(nums, len, 0, used, path, resList);

        return resList;
    }

    private void dfs(int[] nums, int len, int depth, boolean[] used,
                     List<Integer> path,
                     List<List<Integer>> res) {

        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, used, path, res);

                used[i] = false;
                path.remove(depth);

            }
        }

    }
}
