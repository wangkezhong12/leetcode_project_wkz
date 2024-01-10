public class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null) {return head;}

        //构造等长数组
        ListNode p = head;
        ListNode q = head;
        int len = 0;
        while(p != null){
            len++;
            p = p.next;
        }

        ListNode[] nodeArr = new ListNode[len];

        int i = 0;
        while (q != null) {
            nodeArr[i] = q;
            q = q.next;
            nodeArr[i].next = null;
            i++;
        }

        //使用排序算法将节点排序
        nodeArr = quickSort(nodeArr, 0, len-1);

        //排序后将数组转换回链表
        head = nodeArr[0];
        ListNode xNode = head;
        for (int j = 1; j < nodeArr.length; j++) {
            xNode.next = nodeArr[j];
            xNode = xNode.next;
        }
        xNode.next = null;



        return head;
    }

    public ListNode[] quickSort(ListNode[] nums, int left, int right) {
        if (left < right) {
            int mid = partition(nums, left, right);

            nums = quickSort(nums, left, mid-1);
            nums = quickSort(nums, mid+1, right);
        }


        return nums;
    }

    public int partition(ListNode[] nums, int left, int right) {
        //把最左端的元素作为中枢元素
        ListNode pivot = nums[left];
        int i = left + 1;
        int j = right;

        while(true) {
            //1.左侧数值小于中枢数值时，将i向右平移一位
            while (i<=j && nums[i].val <= pivot.val) {i++;}
            //2.右侧数值大于中枢数值时，将j向左平移一位
            while (i<=j && nums[j].val >= pivot.val) {j--;}
            //3.如果此时i>j 则跳出循环
            if (i > j) {
                break;
            }
            //上述1.2.3条件均不符合时，说明出现i<=j 的时候 num[i] > pivot && nums[j] < pivot
            ListNode temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        //最后将pivot和nums[j]互换位置
        nums[left] = nums[j];
        nums[j] = pivot;

        return j;
    }
}
