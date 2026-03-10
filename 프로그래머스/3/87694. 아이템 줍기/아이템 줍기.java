import java.util.*;
class Solution {
    int[][] map = new int[102][102];
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2;
            int x2 = rect[2] * 2, y2 = rect[3] * 2;
            
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (i > x1 && i < x2 && j > y1 && j < y2) {
                        map[i][j] = 2;
                    }
                    else if (map[i][j] != 2) {
                        map[i][j] = 1;
                    }
                }
            }
        }
        return bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2);
    }
    
    private int bfs(int startX, int startY, int targetX, int targetY) {
        int[] dx = new int[] {1,0,-1,0};
        int[] dy = new int[] {0,1,0,-1};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY, 0});
        
        boolean[][] visited = new boolean[102][102];
        
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            
            if (poll[0] == targetX && poll[1] == targetY) {
                return poll[2] / 2;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];
                
                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny, poll[2] + 1});
                    }
                }
            }
        }
        return 0;
    }
}