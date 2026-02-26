import java.util.*;

class Solution {
    public long solution(int n, int[] times) { 
        long min = 1;
        long max = 0;
        for (int time : times) {
            max = Math.max(max, time);
        }
        max *= n;
        
        long result = Long.MAX_VALUE;
        
        while (min <= max) {
            long mid = min + ((max - min) / 2);
            long possible = 0;
            for (int time : times) {
                possible += mid / time;
            }
            
            if (possible < n) {
                min = mid + 1;
            } else {
                result = Math.min(result, mid);
                max = mid - 1;
            }
        }
        
        return result;
    }
}