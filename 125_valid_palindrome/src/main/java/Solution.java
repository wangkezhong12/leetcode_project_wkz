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

    public boolean isPalindrome1(String s) {
        if (s.length() <= 1) {
            return true;
        }
        char[] sArr = s.toLowerCase().toCharArray();
        int l = 0;
        int r = s.length()-1;
//        System.out.println(Arrays.toString(sArr));

        while(l<=r){

            int lASC = (int)sArr[l];
            int rASC = (int)sArr[r];
//            System.out.print(lASC);
//            System.out.println(rASC);
            while(lASC < 48 || (lASC >57 && lASC <97) || lASC > 122) {
                l++;
                if (l>r) {
                    break;
                }

                lASC = (int)sArr[l];

            }
            while (rASC < 48 || (rASC >57 && rASC <97) || rASC > 122) {
                r--;
                if (l>r) {
                    break;
                }
                rASC = (int)sArr[r];
            }

            if (l>r) {
                break;
            }

            if (lASC == rASC) {
                l++;
                r--;
            } else {
                return false;
            }



        }

        return true;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = ".;";
        //boolean res = solution.isPalindrome(s);
        boolean res1 = solution.isPalindrome1(s);

        System.out.println(res1);
    }
}
