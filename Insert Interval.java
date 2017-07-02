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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        //前后都需要进行迭代求解
        List<Interval> result= new ArrayList<Interval>();
        if(intervals.size()==0){ result.add(newInterval); return result;}
        int index=0;
        for(Interval aa: intervals){
            if(aa.start>=newInterval.start){
                break;
            }
            index++;
        }
        intervals.add(index,newInterval);
        /*return intervals;*/
         
       
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
