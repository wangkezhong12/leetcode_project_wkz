
public class Solution {
    public static String addBinary(String a, String b) {
        //将较长的给a
        if (b.length() > a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        StringBuffer sba = new StringBuffer(a);

        for (int i = a.length()-1, j = b.length()-1; i >= 0 && j >=0 ; i--, j--) {
            char temp = (char) ((a.charAt(i)-'0')+(b.charAt(j)-'0') + '0');
            sba.setCharAt(i, temp);
        }

        int mark = 0;
        for (int i = sba.length()-1; i >= 0 ; i--) {
            int iVal = sba.charAt(i) - '0';
            if (mark + iVal == 1 || mark + iVal == 0) {
                sba.setCharAt(i,(char)(mark+iVal+'0'));
                mark = 0;
                continue;
            } else {
                sba.setCharAt(i, (char)(mark+iVal-2+'0'));
                mark = 1;
            }
        }
        if (mark == 1) {
            sba.insert(0,'1');
        }

        return sba.toString();

    }

    public static void main(String[] args) {
        String a = "11110";
        String b = "111";

        System.out.println(addBinary(a, b));

    }
}
