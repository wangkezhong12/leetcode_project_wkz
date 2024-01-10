
public class Solution {
    public boolean isValidBST(TreeNode root) {
        boolean flag = recuse(root, null, null);
        return  flag;
    }

    public boolean recuse(TreeNode root, Integer lower, Integer upper) {
        if (root == null) {return true;}

        int val = root.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!recuse(root.left, lower,  val)) return false;
        if (!recuse(root.right, val, upper)) return false;
        return true;

    }
}
