public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        if(strs.length==1)return strs[0];
        //String mm=strs.substring(0,1);
        String ans="";
        int j=0;
        boolean flag=true;
        while(flag){
            if(j==strs[0].length())break;
            Character m=strs[0].charAt(j);
            for(int i=0;i<strs.length;i++){
                if(j==strs[i].length()){
                    flag=false;break;
                }
                Character s=strs[i].charAt(j);
                if(m!=s){
                   flag=false;break;
                }
            }
            if(flag)ans+=Character.toString(m);
            j++;
        }
        return ans;
    }
}
