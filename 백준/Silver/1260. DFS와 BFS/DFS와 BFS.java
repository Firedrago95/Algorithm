import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<ArrayList<Integer>> a;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        a = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            a.get(s).add(e);
            a.get(e).add(s);
        }

        for (int i = 1; i <= n; i++) {
            // 핵심
            Collections.sort(a.get(i));
        }

        dfs(v);

        System.out.println(sb);

        // bfs
        visited = new boolean[n + 1];
        sb.setLength(0);

        bfs(v);

        System.out.println(sb);
    }

    private static void dfs(int num) {
        if (visited[num]) return;

        visited[num] = true;
        sb.append(num).append(" ");

        for (int next : a.get(num)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);
        sb.append(v).append(" ");

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();

            for (int next : a.get(poll)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    sb.append(next).append(" ");
                }
            }
        }
    }
}
