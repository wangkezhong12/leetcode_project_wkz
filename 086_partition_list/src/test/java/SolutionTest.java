import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testPartition() {

        ListNode head = ListNode.generateList(new int[]{1, 4, 3, 2, 5, 2});

        head.printList();

        Solution solution = new Solution();
        ListNode resNode = solution.partition(head, 3);
        resNode.printList();

    }
}