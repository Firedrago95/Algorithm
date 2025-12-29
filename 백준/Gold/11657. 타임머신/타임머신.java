import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N,M;
    static List<Edge> edges;
    static long[] distance;

    static class Edge {
        int from;
        int to;
        long cost;

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        distance = new long[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            edges.add(new Edge(a, b, c));
        }

        distance[1] = 0;
        for (int i = 0; i < N-1; i++) {
            for (Edge edge : edges) {
                if (distance[edge.from] == Integer.MAX_VALUE) continue;
                if (distance[edge.to] > distance[edge.from] + edge.cost) {
                    distance[edge.to] = distance[edge.from] + edge.cost;
                }
            }
        }

        for (Edge edge : edges) {
            if (distance[edge.from] == Integer.MAX_VALUE) continue;
            if (distance[edge.to] > distance[edge.from] + edge.cost) {
                System.out.println("-1");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                sb.append("-1").append("\n");
                continue;
            }
            sb.append(distance[i]).append("\n");
        }

        System.out.println(sb);
    }
}
