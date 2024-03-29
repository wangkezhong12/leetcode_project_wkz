import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;

        List<List<Integer>> resList = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        boolean[] used = new boolean[len];

        dfs(nums, len, 0, used, path, resList);

        return resList.stream().distinct().collect(Collectors.toList());

    }

    private void dfs(int[] nums, int len, int depth, boolean[] used,
                     List<Integer> path,
                     List<List<Integer>> res) {

        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, used, path, res);

                used[i] = false;
                path.remove(path.size() -1);


            }

        }
            
    }



}
