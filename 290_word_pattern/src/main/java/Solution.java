import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] sArr = s.split(" ");
        int pLen = pattern.length();
        int sLen = sArr.length;

        Map<Character, String> p2sMap = new HashMap<>();
        Map<String, Character> s2pMap = new HashMap<>();

        if (pLen != sLen) {
            return false;
        }
        
        if (pLen == sLen && pLen == 1) {
            return true;
        }

        for (int i = 0; i < sLen; i++) {
            char c = pattern.charAt(i);
            String si = sArr[i];
            if ((p2sMap.containsKey(c) && !p2sMap.get(c).equals(si)) || (s2pMap.containsKey(si) && s2pMap.get(si) != c)) {
                return false;
            }
            p2sMap.put(Character.valueOf(c), si);
            s2pMap.put(si, Character.valueOf(c));
        }
        
        

        return true;

    }
}
