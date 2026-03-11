import java.util.*;
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        long min = 1;
        long max = distance;
        
        while (min <= max) {
            long mid = min + (max - min) / 2;
            long current = 0;
            long removedCount = 0;
            for (int rock : rocks) {
                if (rock - current < mid) {
                    removedCount++;
                } else {
                    current = rock;
                }
            }
            if (distance - current < mid) removedCount++;
        
            if (removedCount <= n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return (int) max;
    }
}