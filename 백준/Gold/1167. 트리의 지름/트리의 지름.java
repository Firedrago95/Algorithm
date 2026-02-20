import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static List<Edge>[] adj;
    static boolean[] visited;
    static int[] distance;

    static class NodeInfo {
        int id, dist;
        NodeInfo(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                adj[s].add(new Edge(e, cost));
            }
        }

        NodeInfo nodeA = bfs(1);
        NodeInfo nodeB = bfs(nodeA.id);

        System.out.println(nodeB.dist);
    }

    private static NodeInfo bfs(int start) {
        visited = new boolean[N + 1];
        distance = new int[N + 1];

        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;

        int maxDist = 0;
        int maxNode = start;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (distance[now] > maxDist) {
                maxDist = distance[now];
                maxNode = now;
            }

            for (Edge edge : adj[now]) {
                if (!visited[edge.to]) {
                    visited[edge.to] = true;
                    distance[edge.to] = distance[now] + edge.value;
                    q.add(edge.to);
                }
            }
        }
        return new NodeInfo(maxNode, maxDist);
    }

    static class Edge {
        int to;
        int value;

        public Edge(int to, int value) {
            this.to = to;
            this.value = value;
        }
    }
}