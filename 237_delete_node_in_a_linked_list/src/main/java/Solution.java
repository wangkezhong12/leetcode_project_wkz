
public class Solution {

    /**
     * 纯纯脑筋急转弯
     * 删除当前node 相当于删除node.next 并把node.next的数值赋给node
     * @param node
     */
    public void deleteNode(ListNode node) {

        ListNode tempNode = node.next;
        node.val = node.next.val;
        node.next = tempNode.next;
        tempNode.next = null;


    }

}
