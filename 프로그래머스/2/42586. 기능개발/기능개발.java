import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int p = 100 - progresses[i];
            int s = speeds[i];
            
           q.add((p + (s - 1)) / s);
        }
        
        List<Integer> l = new ArrayList<>();
        while (q.size() > 1) {
            int count = 0;
            int d = q.poll();
            count++;
            while (!q.isEmpty() && q.peek() <= d) {
                q.poll();
                count++;
            }
            l.add(count);
        }
        if (!q.isEmpty()) l.add(1);
        
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}