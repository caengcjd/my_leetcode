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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        //用栈的思路来解决这个问题
        
        List<Integer> list= new ArrayList<Integer>();
        if(root==null) return  list;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            TreeNode  tmp= stack.pop();
            list.add(tmp.val);
            if(tmp.right!=null){
                stack.push(tmp.right);
            }
            if(tmp.left!=null){
                stack.push(tmp.left);
            }
        }
        
        return list;
        
    }
}
