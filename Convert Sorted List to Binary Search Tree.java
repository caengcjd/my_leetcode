/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null) return null;
        //对二叉树进行层次遍历
        ListNode end=head;
        int length=0;
        while(end!=null){
            end=end.next;
            length++;
        }
        ListNode  tmp=fetch(head,length/2);
        TreeNode  root=new TreeNode(tmp.val);
        TreeNode  result=func(head,0,length-1);//,root);
        return result;
        
        
    }
    public ListNode  fetch(ListNode head,int count){
        
        if(count==0) return head;
        ListNode ans=head;
        while((--count)>=0){
            ans=ans.next;
        }
        return ans;
        
    }
    
    public TreeNode func(ListNode head,int start,int end){//,TreeNode  root){
        
        if(start>end) return null;//剪支处理
        int mid=(start+end)/2;
        ListNode  middle=fetch(head,mid);
        TreeNode  root=new TreeNode(middle.val);
        root.left= func(head,start,mid-1);
        root.right=func(head,mid+1,end);
        return root;
        
    }
    
    
    
}// 时间复杂度略高，不可取了
