public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null||strs.length==0) return new ArrayList<List<String>>();
        Map<String,List<String>>  my_hashmap= new HashMap<String,List<String>>();
        for(String aa:strs){
          
            char[]  array=aa.toCharArray();
            Arrays.sort(array); 
            String  mid=String.valueOf(array);
            if(my_hashmap.containsKey(mid)){//&&my_hashmap.get(mid).contains(aa)==false){
                my_hashmap.get(mid).add(aa);
            }else{
                List<String> start = new ArrayList<String>();
                start.add(aa);
                //List<List<String>>  ans = new ArrayList<List<String>>();
                //ans.add(start);
                my_hashmap.put(mid,start);
            }
        }
        return  new ArrayList<List<String>>(my_hashmap.values());
        /*
        List<List<String>> mylist= new ArrayList<List<String>>();
        Iterator iter=my_hashmap.entrySet().iterator();
          while (iter.hasNext()) {
              Map.Entry entry = (Map.Entry) iter.next();
              mylist.add(new ArrayList(entry.getValue()));
          }
          return  mylist;
          */
    }
}
