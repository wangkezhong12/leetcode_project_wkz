import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

//        LinkedList<Integer> list = new LinkedList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > indexDiff) {
                set.remove(nums[i-indexDiff-1]);
            }
            Integer neigber =  set.ceiling(nums[i] - valueDiff);

            if (neigber != null && neigber <= nums[i] + valueDiff) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}
