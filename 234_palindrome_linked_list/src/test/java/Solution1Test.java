import junit.framework.TestCase;

public class Solution1Test extends TestCase {

    Solution1 solution1 = new Solution1();
    public void testIsPalindrome() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean res = solution1.isPalindrome(head);
        System.out.println(res);

    }

    public void testIsPalindrome1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean res = solution1.isPalindrome(head);
        System.out.println(res);

    }

    public void testIsPalindrome2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        boolean res = solution1.isPalindrome(head);
        System.out.println(res);

    }

}