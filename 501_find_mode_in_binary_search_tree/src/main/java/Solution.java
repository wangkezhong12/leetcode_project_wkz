import java.util.*;

public class Solution {
    public int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> nodeMap = new HashMap<>();
        traversal(root, nodeMap);

        Map.Entry<Integer, Integer> max = nodeMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: nodeMap.entrySet()) {
            if (entry.getValue() == max.getValue()) {
                resultList.add(entry.getKey());
            }
        }


        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
    private void traversal(TreeNode root, HashMap<Integer, Integer> rootMap) {
        if (root == null) {return;}

        if (rootMap.containsKey(root.val)) {
            rootMap.put(root.val, rootMap.get(root.val)+1 );
        } else {
            rootMap.put(root.val, 1);
        }
        //left
        if (root.left != null) {
            traversal(root.left, rootMap);
        }
        //right
        if (root.right != null) {
            traversal(root.right, rootMap);
        }

    }
}
