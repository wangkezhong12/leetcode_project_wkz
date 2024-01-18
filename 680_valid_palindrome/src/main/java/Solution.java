public class Solution {
    public boolean validPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        StringBuffer sb = new StringBuffer(s);
        int remain = 1;

        int i = 0;
        int j = s.length()-1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                if (i <= j && isPalindrome(sb.substring(i,j)) && remain == 1) {

                    i++;
                    j-= 2;
                    remain -=1;

                } else if ( i <=j &&isPalindrome(sb.substring(i+1,j+1)) && remain == 1) {
                    i+=2;
                    j--;
                    remain -= 1;
                } else {
                    return  false;
                }

            }

        }

        return true;
    }
    public boolean isPalindrome(String sb) {
        if (sb.length() <= 1) {
            return true;
        }
        int i = 0, j = sb.length()-1;

        while (i <= j) {
            if (sb.charAt(i) == sb.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
