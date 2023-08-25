import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    Solution solution = new Solution();

    public void testRemoveElements() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        head.printList();

        int val = 6;

        head = solution.removeElements(head, val);
        head.printList();



    }

    public void testRemoveElements1() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);


        head.printList();

        int val = 1;

        head = solution.removeElements(head, val);
        head.printList();



    }


    public void testRemoveElements2() {

        ListNode head = new ListNode(7);
        head.next = new ListNode(7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);

        head.printList();

        int val = 7;

        head = solution.removeElements(head, val);
        head.printList();



    }


}