public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int anss=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        if(nums.length<3){return anss;}
        
        Arrays.sort(nums);
        int k=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1;
            int right=k;
            while(j<right){
                int left=nums[i]+nums[j]+nums[right];
                if(Math.abs(target-left)<ans){
                    ans=Math.abs(target-left);
                    anss=left;
                }
                if(left<target){
                    j++;
                }else{
                    right--;
                }
               // while(j<right&&nums[j]==nums[j-1])j++;
            //    while(j<right&&nums[right]==nums[right-1])right--;
            }
        }//for 
        return anss;
        
    }
}
