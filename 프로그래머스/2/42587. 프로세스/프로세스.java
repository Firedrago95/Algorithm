import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(new int[]{priorities[i], i});
            pq.add(priorities[i]);
        }
        
        int count = 0;
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            
            if (poll[0] == pq.peek()) {
                count++;
                pq.poll();
                if (poll[1] == location) return count;
            } else {
                q.add(poll);
            }
        }
        return count;
    }
}