import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>(){{
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
            put(500, "D");
            put(1000, "M");
            put(4, "IV");
            put(9, "IX");
            put(40, "XL");
            put(90, "XC");
            put(400, "CD");
            put(900, "CM");
        }};
        StringBuffer sb = new StringBuffer();









        return "";

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 59;
        String s = solution.intToRoman(num);
        System.out.println(s);
    }
}
