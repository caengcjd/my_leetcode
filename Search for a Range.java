public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int size=nums.length;
        int left=0;
        int[] ret = {-1, -1};
        int right=size-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                ret[0]=mid;right=mid-1;left=0;
            }
        }
        
        left=0; right=size-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                ret[1]=mid;left=mid+1;right=size-1;
            }
        }
        
        return ret;
        
    }
}
