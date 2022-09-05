import java.util.List;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        boolean flag = false;

        ListNode fast = head;
        ListNode slow = head;


        while (fast.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = true;
                break;
            }
            if (fast == null || slow == null) {
                break;
            }
        }
        return flag;


    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(3);
        ListNode n1 = new ListNode(2);
        head.next = n1;
        ListNode n2 = new ListNode(0);
        n1.next = n2;
        ListNode n3 = new ListNode(4);
        n2.next = n3;
        n3.next = n1;

        ListNode h1 = new ListNode(1);
        ListNode m1 = new ListNode(2);
        h1.next = m1;

        boolean res = solution.hasCycle(h1);
        System.out.println(res);

    }
}
