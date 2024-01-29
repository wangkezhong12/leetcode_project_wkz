import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<String,Integer> sMap = new HashMap<>();
        Map<String,Integer> tMap = new HashMap<>();

        int sLen = s.length();
        int tLen = t.length();

        if (sLen == 1 && sLen == tLen ) {
            return true;
        }

         



        return false;
    }
}
