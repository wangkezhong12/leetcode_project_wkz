import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testReverseBetween() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        head.printList();
        Solution solution = new Solution();
        ListNode m = solution.reverseBetween(head,1,2);
        m.printList();

    }
}