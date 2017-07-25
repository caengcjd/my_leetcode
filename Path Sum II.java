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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>  result= new ArrayList<List<Integer>>();
        if(root==null) return  result;
        List<Integer> tmp = new ArrayList<Integer>();
        func(root,sum,tmp,result);
        return  result;
    }
    
     public  void func(TreeNode root,int value,List<Integer> tmp,List<List<Integer>> result){
          int left=value-root.val;
          if(left==0&&(root.left==null&&root.right==null)){ tmp.add(root.val);result.add(new ArrayList(tmp));tmp.remove(tmp.size()-1);return ;}
          else {
              if(root.left!=null){ tmp.add(root.val); func(root.left,left,tmp,result); tmp.remove(tmp.size()-1); }
              if(root.right!=null){ tmp.add(root.val); func(root.right,left,tmp,result); tmp.remove(tmp.size()-1);}
          }
        
    }
}


注意关键性的差别:
result.add(new ArrayList(tmp));
和
result.add(tmp);
