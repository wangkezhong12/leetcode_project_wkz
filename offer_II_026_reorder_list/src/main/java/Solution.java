import java.util.LinkedList;

public class Solution {
    public void reorderList(ListNode head){
        LinkedList<ListNode> list = new LinkedList<ListNode>();
        ListNode x = head;
        list.add(x);
        while(x.next != null) {
            x = x.next;
            list.addLast(x);
        }

        ListNode tmpNode = head;
        while(!list.isEmpty()){
            ListNode y = list.getFirst();
            list.removeFirst();
            if (y != head) {
                tmpNode.next = y;
                tmpNode = tmpNode.next;
                tmpNode.next = null;
            }
            if (list.isEmpty()) {
                break;
            }
            tmpNode.next = list.getLast();
            tmpNode = tmpNode.next;
            tmpNode.next = null;
            list.removeLast();
        }

    }
}
