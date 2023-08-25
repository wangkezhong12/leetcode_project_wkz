import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testIsPalindrome() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution solution = new Solution();
        boolean flag = solution.isPalindrome(head);
        System.out.println(flag);
    }

    public void testIsPalindrome1() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        Solution solution = new Solution();
        boolean flag = solution.isPalindrome(head);
        System.out.println(flag);
    }

}