import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    //LinkedList
    public int[] reversePrint(ListNode head) {

        LinkedList<ListNode> list = new LinkedList<>();
        while(head != null){
            list.addLast(head);
            head = head.next;
        }
        int[] result = new int[list.size()];

        for (int i = list.size()-1; i >= 0; i--) {
            result[result.length-1-i] = list.get(i).val;
        }
        return result;

    }
    //point 指针类的方法更好

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        Solution solution = new Solution();
        int[] result = solution.reversePrint(head);
        System.out.println(Arrays.toString(result));
    }
}
