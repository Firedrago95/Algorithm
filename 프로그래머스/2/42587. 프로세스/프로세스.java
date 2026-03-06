import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> q = new ArrayDeque<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            q.add(new int[]{priorities[i], i});
            pq.add(priorities[i]);
        }
        int count = 0;
        while (true) {
            if (q.peek()[0] < pq.peek()) {
                q.add(q.poll());
            } else {
                count++;
                int[] poll = q.poll();
                pq.poll();
                if (poll[1] == location) {
                    return count;
                }
            }
        }
    }
}