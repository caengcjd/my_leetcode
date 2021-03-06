public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        //dfs 算法设计
         List<List<Integer>> list = new ArrayList<>();
         Arrays.sort(nums);
         backtrack(list, new ArrayList<>(), nums, 0);
         return list;
    }
    
    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        if(tempList.size()==nums.length){list.add(new ArrayList(tempList));}
        for(int i=0;i<nums.length;i++){
            if(tempList.contains(nums[i]))continue;
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i);
            tempList.remove(tempList.size()-1);
        }
    }
    
}
