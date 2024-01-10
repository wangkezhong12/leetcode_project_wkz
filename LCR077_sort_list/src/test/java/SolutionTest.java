import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testSortList() {

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("排序前：");
        head.printList();
        Solution solution = new Solution();
        ListNode res = solution.sortList(head);

        System.out.println("排序前：");
        res.printList();
    }
}