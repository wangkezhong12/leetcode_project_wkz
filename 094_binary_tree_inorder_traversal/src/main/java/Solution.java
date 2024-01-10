import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        if (root.left != null) {
            List<Integer> left = inorderTraversal(root.left);
            result.addAll(left);
        }
        result.add(root.val);
        if (root.right != null) {
            List<Integer> right = inorderTraversal(root.right);
            result.addAll(right);

        }
        return result;

    }
}
