/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    
    public class MyComparator implements Comparator<Interval> {  
        @Override  
        public int compare(Interval a, Interval b) {  
            return a.start - b.start;  
        }  
    }  
    public List<Interval> merge(List<Interval> intervals) {
        
        List<Interval>  result =new ArrayList<Interval>();
        if(intervals.size()==0) return  result;
       
        Collections.sort(intervals, new MyComparator());
        
        for(Interval aa : intervals) {
           if(result.size()==0) {result.add(aa);continue;}
           Interval  middle=result.get(result.size()-1);
           if(middle.end>=aa.start){
               result.remove(result.size()-1);
               result.add(new Interval(middle.start,Math.max(aa.end,middle.end)));
           }else{
               result.add(aa);
           } 
        }
   
        
        
        
        return result;
        
    }
}
