import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testGroupAnagrams() {

        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        Solution solution = new Solution();
        List<List<String>> resCollection = solution.groupAnagrams(strs);
        System.out.println(resCollection.toString());

    }

    public void testGroupAnagrams1() {

        String[] strs = new String[]{"ac", "c"};
        System.out.println(0^'a'^'c');
        System.out.println(0^'c');

        Solution solution = new Solution();
        List<List<String>> resCollection = solution.groupAnagrams(strs);
        System.out.println(resCollection.toString());

    }
}