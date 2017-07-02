public class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length==0) return 0;
        int result=0;
        int[]  local=new int[nums.length];
        int[]  global=new int[nums.length];
        local[0]=global[0]=nums[0];
        //动态规划去求解最好了
        int i;
        for(i=1;i<nums.length;i++){
            local[i]=Math.max(nums[i],local[i-1]+nums[i]);
            global[i]=Math.max(local[i],global[i-1]);
         
        }
        return global[nums.length-1];
        
    }
}
