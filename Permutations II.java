public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         //DFS 算法设计
         List<List<Integer>> list = new ArrayList<>();
         Arrays.sort(nums);
         boolean[] used = new boolean[nums.length];
         backtrack(list, new ArrayList<>(), nums, used);
         return list;
    }
    
    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums,boolean [] used){
        if(tempList.size()==nums.length){  list.add(new ArrayList(tempList)); return; }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false)continue;
            used[i]=true;
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,used);
            used[i]=false;
            tempList.remove(tempList.size()-1);
        }
    }
        
}
