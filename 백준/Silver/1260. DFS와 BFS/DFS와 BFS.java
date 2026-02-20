import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int n,m,v;
    static List<Integer>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        arr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        dfs(v);
        sb.append("\n");
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);
    }

    private static void bfs(int v) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(v);

        while (!q.isEmpty()) {
            Integer poll = q.poll();
            sb.append(poll).append(' ');
            visited[poll] = true;
            for (Integer i : arr[poll]) {
                if (visited[i]) continue;

                visited[i] = true;
                q.add(i);
            }
        }
    }

    private static void dfs(int v) {
        if (visited[v]) return;

        visited[v] = true;
        sb.append(v).append(' ');

        for (Integer i : arr[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
