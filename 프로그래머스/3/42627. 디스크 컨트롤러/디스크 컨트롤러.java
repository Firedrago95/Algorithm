import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]>pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        int jobIdx = 0;
        int time = 0;
        int totalWait = 0;
        
        while(jobIdx < jobs.length || !pq.isEmpty()) {
            while (jobIdx < jobs.length && jobs[jobIdx][0] <= time) {
                pq.add(jobs[jobIdx]);
                jobIdx++;
            }
            
            if (!pq.isEmpty()) {
                int[] work = pq.poll();
                totalWait += (time + work[1]) - work[0];
                time += work[1];
            } else {
                time = jobs[jobIdx][0];
            }
        }
        return totalWait / jobs.length;
    }
}