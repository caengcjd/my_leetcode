/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        //翻转链表既可以了的
        if(head==null||k==0)return head;
        ListNode  p=head,q=head;
        int count=0; int num=1;
        
        while(q.next!=null){
            num++;
            q=q.next;
        }
        if(k>num){
            k=k%num;
        }
        
        if(num==1||k==0) return  head;
        
        while(p!=null){
            count++;
            if(count==num-k)break;
            p=p.next;
        }
        
        if(p==null) return head;
        ListNode m=p.next;
        p.next=null;
        q.next=head;
        
        return m;
        
        
    }
}
