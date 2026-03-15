import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            students[i] = 1;
        }
        
        for (int l : lost) {
            students[l]--;
        }
        
        for (int r : reserve) {
            students[r]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i > 1 && students[i - 1] == 0 && students[i] == 2) {
                students[i-1]++;
                students[i]--;
                continue;
            }
            if (i <= n - 1 && students[i + 1] == 0 && students[i] == 2) {
                students[i + 1]++;
                students[i]--;
            }
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] >= 1) count++;
        }
        return count;
    }
}