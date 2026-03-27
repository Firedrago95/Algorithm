import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int j = yellow / i;
                
                if (i * 2 + j * 2 + 4 == brown) {
                    return new int[] {j + 2, i + 2};
                }
            }
        }
        return null;
    }
}