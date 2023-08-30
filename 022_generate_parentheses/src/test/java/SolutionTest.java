import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest extends TestCase {

    public void testGenerateParenthesis() {

        int n = 3;
        Solution solution = new Solution();
        List<String> res = solution.generateParenthesis(n);
        System.out.println(res.toString());

    }
}