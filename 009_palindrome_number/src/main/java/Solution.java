public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int mark = x;
        int converse = 0;
        while (x > 0) {
            try {
                if (x/10 > 0) {
                    converse = (converse + x % 10) * 10;

                } else {
                    converse += x;

                }

                x = x/10;

            } catch (Exception e) {
                return false;
            }
        }

        if (mark == converse){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
