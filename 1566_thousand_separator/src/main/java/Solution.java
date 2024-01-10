public class Solution {
    public String thousandSeparator(int n){
        if (n == 0) return "0";
        StringBuffer sb = new StringBuffer();
        int count = 0;
        while(n != 0) {
            int t = n%10;
            n = n/10;
            count ++;
            sb.insert(0, (char)(t+'0'));
            if (count == 3 && n > 0) {
                sb.insert(0,'.');
                count = 0;
            }
        }
        return sb.toString();
    }
}
