import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {

        int len = citations.length;
        Arrays.sort(citations);

        int h = 0;
//        System.out.println(Arrays.toString(citations));

        if (citations[0] >= len) {
            return len;
        }

        for (int i = len-1 ; i >= 0 ; i--) {
            if ( citations[i] >= len-i) {
                continue;
            } else {
                h = len-1-i;
                break;
            }
        }

        return h;
    }
}
