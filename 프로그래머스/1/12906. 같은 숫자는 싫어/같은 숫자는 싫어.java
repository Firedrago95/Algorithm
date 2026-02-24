import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int n : arr) {
            if (!q.isEmpty() && q.peekLast() == n) continue;
            q.add(n);
        }
        
        int[] r = new int[q.size()];
        for (int i = 0; i < r.length; i++) {
            r[i] = q.pollFirst();
        }
        return r;
    }
}