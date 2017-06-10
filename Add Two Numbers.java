/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

         ListNode   p=null,ans=null;int q=0;
         while((l1!=null||l2!=null)||q!=0){
             ListNode newNode= new ListNode(0);
             if(l1==null&&l2==null) {ListNode newNodes= new ListNode(q);newNodes.next=null;p.next=newNodes;p=p.next;break;}
             
             if(l1!=null && l2 !=null){
                newNode.val=l1.val+l2.val+q;q=0;
             }else if(l1!=null){
                newNode.val=l1.val+q;q=0;
             }else {
                newNode.val=l2.val+q;q=0;
             }
             if(newNode.val>=10){newNode.val=newNode.val-10;q=1;}
             if(l1 != null)l1=l1.next;
             if(l2 != null)l2=l2.next;
             if(ans == null){ans=newNode;p=ans;}
             else {p.next=newNode;p=p.next;}
         }
         return ans;
    }
}
