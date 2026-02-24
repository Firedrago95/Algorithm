import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> h = new PriorityQueue<>();
        
        for (int s : scoville) {
            h.add(s);
        }
        
        int count = 0;
        while (h.peek() < K) {
            if (h.size() < 2) return -1;
            int first = h.poll();
            int second = h.poll();
            h.add(first + (second * 2));
            count++;
        }
        return count;
    }
}