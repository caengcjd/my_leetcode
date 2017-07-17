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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        //层次遍历二叉树么,这么简单，层次划分开来即可
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode str=root;
        int count=1;
        int next_wide=0;
        List<Integer>  tmp=new ArrayList<Integer>();
        
        while(queue.size()>0){
            str=queue.poll();
            tmp.add(str.val);
            if(str.left!=null){queue.offer(str.left);next_wide++;}
            if(str.right!=null){queue.offer(str.right);next_wide++;}
            if((--count)==0){
            result.add(new ArrayList(tmp));
            tmp.clear();
            count=next_wide;
            next_wide=0;
            }
           
        }
        
        return result;
        
        
    }
}
