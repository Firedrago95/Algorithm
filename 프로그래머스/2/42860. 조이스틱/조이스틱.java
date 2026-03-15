import java.util.*;
class Solution {
    public int solution(String name) {
        char[] names = name.toCharArray();
        int upDown = 0;
        int leftRight = names.length - 1;
        
        for (int i = 0; i < names.length; i++) {
            upDown += Math.min('Z' - names[i] + 1, names[i] - 'A');
            
            int index = i + 1;
            while (index < names.length && names[index] == 'A') index++;
            
            leftRight = Math.min(leftRight, i * 2 + (names.length - index));
            leftRight = Math.min(leftRight, (names.length - index) * 2 + i);
        }
        
        return upDown + leftRight;
    }
}