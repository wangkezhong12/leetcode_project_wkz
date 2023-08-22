import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static String addBinary(String a, String b) {

        int mark = 0;

        for (int i = a.length()-1; i >= 0 ; i--) {
            for (int j =b.length()-1; j >= 0 ; j--) {
                 Character.toString(a.charAt(i));
            }
        }



        return "";

    }

    public static void main(String[] args) {
        String a = "0";
        String b = "1";

        System.out.println(addBinary(a, b));

    }
}
