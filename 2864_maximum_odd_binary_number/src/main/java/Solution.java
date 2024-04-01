public class Solution {

    public String maximumOddBinaryNumber(String s) {
        int len = s.length();
        StringBuffer sb = new StringBuffer();
        int oneCount = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                oneCount ++;
            }
        }

        int zeroCount = len - oneCount;
        while (oneCount > 1) {
            sb.append('1');
            oneCount--;
        }
        while (zeroCount > 0) {
            sb.append('0');
            zeroCount--;
        }

        return sb.append('1').toString();

    }
}
