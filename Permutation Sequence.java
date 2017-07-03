import java.util.LinkedList;
public class Solution {
    
    
    public int multiple(int n){
        
        int sum = 1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    
    public String getPermutation(int n, int k) {
        
            
        LinkedList<Character>  my_link= new LinkedList<Character>();
        
        for (char i= '1' ; i<='0'+ n ;i++){
            my_link.add(i);
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        int sum=1;
        
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        
        int j = n;
        k--;
        while(j>0){
            
            int index = k/multiple(j-1);
            k = k % multiple(j-1) ;
            sb.append(my_link.get(index));
            my_link.remove(index);
            j--;
        
        }
        
        
        return  sb.toString();
        
        
    }
}
