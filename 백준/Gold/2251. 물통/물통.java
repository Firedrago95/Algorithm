import java.util.*;
import java.io.*;

public class Main {

    static boolean[][] visited = new boolean[201][201];
    static boolean[] result = new boolean[201];
    static int[] capacity = new int[3];
    static int[] from = new int[] {0,0,1,1,2,2};
    static int[] to = new int[]{1,2,0,2,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        capacity[0] = Integer.parseInt(st.nextToken());
        capacity[1] = Integer.parseInt(st.nextToken());
        capacity[2] = Integer.parseInt(st.nextToken());

        bfs();

        for (int i = 0; i < result.length; i++) {
            if (result[i]) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static void bfs() {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0,0});
        visited[0][0] = true;

        while (!que.isEmpty()) {
            int[] current = que.poll();
            int a = current[0];
            int b = current[1];
            int c = capacity[2] - a - b;
            int[] temp = {a, b, c};

            if (a == 0) result[c] = true;

            for (int i = 0; i < 6; i++) {
                int f = from[i];
                int t = to[i];
                int[] copied = temp.clone();

                int move = Math.min(copied[f], capacity[t] - copied[t]);
                copied[f] -= move;
                copied[t] += move;

                if (!visited[copied[0]][copied[1]]) {
                    visited[copied[0]][copied[1]] = true;
                    que.add(new int[]{copied[0], copied[1]});
                }
            }
        }
    }
}
