import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        int count = 0;
        int jobIndex = 0;
        int currentTime = 0;
        int totalWait = 0;
        
        while (count < jobs.length) {
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= currentTime) {
                pq.add(jobs[jobIndex++]);
            }
            
            if (!pq.isEmpty()) {
                int[] poll = pq.poll();
                totalWait += (currentTime + poll[1] - poll[0]);
                currentTime += poll[1];
                count++;
            } else {
                currentTime = jobs[jobIndex][0];
            }
        }
        return totalWait / jobs.length;
    }
}