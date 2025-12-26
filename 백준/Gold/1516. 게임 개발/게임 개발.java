import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static List<List<Integer>> adj;
    static int[] indegree;
    static int[] time;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());

        indegree = new int[N + 1];
        time = new int[N + 1];
        result = new int[N + 1];

        adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            while (v != -1) {
                adj.get(v).add(i);
                indegree[i]++;
                v = Integer.parseInt(st.nextToken());
            }
        }

        sort();

        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }

    private static void sort() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                result[i] = time[i];
            }
        }

        while (!queue.isEmpty()) {
            Integer now = queue.poll();
            for (int next : adj.get(now)) {
                result[next] = Math.max(result[next], result[now] + time[next]);
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.add(next);
                }
            }
        }
    }
}
