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
    public boolean hasPathSum(TreeNode root, int sum) {
         //DFS 算法可以解决哦
        if(root==null) return false;
        return func(root,sum);
        
    }
    
    public  boolean func(TreeNode root,int value){
        
          int left=value-root.val;
          //if(left<0){  return  false; }
          if(left==0&&(root.left==null&&root.right==null)){  return true; }
          else {
              
              if(root.left==null&&root.right==null) return false;
              if(root.left==null)  return func(root.right,left);
              if(root.right==null) return func(root.left,left);
              return func(root.left,left)||func(root.right,left);
          }
        
    }
    
    
}
