import java.util.*;
class Solution {
    boolean[][] visited;
    int[] dv = new int[]{0,1,0,-1,0};
    int n,m;
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];
        
        Deque<int[]> q = new ArrayDeque<>();
        
        q.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];
            int d = poll[2];
            
            if (x == n - 1 && y == m - 1) {
                return d;
            }
            
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dv[i];
                int ny = y + dv[i + 1];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && 
                    !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, d + 1});
                }
            }
        }
        return -1;
    }
}