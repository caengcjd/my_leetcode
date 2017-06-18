/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||(head.next==null)) return head;
        int count=0;
        //先替换前两个
        ListNode prior=head.next;
        ListNode h=head.next,p=head.next.next;
        head.next=p;
        prior.next=head;
        prior=prior.next;
        //后续有规律
        while(p!=null&&p.next!=null){
            prior.next=p.next;
            p.next=p.next.next;
            prior.next.next=p;
            prior=p;
            p=p.next;
            count++;
        }
        return h;
    }
}
