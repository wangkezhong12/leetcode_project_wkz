import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<>();

        result = backTrace(1, n);

        return result;

    }

    private List<TreeNode> backTrace(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end ; i++) {

            List<TreeNode> leftTrees = backTrace(start, i-1);

            List<TreeNode> rightTrees = backTrace(i+1, end);

            for (TreeNode leftTree: leftTrees) {
                for (TreeNode rightTree: rightTrees) {
                    TreeNode curTree = new TreeNode(i);
                    curTree.left = leftTree;
                    curTree.right = rightTree;
                    allTrees.add(curTree);
                }
            }

        }

        return allTrees;
    }


}
