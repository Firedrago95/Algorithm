import java.util.*;
class Solution {
    boolean[] visited;
    int count = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        backTrack(dungeons, k, 0);
        
        return count;
    }
    
    public void backTrack(int[][] dungeons, int k, int depth) {
        count = Math.max(count, depth);
        
        if (depth == dungeons.length) return;
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                backTrack(dungeons, k - dungeons[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }
}