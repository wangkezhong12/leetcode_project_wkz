import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lli = new ArrayList<List<Integer>>();
        if (root == null) {
            return lli;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> levelList = new ArrayList<Integer>();
            while (count > 0) {
                TreeNode curNode = queue.poll();
                levelList.add(curNode.val);
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
                count -- ;
            }
            lli.add(levelList);
        }

        return lli;
    }
}
