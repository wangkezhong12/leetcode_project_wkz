public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


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
        System.out.println(this.toString());
    }


}