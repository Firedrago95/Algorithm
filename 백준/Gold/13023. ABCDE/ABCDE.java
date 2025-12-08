import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<ArrayList<Integer>> a;
    static boolean[] visited;
    static int exist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<>());
        }
        visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a.get(u).add(v);
            a.get(v).add(u);
        }
        
        exist = 0;
        for (int i = 0; i < n; i++) {
            visited[i] = true;
            dfs(i, 1);
            visited[i] = false;
        }

        System.out.println(exist);
    }

    public static void dfs(int current, int depth) {
        if (depth == 5) {
            exist = 1;
            return;
        }
        
        if (exist == 1) return;

        for (int next : a.get(current)) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next, depth + 1);
                visited[next] = false;
            }
        }
    }

}
