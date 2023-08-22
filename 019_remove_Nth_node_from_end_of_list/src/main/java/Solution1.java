public class Solution1 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head, q = head;
        for (int i = n + 1; i > 0 ; i--) {
            if (q == null) {
                return head.next;
            }
            q = q.next;
        }
        while(q != null) {
            p = p.next;
            q = q.next;
        }
        ListNode demo = p.next;
        p.next = p.next.next;
        demo.next = null;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = removeNthFromEnd(head, 2);
        res.printList();


        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);

        ListNode res1 = removeNthFromEnd(head1, 1);
        res1.printList();

    }
}
