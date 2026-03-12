import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        int currentTime = 0;
        int jobIdx = 0;
        int totalWait = 0;
        int count = 0;
        
        while (count < jobs.length) {
            while (jobIdx < jobs.length && jobs[jobIdx][0] <= currentTime) {
                pq.add(jobs[jobIdx++]);
            }
            
            if (!pq.isEmpty()) {
                int[] poll = pq.poll();
                totalWait += currentTime + poll[1] - poll[0];
                currentTime += poll[1];
                count++;
            } else {
                currentTime = jobs[jobIdx][0];
            }
        }
        return totalWait / jobs.length;
    }
}