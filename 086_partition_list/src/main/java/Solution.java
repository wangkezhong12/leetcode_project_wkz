public class Solution {

    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode();
        ListNode smallHead = small;
        ListNode big = new ListNode();
        ListNode bigHead = big;
        while (head != null) {
            if (head.val >= x) {
                big.next = head;
                big = big.next;
            } else {
                small.next = head;
                small = small.next;
            }
            head = head.next;
        }

        big.next = null;
        small.next = bigHead.next;

        return smallHead.next;
    }
}
