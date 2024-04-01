import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> s2tMap = new HashMap<>();
        Map<Character,Character> t2sMap = new HashMap<>();

        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        }

        if (sLen == 1 && sLen == tLen ) {
            return true;
        }

        for (int i = 0; i < sLen; i++) {
            Character sKey = s.charAt(i);
            Character tKey = t.charAt(i);

            if ((s2tMap.containsKey(sKey) && s2tMap.get(sKey) != tKey) || (t2sMap.containsKey(tKey) && t2sMap.get(tKey) != sKey) ) {
                return false;
            }

            s2tMap.put(sKey, tKey);
            t2sMap.put(tKey, sKey);
        }



        return true;
    }
}
