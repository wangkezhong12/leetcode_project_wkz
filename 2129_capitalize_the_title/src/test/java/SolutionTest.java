import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testCapitalizeTitle() {
        String title = "L hV";
        Solution solution = new Solution();
        String res = solution.capitalizeTitle(title);
        System.out.println(res);
    }

    public void testCapitalizeTitle_point() {
        String title = "capiTalIze tHe titLe";
        Solution solution = new Solution();
        String res = solution.capitalizeTitle_point(title);
        System.out.println(res);
    }
}