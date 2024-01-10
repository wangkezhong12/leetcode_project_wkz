import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] alphabet = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            alphabet[c-'a'] ++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            alphabet[c-'a'] --;
            if (alphabet[c-'a'] < 0) {
                return false;
            }

        }

        return true;
    }
}
