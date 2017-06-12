public class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
        if(x<0)return false;
        int rex=0;
        while(x>0){
            rex=rex*10+x%10;
            x=x/10;
        }
        return m==rex;
        
    }
}
