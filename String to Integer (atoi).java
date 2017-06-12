public class Solution {
    
    public int get_result(String str){
        
        if(str.equals(""))return 0;
        int m=str.length();
        int index=1;
        int ans=0;
        int sign=1;
        if(str.charAt(0)==45)sign=-1;
        for(int i=m-1;i>=0;i--){
            if(i==0&&(str.charAt(i)==43|| str.charAt(i)==45)){index=(str.charAt(i)==45)?-1:1;}
            else if(57<str.charAt(i)||str.charAt(i)<48){ans=0;m=i;}
            else if (str.charAt(i)>=48&&str.charAt(i)<=57){
            int result=(str.charAt(i)-48)*(int)Math.pow(10,m-i-1)+ans;
            ans=result;
            if(ans<0&&sign>0) ans= Integer.MAX_VALUE;
            if(ans<0&&sign<0) ans=Integer.MIN_VALUE;
            }
        }
        //return ans;
        if(ans<0&&sign>0) return Integer.MAX_VALUE;
        if(ans<0&&sign<0) return Integer.MIN_VALUE;
        return index*ans;
        
        
    }
    
    public int myAtoi(String str) {
        if(str.equals(""))return 0;
        String strs="";
        if(str.startsWith(" ")){strs=str.split("\\s+")[1];}
        else{strs=str.split("\\s+")[0];}
        int ans=get_result(strs);
        
        return ans;
        
    }
}
