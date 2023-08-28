import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode generateList(int[] vals) {
        ListNode head = new ListNode(vals[0]);
        ListNode p = head;
        for (int i = 1; i < vals.length; i++) {
            ListNode tempNode = new ListNode(vals[i]);
            p.next = tempNode;
            p = p.next;
        }
        return head;

    }

    public String toString() {
        ListNode dem = this;
        String res = "";

        while (dem != null) {
            res = res + String.valueOf(dem.val);
            if (dem.next != null) {
                res = res + " -> ";
            }
            dem = dem.next;
        }
        return  res;
    }

    public void printList() {
        if (this == null) {
            System.out.println("[]");
        } else {
            System.out.println("[ " + this.toString() +" ]");

        }
    }


}