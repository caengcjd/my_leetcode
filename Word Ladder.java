class Solution {
    
    public  boolean  is_match(String word,String temp){
         
        boolean flag=true;
        char[] chs = word.toCharArray();
		for (int i = 0; i < chs.length; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
					char old = chs[i];
					chs[i] = c;
                    String target=String.valueOf(chs);
                    if(target.equals(temp)){
                        return true;
                    }
                                        
            }
        }
        return flag;
    }
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        //to do the list,bfs
        
        Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>();
        int len = 1;
        int strLen = beginWord.length();
        HashSet<String> visited = new HashSet<String>();

        beginSet.add(beginWord);
        endSet.add(endWord);
        
        //bfs algorithm,achieve my solution first!!
        while(!beginSet.isEmpty()&&!endSet.isEmpty()){
            
            Set<String> temp = new HashSet<String>();
            for(String word:wordList){
                //is_match
                if(is_match(beginWord,word)){
                    
                    if(!visited.contains(word)&&endSet.contains(word)){
                        temp.add(word);
                        visited.add(word);
                        beginWord=word;
                        return  len+1;

                    }else if(visited.contains(word)){
                        
                        continue;
                        

                    }else if(!visited.contains(word)&&!endSet.contains(word)){

                        temp.add(word);
                        visited.add(word);
                        beginWord=word;
                        len++;

                    }
                }else{
                    //return 3;
                    continue;
                }
            }//for
            beginSet=temp;
       
        }//while
        return 0;
        
    }
}
