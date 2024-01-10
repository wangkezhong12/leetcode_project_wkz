import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        if (root.left != null) {
            List<Integer> left = preorderTraversal(root.left);
            result.addAll(left);
        }

        if (root.right != null) {
            List<Integer> right = preorderTraversal(root.right);
            result.addAll(right);
        }

        return result;

    }
}
