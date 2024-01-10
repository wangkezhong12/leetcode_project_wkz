import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer[]> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!indexMap.containsKey(nums[i])) {
                Integer[] status = new Integer[2];
                status[0] = i;
                status[1] = 0;
                indexMap.put(nums[i], status);

            } else {
                Integer[] temp = indexMap.get(nums[i]);
                int distance = i - temp[0];
                temp[0] = i;

                if (temp[1] == 0 || (temp[1] > 0 && distance < temp[1]) ) {
                    temp[1] = distance;
                }
                indexMap.put(nums[i], temp);

            }

        }

        for (Map.Entry<Integer,Integer[]> entry: indexMap.entrySet()) {
            Integer[] status = entry.getValue();
            if (status[1] > 0 && status[1] <= k) {
                return true;
            }

        }

        return  false;
    }

    //这算是暴力，不算是滑动窗口
    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        int l = 0; //左指针
        int r = 1; //右指针

        while ( l < nums.length-1) {

            //当右指针超过数组长度，且左指针尚未到达最右侧时，中间仍有可能存在满足条件的两个数字
            if (r >= nums.length) {
                l++;
                r=l+1;
                continue;
            }
            //r-l>k 的时候，将l++ 作为新的起点
            if (r-l > k) {
                l++;
                r=l;
            }

            if (r!=l && r-l <= k && nums[l] == nums[r]) {
                return true;
            }

            r++;
        }


        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (i > k){
                set.remove(nums[i-k-1]);
            }

            if (!set.add(nums[i])){
                return true;
            }

        }

        return false;

    }
}
