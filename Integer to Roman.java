public class Solution {
    
    public String intToRoman(int num) {
        if(num==0)return "";
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};    
        int value[]=    {1000,900,500,400, 100, 90,  50, 40,  10, 9, 5, 4, 1};   
        int i=0;
        String str="";
        while(num>0){
            int ch=num/value[i];
            if(ch>0){
                StringBuilder builder = new StringBuilder(symbol[i].length() * ch);  
                for(int j=0; j<ch; j++){  
                    builder.append(symbol[i]);  
                }  
                String dst = builder.toString();  
                str+=(dst);
                num=num%value[i];
            }
             i=(i+1)%13;
        }
        return str;
        
    }
}
