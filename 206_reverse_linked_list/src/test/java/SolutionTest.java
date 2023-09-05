import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testReverseList(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode res = solution.reverseList(head);
        res.printList();


    }
}