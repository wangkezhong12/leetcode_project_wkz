
public class Solution {

    /**
     * 使用双指针的方式实现重复节点的删除
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
//      构造两个指针，慢指针p指向链表头前一个节点，快指针q指向链表头节点
        ListNode p = new ListNode(Integer.MAX_VALUE);
        p.next = head;
        ListNode q = head;
//      把head指向最前节点，这样可以排除特殊情况
        head = p;

        while(q != null) {
//          如果快指针q的值和 q.next 的值相等，则将快指针后移
            if (q.next != null && q.val == q.next.val) {
                q = q.next;
//          当q.val != q.next.val的时候，验证p和q的位置
            } else {
//              如果p.next 就是q ，那么两个指针同时向后移
                if (p.next == q) {
                    p = q;
                    q = q.next;
//              如果p.next 不是q ，那么说明两个指针中间是重复的
                } else {
                    ListNode tempNode = q;
                    q = q.next;
                    p.next = q;
                    tempNode.next = null;

                }

            }

        }

        return head.next;
    }
}
