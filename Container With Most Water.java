暴力枚举法:
    public class Solution {
    public int maxArea(int[] height) {
        if(height.length<2){return 0;}
        int max=0;
        int m=height.length;
        for(int i=0;i<m;i++)
            for(int j=i+1;j<m;j++){
              int current=(j-i)*Math.min(height[i],height[j]);
              if(current>max){
                  max=current;
              }
        }
        return max;
    }
}

左右游标法：

public class Solution {
    public int maxArea(int[] height) {
        if(height.length<2){return 0;}
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left!=right){
            if(height[left]<height[right]){
                int area=height[left]*(right-left);
                max=Math.max(area,max);
                left++;
            }else{
                int area=height[right]*(right-left);
                max=Math.max(area,max);
                right--;
            }
        }
        return max;
    }
}
