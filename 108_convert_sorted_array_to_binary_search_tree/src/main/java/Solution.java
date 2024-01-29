public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();

        int len = nums.length;
        if (len == 1) {
            return new TreeNode(nums[0]);
        }

        if (len ==2) {
            TreeNode left = new TreeNode(nums[0]);
            return new TreeNode(nums[1],left,null);
        }

        int mid = len/2;

        root.val = nums[mid];

        int[] minNums = new int[mid];
        int[] maxNums = new int[len-1-mid];
        for (int i = 0; i < mid; i++) {
            minNums[i] = nums[i];
        }
        root.left = sortedArrayToBST(minNums);

        for (int i =0,j = mid+1;i< maxNums.length&& j < len ; i++, j++) {
            maxNums[i] = nums[j];
        }
        root.right = sortedArrayToBST(maxNums);

        return root;

    }
}
