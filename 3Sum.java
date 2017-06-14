
import java.util.*; 
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> anss=new ArrayList();
        if(nums.length<3){return anss;}
        int max=0;
        int m=nums.length;
        HashSet<List> va = new HashSet<List>();  
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
              int[] left=(Arrays.copyOfRange(nums, j+1, m));
              Arrays.sort(left);
              int ok=Arrays.binarySearch(left,0-nums[i]-nums[j]);
              //if(nums[i]==-4&&nums[j]==3){ anss.add(new ArrayList<Integer>(){{add(-4);add(3);add(ok);}});}
              if(ok>=0){
                 List<Integer> ans=new ArrayList<Integer>();
                 ans.add(nums[i]);ans.add(nums[j]); ans.add(0-nums[i]-nums[j]);
                 Collections.sort(ans);
                 if(!va.contains(ans)){
                 va.add(ans);
                 anss.add(ans);
                 } 
                 
              }
        }
        }
        return anss;
    }
}
