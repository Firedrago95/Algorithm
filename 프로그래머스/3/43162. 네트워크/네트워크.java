import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int totalNetworks = 0;
        boolean[] visited = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (!visited[j]) {
                    dfs(computers, visited, j);
                    totalNetworks++;
                }
            }
        }
        return totalNetworks;
    }
    
    public void dfs (int[][] computers, boolean[] visited, int current) {
        visited[current] = true;
        
        for (int i = 0; i < computers[current].length; i++) {
            if (i != current && !visited[i] && computers[current][i] == 1) {
                dfs(computers, visited, i);
            }
        }
    }
}