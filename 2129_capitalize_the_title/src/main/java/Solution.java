import java.util.Locale;

public class Solution {
    public String capitalizeTitle(String title) {

        StringBuffer resultSB = new StringBuffer();
        title = title.toLowerCase(Locale.ROOT);
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuffer wsb = new StringBuffer(words[i]);
            if (i != words.length-1) {
                if (words[i].length() < 3) {
                    resultSB = resultSB.append(words[i]+" ");
                    continue;
                }
                wsb = wsb.append(" ") ;
            } else {
                if (words[i].length() < 3) {
                    resultSB = resultSB.append(words[i]);
                    continue;
                }
            }

            wsb.replace(0,1, wsb.substring(0,1).toUpperCase(Locale.ROOT));
            resultSB.append(wsb);
        }
        return resultSB.toString();
    }
    public String capitalizeTitle_point(String title) {
        StringBuffer sb = new StringBuffer(title.toLowerCase());

        int len = sb.length();
        int l = 0;
        int r = 0;

        while (r < len) {
            //从前往后，右指针到空格停止
            while(r < len && sb.charAt(r) != ' ') {
                ++r;
            }
            if (r-l > 2) {
                sb.replace(l, l+1, sb.substring(l, l+1).toUpperCase());
                ++l;
            }

            l = r+1;
            ++r;
        }


        return sb.toString();

    }
}
