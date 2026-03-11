import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long min = 1;
        long max = 0;
        for (int time : times) {
            max = Math.max(max, time);
        }
        max *= n;
        
        while (min <= max) {
            long mid = min + (max - min) / 2;
            long possible = 0;
            
            for (int time : times) {
                possible += mid / time;
                if (possible >= n) break;
            }
            
            if (possible < n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }
}