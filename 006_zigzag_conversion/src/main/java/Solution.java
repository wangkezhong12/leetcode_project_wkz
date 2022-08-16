public class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        char[] chars = s.toCharArray();


        StringBuffer stringBuffer = new StringBuffer();

        StringBuffer[] sbArr = new StringBuffer[numRows];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < numRows ; j++) {
                if (sbArr[j] == null) {
                    sbArr[j] = new StringBuffer();
                }
                if (i%(2*numRows-2) == j || (2*numRows-2)-i%(2*numRows-2) == j) {
                    sbArr[j].append(chars[i]);
                }
            }
        }

        for (int i = 0; i < numRows ; i++) {
            stringBuffer.append(sbArr[i]);
        }

        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        String result = solution.convert(s, 2);
        System.out.println(result);

    }
    //3:PAHNAPLSIIGYIR 4:PINALSIGYAHRPI


}