import java.util.*;
class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return backTracking(dungeons, visited, k, 0);
    }
    
    public int backTracking(
        int[][] dungeons,
        boolean[] visited, 
        int currentFatigue, 
        int count
    ) {
        int maxCount = count;
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && currentFatigue >= dungeons[i][0]) {
                visited[i] = true;
                maxCount = Math.max(maxCount, backTracking(dungeons, visited, currentFatigue - dungeons[i][1], count + 1));
                visited[i] = false;
            }
        }
        
        return maxCount;
    }
}