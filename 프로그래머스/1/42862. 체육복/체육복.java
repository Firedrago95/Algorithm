import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] count = new int[n+1];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int l : lost) count[l]++;
        for (int r : reserve) count[r]--;
        
        for (int r : reserve) {
            if(count[r] == -1) {
                if (r > 1 && count[r - 1] == 1) {
                    count[r - 1]--;
                    count[r] = 0;
                }
                else if (r < n && count[r + 1] == 1) {
                    count[r + 1]--;
                    count[r] = 0;
                }
            }
        }
        
        int result = 0;
        for (int c : count) {
            if (c > 0) result++;
        }
        return n - result;
    }
}