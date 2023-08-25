import java.util.Stack;

public class Solution {

    public boolean isPalindrome(ListNode head){
        boolean flag = true;

        ListNode p = head;
        int length = 1;

        while (p.next != null) {
            length ++;
            p = p.next;
        }
//        System.out.println(length);

        Stack stack = new Stack<ListNode>();
        for (int i = 0; i < length/2; i++) {
            stack.push(head);
            head = head.next;

        }

        if (length%2 == 1) {
          head = head.next;
        }

        while (head != null) {
            ListNode tempNode = (ListNode) stack.pop();
            if ( head.val != tempNode.val) {
                flag = false;
                break;
            } else {
                head = head.next;
            }


        }

        return flag;

    }
}
