import java.util.*;
class Solution {
    public int solution(String name) {
        int n = name.length();
        int upDown = 0;
        int leftRight = n - 1;
        
        for (int i = 0; i < n; i++) {
            upDown += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            int next = i + 1;
            while(next < n && name.charAt(next) == 'A') next++;
            
            leftRight = Math.min(leftRight, (i * 2) + n - next);
            leftRight = Math.min(leftRight, i + (n - next) * 2);
        }
        
        return upDown + leftRight;
    }
}