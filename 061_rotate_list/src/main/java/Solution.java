public class Solution {
    public ListNode rateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = new ListNode(Integer.MIN_VALUE,head);
        ListNode q = head;
        for (int i = 1; i < k; i++) {
            if (q.next == null) {
                q = head;
            }else {
                q = q.next;
            }
        }

        if (q.next == null) {
            return head;
        }

        while(q.next != null) {
            p = p.next;
            q = q.next;
        }

        ListNode tempNode = p.next;
        p.next = null;
        q.next = head;
        head = tempNode;

        return head;


    }
}
