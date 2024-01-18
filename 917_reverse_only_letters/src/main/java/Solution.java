import java.util.Arrays;

public class Solution{
    public String reverseOnlyLetters(String s) {

        int len = s.length();
        if (len <= 1) {return s;}

        char[] cArr = s.toCharArray();
        int l = 0;
        int r = len-1;
        while(l<=r) {
            if (Character.isLetter(cArr[l]) && Character.isLetter(cArr[r])) {
                char tmp = cArr[r];
                cArr[r] = cArr[l];
                cArr[l] = tmp;
                r--;
                l++;
            } else if (Character.isLetter(cArr[l]) && !Character.isLetter(cArr[r])) {
                r--;
                continue;
            } else if (!Character.isLetter(cArr[l]) && Character.isLetter(cArr[r])){
                l++;
                continue;
            } else {
                l++;
                r--;
                continue;
            }
        }

        return new String(cArr);

    }

}
