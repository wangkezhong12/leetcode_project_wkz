import javax.swing.plaf.SliderUI;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = head;


        Map<Integer, ListNode> tempMap = new HashMap<Integer, ListNode>();
        int nodeSize = 1;
        while(tempNode != null) {
            tempMap.put(nodeSize, tempNode);
            nodeSize ++;
            tempNode = tempNode.next;
        }

        if (tempMap.size() < n || tempMap.size() <= 1){
            return null;
        }
        if (nodeSize - 1 - n  == 0){
            head = head.next;
            tempMap.get(1).next = null;
        } else {
            tempMap.get(nodeSize - 1 - n).next = tempMap.get(nodeSize - 1 - (n-1) + 1 );
            tempMap.get(nodeSize -1 -(n-1)).next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
