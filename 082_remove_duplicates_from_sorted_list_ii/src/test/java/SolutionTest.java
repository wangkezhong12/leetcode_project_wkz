import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testDeleteDuplicates() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();

        ListNode resNode = solution.deleteDuplicates(head);
        resNode.printList();


    }


    public void testDeleteDuplicates1() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);

        Solution solution = new Solution();

        ListNode resNode = solution.deleteDuplicates(head);
        resNode.printList();


    }

    public void testDeleteDuplicates2() {

        ListNode head = new ListNode();


        Solution solution = new Solution();

        ListNode resNode = solution.deleteDuplicates(head);
        resNode.printList();


    }

}