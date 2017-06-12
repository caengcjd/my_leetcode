public class Solution {
    
    public boolean isMatch(Character a,Character b){
        if((a=='{'&&b=='}')||(a=='('&&b==')')||(a=='['&&b==']'))return true;
        return false;
        
    }
    public boolean isValid(String s) {
        
          if(s.length()==0)return false;
          int m=s.length();
          HashSet<Character> set_k= new HashSet<Character>();
          set_k.add('{');set_k.add('(');set_k.add('[');
          Stack<Character> stack = new Stack<Character>();
          for (int i=0;i<m;i++){
              if(set_k.contains(s.charAt(i))){
                  stack.push(s.charAt(i));
              }else{
                  if(!isMatch(stack.empty()?' ':stack.pop(),s.charAt(i))) return false;
              }
          }
          if(stack.empty())return true;
          else return false;
 
        
        
        
    }
}
