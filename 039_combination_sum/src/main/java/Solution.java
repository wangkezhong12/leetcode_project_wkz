import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        Arrays.sort(candidates);
        backTrack(candidates, target, path, res);

        return res;

    }

    public void backTrack(int[] candidates, int target,
                          List<Integer> path,
                          List<List<Integer>> res) {
        int sum = 0;
        if (path.size() > 0) {
            for (int i = 0; i < path.size(); i++) {
                sum = sum + path.get(i);
            }
        }

        if (sum == target || res.size() == 150) {

            res.add(new ArrayList<>(path));
            return;

        }

        for (int i = 0; i < candidates.length; i++) {

            if (sum + candidates[i] > target) {
                break;
            } else if (sum + candidates[i] < target){
                path.add(candidates[i]);
                backTrack(candidates,target, path ,res);
                path.remove(path.size()-1);
            } else {
                List<Integer> tempList = new ArrayList<>(path);
                tempList.add(candidates[i]);
                Collections.sort(tempList);
                if (res.contains(tempList)) {
                    continue;
                } else {
                    backTrack(candidates, target, tempList, res);
                }
            }

        }



    }


    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        System.out.println(testList);
        System.out.println(testList.stream().reduce(0, (a, b)-> a+b));
    }

}
