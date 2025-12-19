import java.util.*;
import java.io.*;

public class Main {

    static int[] result;
    static boolean[] visited;
    static List<Integer>[] graphs;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        result = new int[N + 1];
        graphs = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graphs[B].add(A);
        }

        for (int i = 1; i <= N; i++) {
            int count = bfs(i);
            result[i] = count;
        }

        int max = -1;
        for (int i : result) {
            if (i > max) {
                max = i;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (result[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static int bfs(int i) {
        Arrays.fill(visited, false);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(i);
        visited[i] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            List<Integer> nodes = graphs[current];
            for (Integer node : nodes) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    count++;
                }
            }
        }
        return count;
    }
}
