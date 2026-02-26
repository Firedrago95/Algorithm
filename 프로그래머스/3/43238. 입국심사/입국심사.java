import java.util.*;

class Solution {
    public long solution(int n, int[] times) { 
        Arrays.sort(times);
        long min = 1;
        long max = (long) n * times[times.length - 1];
        
        while (min < max) {
            long mid = min + ((max - min) / 2);
            long possible = 0;
            for (int time : times) {
                possible += mid / time;
            }
            
            if (possible < n) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        
        return min;
    }
}