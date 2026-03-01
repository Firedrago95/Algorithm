import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] status = new int[n];
        
        for (int l : lost) status[l - 1]--;
        for (int r : reserve) status [r - 1]++;
        
        for (int i = 0; i < n; i++) {
            if (status[i] == -1) {
                if (i > 0 && status[i - 1] == 1) {
                    status[i]++;
                    status[i - 1]--;
                } else if (i < n - 1 && status[i + 1] == 1) {
                    status[i]++;
                    status[i + 1]--;
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (status[i] > -1) answer++; 
        }
        return answer;
    }
}