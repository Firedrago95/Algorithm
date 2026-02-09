import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static ArrayList<Integer>[] tree;
    static int[][] parent;
    static int[] depth;
    static int K, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = 0;
        for (int i = 1; i <= N; i *= 2) {
            K++;
        }

        tree = new ArrayList[N + 1];
        depth = new int[N + 1];
        parent = new int[K][N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        bfs(1);
        fillParents();

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int lca = findLca(a, b);
            sb.append(lca).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        depth[node] = 1;

        while(!queue.isEmpty()) {
            int now_node = queue.poll();
            for (int next : tree[now_node]) {
                if (depth[next] == 0) {
                    depth[next] = depth[now_node] + 1;
                    parent[0][next] = now_node;
                    queue.add(next);
                }
            }
        }
    }

    private static void fillParents() {
        for (int k = 1; k < K; k++) {
            for (int node = 1; node <= N; node++) {
                if (parent[k - 1][node] != 0) {
                    parent[k][node] = parent[k - 1][parent[k - 1][node]];
                }
            }
        }
    }

    private static int findLca(int a, int b) {
       if (depth[a] < depth[b]) {
           int tmp = a;
           a = b;
           b = tmp;
       }
       
       for (int k = K - 1; k >= 0; k--) {
           if (Math.pow(2, k) <= depth[a] - depth[b]) {
               a = parent[k][a];
           }
       }
       
       if (a == b) return a;
       
       for (int k = K - 1; k >= 0; k--) {
           if (parent[k][a] != parent[k][b]) {
               a = parent[k][a];
               b = parent[k][b];
           }
       }
       
       return parent[0][a];
    }


}
