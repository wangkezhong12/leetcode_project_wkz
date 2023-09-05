public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {return head;}
        ListNode p = head;
        ListNode q = head.next;


        while(q.next != null) {
            ListNode tempNode = q;
            if (p == head) {
                p.next = null;
            }
            q = q.next;
            tempNode.next = p;
            p = tempNode;
        }
        if (p.next == q) {
            p.next =null;
        }
        q.next = p;
        return q;
    }
}
