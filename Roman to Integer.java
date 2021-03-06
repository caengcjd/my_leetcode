public class Solution {
    public int romanToInt(String s) {
        
        if(s.length()==0)return 0;
        HashMap<Character,Integer>  map= new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res=map.get(s.charAt(0));
        int ch=map.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(i))>ch){
                res=(res-ch*2+map.get(s.charAt(i)));
            }
            else
                res+=map.get(s.charAt(i));
            ch=map.get(s.charAt(i));
        }
        return res;
    }
}
