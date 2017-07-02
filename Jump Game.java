数量少的时候:
public class Solution {
    public boolean flag=false;
    public boolean canJump(int[] nums) {
        //回溯法,有什么好说的额
        if(nums.length==0)return false;
        boolean result=false;
        getResult(nums,0);
        return flag;
    }
    
    private void getResult(int nums[], int target){
        if(target==nums.length-1){ flag=true; return ; }
        else if(target<(nums.length-1)){
              for(int i=1;i<=nums[target];i++){
                  getResult(nums,target+i);
              }
        }if(target>nums.length-1){
              //
        }
    }   
}

//数量级别一多就不行了额
