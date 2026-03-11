import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102];
        
        for (int[] r : rectangle) {
            int x1 = r[0] * 2, y1 = r[1] * 2;
            int x2 = r[2] * 2, y2 = r[3] * 2;
            
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (i > x1 && i < x2 && y1 < j && j < y2) {
                        map[i][j] = 2;
                    } else if (map[i][j] != 2) {
                        map[i][j] = 1;
                    }
                }
            }
        }
        int[] dx = new int[] {1,0,-1,0};
        int[] dy = new int[] {0,1,0,-1};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[102][102];
        q.add(new int[]{characterX * 2, characterY * 2, 0});
        visited[characterX * 2][characterY * 2] = true;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            int d = current[2];
            
            if (cx == itemX * 2 && cy == itemY * 2) return d / 2;
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102 && map[nx][ny] == 1 && !visited[nx][ny]) {
                    q.add(new int[]{nx, ny, d + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return 0;
    }
}