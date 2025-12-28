import java.util.*;
import java.io.*;


public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static int N,M;
    static List<List<Node>> graph;
    static boolean[] visited;
    static PriorityQueue<Node> q;
    static long[] result;

    static class Node implements Comparable<Node> {
        int position;
        long expense;

        public Node(int position, long expense) {
            this.position = position;
            this.expense = expense;
        }

        @Override
        public int compareTo(Node o) {
            if (this.expense > o.expense) return 1;
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];
        result = new long[N + 1];
        Arrays.fill(result, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int destination = Integer.parseInt(st.nextToken());
            int expense = Integer.parseInt(st.nextToken());
            graph.get(start).add(new Node(destination, expense));
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        q = new PriorityQueue<>();
        q.add(new Node(a, 0));
        result[a] = 0;
        while (!q.isEmpty()) {
            Node c = q.poll();
            int current = c.position;
            if (visited[current]) continue;
            visited[current] = true;
            for (Node node : graph.get(current)) {
                int n_p = node.position;
                long n_e = node.expense;
                if (result[n_p] > result[current] + n_e) {
                    result[n_p] = result[current] + n_e;
                    q.add(new Node(n_p, result[n_p]));
                }
            }
        }
        System.out.println(result[b]);
    }
}

