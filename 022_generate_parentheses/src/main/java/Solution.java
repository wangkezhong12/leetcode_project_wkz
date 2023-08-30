import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int left = 0;
        int right = 0;

        generateParenthesisHelper(left, right, n, new StringBuffer(), res);

        return res;

    }

    public void generateParenthesisHelper(int left, int right, int n,
                                          StringBuffer parenthesisBuffer,
                                          List<String> res) {

        if (parenthesisBuffer.length() == n*2) {
            res.add(parenthesisBuffer.toString());
            return;
        }

        if (left < n) {
            parenthesisBuffer.append('(');
            generateParenthesisHelper(left + 1, right, n, parenthesisBuffer, res);
            parenthesisBuffer.deleteCharAt(parenthesisBuffer.length()-1);
        }
        if (right < left) {
            parenthesisBuffer.append(')');
            generateParenthesisHelper(left, right + 1, n, parenthesisBuffer, res);
            parenthesisBuffer.deleteCharAt(parenthesisBuffer.length()-1);
        }


    }


}
