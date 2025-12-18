import java.util.*;
import java.io.*;

public class Main {

    public static class Node {
        int next;
        int p;
        int q;

        public Node(int next, int p, int q) {
            this.next = next;
            this.p = p;
            this.q = q;
        }
    }

    private static long[] result;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Node>[] nodes = new ArrayList[n];
        result = new long[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<>();
        }

        long latestLcm = 1;
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            nodes[a].add(new Node(b, y, x));
            nodes[b].add(new Node(a, x, y));
            // 1. 비율을 기약분수로 변환하여 최소한의 필요한 배수를 계산
            long g = calculateGcd(x, y);
            // 2. 두 수의 곱을 단순히 LCM하는 것이 아니라, 
            // 현재 LCM에 이 비율이 필요로 하는 최소 정수배를 반영
            latestLcm *= (x / g) * (y / g);
        }

        result[0] = latestLcm;
        dfs(0, nodes);

        long totalGcd = result[0];
        for (int i = 1; i < n; i++) {
            totalGcd = calculateGcd(totalGcd, result[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] /= totalGcd;
        }

        StringBuilder sb = new StringBuilder();
        for (Long val : result) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    private static long calculateGcd(long x, long y) {
        if (y == 0) return x;
        return calculateGcd(y, x % y);
    }

    private static void dfs(int cur, List<Node>[] nodes) {
        visited[cur] = true;

        List<Node> connectedNodes = nodes[cur];
        for (Node node : connectedNodes) {
            if (!visited[node.next]) {
                result[node.next] = result[cur] * node.p / node.q ;
                dfs(node.next, nodes);
            }
        }
    }
}
