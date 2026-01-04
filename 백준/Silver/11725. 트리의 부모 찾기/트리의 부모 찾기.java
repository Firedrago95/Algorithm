import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N;
    static ArrayList<Integer>[] tree;
    static int[] answer;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        answer = new int[N + 1];
        tree = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            tree[v].add(u);
            tree[u].add(v);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int number) {
        visited[number] = true;
        for (Integer i : tree[number]) {
            if (!visited[i]) {
                answer[i] = number;
                dfs(i);
            }
        }
    }
}
