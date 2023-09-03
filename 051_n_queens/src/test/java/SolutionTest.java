import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testSolveNQueens() {
        Solution solution = new Solution();
        int n = 4;
        List<List<String>> result = solution.solveNQueens(n);
        System.out.println(result.toString());
    }
}