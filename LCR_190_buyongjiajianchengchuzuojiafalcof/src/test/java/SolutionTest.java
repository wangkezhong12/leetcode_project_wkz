import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testEncryptionCalculate() {

        int dataA = 5;
        int dataB = -1;
        Solution solution = new Solution();
        int res = solution.encryptionCalculate(dataA,dataB);
        System.out.println(res);

    }
}