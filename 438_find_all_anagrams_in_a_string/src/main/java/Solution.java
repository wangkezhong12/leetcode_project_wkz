import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }


        char[] pArr = p.toCharArray();


        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length ; i++) {
            List<Character> pList = new ArrayList<>();
            for (char c : pArr) {
                pList.add(c);
            }
            if (i+ pArr.length > sArr.length) {
                break;
            }
            for (int j = i; j < i + pArr.length; j++) {
                if (!pList.contains(sArr[j])) {
                    break;
                } else {
                    pList.remove(Character.valueOf(sArr[j]));
                }
            }
            if (pList.size() == 0) {
                result.add(i);
            }
        }

        return result;

    }

    public List<Integer> findAnagrams_1(String s, String p) {

        int sLen = s.length();
        int pLen = p.length();

        List<Integer> result = new ArrayList<>();

        if (sLen < pLen) {
            return result;
        }


        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i)-'a'];
            ++pCount[p.charAt(i)-'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }

        for (int i = 0; i < sLen-pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i+pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                result.add(i+1);
            }
        }



        return result;
    }
}
