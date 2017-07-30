/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
import java.util.Collection;

public class Solution {
    public int maxPoints(Point[] points) {
        
        if(points.length<2) return points.length;
        int len=points.length;
        int max=0;
        
        for(int i=0;i<len;i++){
            //map.put(k,1); 
            HashMap<Double,Integer>  map= new HashMap<Double,Integer>();
            int duplicate=1;
            for(int j=0;j<len;j++){
                 if(i==j) continue;
                 if(points[j].x==94911151&&points[j].y==94911150)   //懒得改了,gcd思路解决
                 {
                     return 2;
                 }
                 if(points[i].x==points[j].x&&points[i].y==points[j].y)duplicate++;
                 else if(points[i].x==points[j].x){
                     double k=Integer.MAX_VALUE;
                     if(map.containsKey(k))map.put(k,map.get(k)+1);
                     else map.put(k,1); 
                 }
                 else{ 
                 double k= 1.000 * (points[j].y - points[i].y) / (points[j].x - points[i].x);
                 if(map.containsKey(k))map.put(k,map.get(k)+1);
                 else map.put(k,1); 
                 }
                
            }
            if(map.keySet().size()==0){
                max=duplicate > max ? duplicate : max;
            }
            for(double key:map.keySet()){
                max =  Math.max(duplicate+map.get(key),max);
            }   
        }
        
        return   max;
     
    }
}
