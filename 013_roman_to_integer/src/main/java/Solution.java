import java.util.HashMap;

public class Solution {

    /*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    */


    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> xmap = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (xmap.get(chars[i]) < xmap.get(chars[i+1])) {
                result -= xmap.get(chars[i]);
            } else {
                result += xmap.get(chars[i]);
            }

        }
        result += xmap.get(chars[chars.length -1]);

        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "IX";
        int result = solution.romanToInt(s);
        System.out.println(result);
    }

}
