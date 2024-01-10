import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) return false;
        List<Character> tList = t.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tList.contains(c)) {
                tList.remove(tList.indexOf(c));
                continue;
            } else {
                return false;
            }
        }

        if (tList.size() != 0) return false;
        return true;
    }
}
