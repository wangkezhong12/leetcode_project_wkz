public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode((l1.val + l2.val)%10 );
        ListNode m = resultListNode;
        int stepIn = (l1.val + l2.val)/10;
        int sum = 0;
        while(l1.next != null || l2.next != null){
            if ( l1.next != null && l2.next != null) {
                l1 = l1.next;
                l2 = l2.next;
                sum = l1.val + l2.val + stepIn ;
            } else if (l1.next == null && l2.next != null) {
                l2 = l2.next;
                sum = l2.val + stepIn;

            } else if (l1.next != null && l2.next == null) {
                l1 = l1.next;
                sum = l1.val + stepIn;
            }
            resultListNode.next = new ListNode(sum%10);
            resultListNode = resultListNode.next;
            if (sum >= 10){
                stepIn = 1;
            } else {
                stepIn = 0;
            }
        }
        if (stepIn == 1) {
            resultListNode.next = new ListNode(1);
        }

        return  m;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);



/*
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);
        //l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
        //l2.next.next = new ListNode(4);


 */

        ListNode result = solution.addTwoNumbers(l1,  l2);

        while (result!= null) {
            System.out.println(result.val);
            result = result.next;
        }



    }

}

