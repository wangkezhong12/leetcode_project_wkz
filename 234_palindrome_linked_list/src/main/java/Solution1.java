import java.util.Arrays;

public class Solution1 {

    public boolean isPalindrome(ListNode head) {

        if (head == null) {return true;}
        int length = 0;
        ListNode p = head;
        while(p != null){
            length ++;
            p = p.next;
        }
        int[] firstHalf  = new int[length/2];
        int temp = 0;
        while(temp <= length/2-1) {
            firstHalf[temp] = head.val;
            head = head.next;
            temp ++;
        }
        if (length%2 == 1) {
            head = head.next;
        }

        for (int i = firstHalf.length-1; i >= 0 && head != null; i--) {
           if (head.val == firstHalf[i]) {
               head = head.next;
               continue;
           } else {
               return false;
           }
        }

        return true;
    }
}
