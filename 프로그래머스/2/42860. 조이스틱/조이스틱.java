import java.util.*;
class Solution {
    public int solution(String name) {
        int n = name.length();
        int upDown = 0;
        int rightLeft = n - 1;

        for (int i = 0; i < n; i++) {
            char c = name.charAt(i);
            upDown += Math.min(c - 'A', 'Z' - c + 1);
            
            int next = i + 1;
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            
            rightLeft = Math.min(rightLeft, i * 2 + (n - next));
            rightLeft = Math.min(rightLeft, (n - next) * 2 + i);
        }
        return upDown + rightLeft;
    }
}