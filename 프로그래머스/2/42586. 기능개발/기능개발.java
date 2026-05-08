import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            
            int day = (100 - progress) / speed;
            if ((100 - progress) % speed != 0) day++; 
            q.addLast(day);
        }
        
        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int count = 1;
            int poll = q.pollFirst();
            
            while (!q.isEmpty()) {
                if (q.peekFirst() <= poll) {
                    count++;
                    q.pollFirst();
                } else {
                    break;
                }
            }
            result.add(count);
        }
        
        int[] f = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            f[i] = result.get(i);
        }
        return f;
    }
}