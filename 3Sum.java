public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> anss=new ArrayList();
        if(nums.length<3){return anss;}
        
        Arrays.sort(nums);
        int k=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1;
            int right=k;
            //HashSet<List> va = new HashSet<List>();
            while(j<right){
                int left=0-nums[i]-nums[j];
                if(left<nums[right]){
                    right--;
                }else if(left==nums[right]){
            
                     List<Integer> ans=new ArrayList<Integer>();
                     ans.add(nums[i]); ans.add(nums[j]); ans.add(nums[right]);
                     anss.add(ans);
                     right--;
                     j++;
                     while(j<right&&nums[j]==nums[j-1])j++;
                     while(j<right&&nums[right]==nums[right+1])right--;
                }else{
                    j++;
                }
            }
        }//for 
        return anss;
        
    }
}
