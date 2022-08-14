import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s) {

        char[] chars = s.toCharArray();

        List<Character> longestPalindrome = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {

            Map<Character, Integer> palindromeMap = new HashMap<>();

            palindromeMap.put(chars[i], i);




        }


        return s;
    }
}
