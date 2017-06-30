public class Solution {
    public String countAndSay(int n) {
        //递归的思路求解:
        if(n==0) return  null;
        if(n==1) return "1";
        else{
            
            String ans=countAndSay(n-1);
            String result="";int i=0;int count=1;
            while(i<ans.length()){
                Character cur=ans.charAt(i);
                if((i+1)<ans.length()&&cur==ans.charAt(i+1)){
                    count++;i++;
                    continue;
                }
                if(count>1){result+=(Integer.toString(count)+Character.toString(ans.charAt(i-1)));count=1;}
                else{ result+=(Integer.toString(count)+Character.toString(cur));}
                i++;
            }
            return result;
            
        }
        
        
        
    }
}
