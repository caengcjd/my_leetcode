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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list= new ArrayList<Integer>();
        if(root==null) return  list;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        TreeNode pre=null;
        TreeNode cur=null;
        
        while(!stack.isEmpty()){
            
            TreeNode  tmp= stack.peek();
            //list.add(tmp.val);
            if((tmp.left==null&&tmp.right==null)||(pre!=null&&(tmp.right==pre||pre==tmp.left))){
                list.add(tmp.val);
                stack.pop();
                pre=tmp;
            }else{
            if(tmp.right!=null){
                stack.push(tmp.right);
            }
            if(tmp.left!=null){
                stack.push(tmp.left);
            }
            }
        }
        
        return list;
    }
}
