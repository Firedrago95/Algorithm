import java.util.*;
class Solution {
    boolean[] visited;
    int count = 0;
    public int solution(int n, int[][] computers) {
        this.visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, computers);
                count++;
            }
        }
        return count;
    }
    
    public void dfs(int i, int[][] computers) {
        if (visited[i]) return;
        
        visited[i] = true;
        
        for (int j = 0; j < computers.length; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(j, computers);
            }
        }
    }
}