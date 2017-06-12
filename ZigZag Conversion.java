public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0||numRows==0)return "";
        int m=0;int index=0;
        StringBuilder[] ans=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            ans[i]=new StringBuilder(""); 
        }
        
        for(int i=0;i<s.length();i++){
            ans[m].append(s.charAt(i));
            if(m==numRows-1){index=-1;}
            if(m==0)index=1;
            m+=index;
        }
        String anws="";
        for(int i=0;i<numRows;i++){
            anws+=ans[i];
        }
        return anws;
    }
}
