public class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length==0) return -1;
        if(nums.length==1) return (nums[0]==target)?0:-1;
        int start = 0;
        int end  = nums.length -1 ;
        
        while(start <= end ){
            
            int mid = (start + end )/2;
            if( nums[mid] == target )  return mid; 
            
            if( nums[start] > nums[end] && nums[mid] <= nums[end] && nums[mid] < nums[start] ){
                
                if(nums[mid] > target ){
                 
                    end=mid-1;
                    
                }else if (nums[mid] < target && target >= nums[start]){
                    
                    end=mid-1;
                    
                }else if (nums[mid] < target && target <= nums[end]){
                    
                    start=mid+1;
                }else{
                    break;
                }
            }
            else if( nums[start] > nums[end] &&  nums[mid] > nums[end] && nums[mid] >= nums[start] ){
                
                if(nums[mid] < target ){
                    
                    start = mid+1 ;
                    
                }else if (nums[mid] > target && target >= nums[start]) {
                    
                    end = mid -1 ;
                   
                }else if (nums[mid] > target && target <= nums[end]){
                    
                    start = mid + 1 ;
                }else{
                    
                    break;
                }
            }
            else if ( nums[start] <= nums[end] && nums[mid] >= nums[start]  && nums[mid] <= nums[end] ){
                
                if(nums[mid] > target ){
                    
                    end = mid -1;
                    
                }else {
                    
                    start = mid + 1 ;
                }
                
            }
            
        }//while
        
        return -1;
        
        
        
    }
}
