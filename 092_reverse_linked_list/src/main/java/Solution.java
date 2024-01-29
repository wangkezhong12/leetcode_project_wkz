public class Solution {
    public  ListNode reverseBetween(ListNode head, int left, int right) {

        if ( head == null || head.next == null || left == right) {
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;
        ListNode partPre = new ListNode(0,head);
        ListNode partEnd = p;
        int count = 1;

        while(q != null && count < right) {
            if (count < left) {
                //1.当count < left 时，不进行操作，只将指针向后移
                partPre = partPre.next;
                p = p.next;
                q = q.next;
                count ++;
                continue;
            } else{
                //开始反转链表，直到count > right

                ListNode tempNode = q;

                if (count == left) {
                    //2.当count == left 时,将开头的
                    p.next = null;
                    partEnd = p;

                }
                q = q.next;
                tempNode.next = p;
                p = tempNode;

                count++;
            }

            partPre.next = p;
//            head.printList();


        }
        //转置结束后拼接尾部
        if (q != null) {
            partEnd.next = q;
        }

        if (left == 1) {
            return partPre.next;
        } else {
            return head;
        }

//        return head;

    }
}
