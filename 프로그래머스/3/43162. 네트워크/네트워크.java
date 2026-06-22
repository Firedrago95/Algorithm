import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int networkCount = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);
                networkCount++;
            }
        }
        return networkCount;
    }
    
    public void dfs (int[][] computers, boolean[] visited, int i) {
        visited[i] = true;
        
        for (int j = 0; j < computers[i].length; j++) {
            if (i != j && !visited[j] && computers[i][j] == 1) {
                dfs(computers, visited, j);
            }
        }
    }
}