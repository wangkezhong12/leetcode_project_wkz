public class Solution {

    public void reverseString(char[] s) {
        if (1 == s.length) return;
        for (int i = 0; i < s.length/2; i++) {
            char head = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = head;
        }

    }
}
