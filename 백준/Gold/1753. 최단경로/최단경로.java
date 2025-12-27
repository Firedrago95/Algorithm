import java.util.*;
import java.io.*;


public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static int V,E,K;
    static List<List<Node>> graph;
    static boolean[] visited;
    static int[] distance;
    static PriorityQueue<Node> queue;

    static class Node implements Comparable<Node> {
        int point;
        int distance;

        public Node(int point, int distance) {
            this.point = point;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            if (this.distance > o.distance) return 1;
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        visited = new boolean[V + 1];
        distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }

        queue = new PriorityQueue<>();
        queue.add(new Node(K, 0));
        distance[K] = 0;
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int c_point = current.point;
            if (visited[c_point]) continue;
            visited[c_point] = true;
            for (Node node : graph.get(c_point)) {
                int n_point = node.point;
                int n_distance = node.distance;
                if (distance[n_point] > distance[c_point] + n_distance) {
                    distance[n_point] = distance[c_point] + n_distance;
                    queue.add(new Node(n_point, distance[n_point]));
                }
            }
        }

        for (int i = 1; i <=V; i++) {
            if (visited[i]) {
                sb.append(distance[i]).append("\n");
            } else {
                sb.append("INF").append("\n");
            }
        }
        System.out.println(sb);
    }
}

