import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N, M;
    static List<List<Integer>> adj;
    static int[] indegree;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        indegree = new int[N + 1];

        adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            adj.get(u).add(v);
            indegree[v]++;
        }

        solution();
    }

    private static void solution() {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            List<Integer> connectedNodes = adj.get(poll);
            result.add(poll);

            for (Integer connectedNode : connectedNodes) {
                indegree[connectedNode]--;
                if (indegree[connectedNode] == 0) {
                    queue.add(connectedNode);
                }
            }
        }

        for (Integer i : result) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
