import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public boolean isPalindrome(String s) {


        List<Character> letters = Arrays.asList(
                new Character[]{
                        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                        '0','1','2','3','4','5','6','7','8','9'
                });

        char[] sLow = s.toLowerCase().toCharArray();
        LinkedList<Character> sList = new LinkedList<>();
        for (int i = 0; i < sLow.length; i++) {
            if ( letters.contains(sLow[i])){
                sList.addLast(sLow[i]);
            }
        }
        if (sList.size() == 0) return true;

        int mid = sList.size()/2;
        for (int i = 0; i < mid; i++) {
            if (sList.getFirst() != sList.getLast()) {
                return false;
            } else {
                sList.removeFirst();
                sList.removeLast();
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "0P";
        boolean res = solution.isPalindrome(s);
        System.out.println(res);
    }
}
