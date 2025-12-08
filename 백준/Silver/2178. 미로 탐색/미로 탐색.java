import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int m;
    static int[][] a;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            for (int j = 1; j <= m; j++) {
                a[i][j] = input.charAt(j - 1) - '0';
            }
        }

        int min = bfs(1, 1);
        System.out.println(min);
    }

    private static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{startX, startY});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x >= n && y >= m) {
                return a[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 1 || nx > n || ny < 1 || ny > m) {
                    continue;
                }

                if (a[nx][ny] == 1) {
                    a[nx][ny] = a[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }
}
