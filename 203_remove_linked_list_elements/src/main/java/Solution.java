public class Solution {


    /**
     * 使用双指针的方法如下
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode q = head, p = new ListNode();

        while (q != null) {
            if (q.val == val) {
                ListNode tempNode = q;
                q=q.next;
                p.next = q;
                tempNode.next = null;

            } else {
                p = q;
                q = q.next;
            }

        }

        if (head == null) {
            return head;
        }else if (head.val == val) {
            head = head.next;
        }


        return head;
    }

    /**
     * 还有一种办法是递归处理链表
     *
     *
     * */


}
