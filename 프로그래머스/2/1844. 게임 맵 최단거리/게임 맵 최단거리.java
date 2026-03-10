import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};
        
        boolean[][] visited = new boolean[n][m];
        
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,1});
        visited[0][0] = true;
        while(!q.isEmpty()) {
            int[] poll = q.poll();
            
            int x = poll[0];
            int y = poll[1];
            int d = poll[2];
            
            if (x == n -1 && y == m - 1) return d;
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    q.add(new int[]{nx, ny, d + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}