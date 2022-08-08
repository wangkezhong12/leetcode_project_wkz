import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charsArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char cur = charsArr[right];

            if (map.containsKey(cur)){
                //在map中找到这个重复的char所在的下一个char作为子串的长度计算开始
                left = Math.max(map.get(cur) + 1,left);
            }
            //拿更新后的右指针和目前的最大值做比较
            max = Math.max(right + 1 -left, max);

            map.put(cur,right);

        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abba";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

