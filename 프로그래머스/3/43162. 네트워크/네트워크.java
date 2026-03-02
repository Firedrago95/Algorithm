class Solution {
    int count = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, computers, visited);
            }
        }
        return count;
    }

    public void dfs(int i, int[][] computers, boolean[] visited) {
        visited[i] = true;
        
        for (int j = 0; j < computers.length; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(j, computers, visited);
            }
        }
    }
}