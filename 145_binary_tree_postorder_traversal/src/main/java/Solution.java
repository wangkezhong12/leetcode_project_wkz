import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        if (root.left != null) {
            List<Integer> left = postorderTraversal(root.left);
            result.addAll(left);
        }

        if (root.right != null) {
            List<Integer> right = postorderTraversal(root.right);
            result.addAll(right);
        }
        result.add(root.val);

        return result;
    }
}
