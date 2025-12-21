import java.util.*;
import java.io.*;

public class Main {

    static int[] visited;
    static List<Integer>[] graphs;
    static int K,V,E,u,v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            graphs = new ArrayList[V + 1];
            visited = new int[V + 1];
            for (int k = 0; k < graphs.length; k++) {
                graphs[k] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                u = Integer.parseInt(st.nextToken());
                v = Integer.parseInt(st.nextToken());
                graphs[u].add(v);
                graphs[v].add(u);
            }
            boolean isBipartite = true;
            for (int l = 1; l <= V; l++) {
                if (visited[l] == 0) {
                    if (!dfs(l, true)) {
                        isBipartite = false;
                        break;
                    }
                }
            }

            if (!isBipartite) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    private static boolean dfs(int current, boolean isRed) {
        if (visited[current] != 0) {
            if (isRed == true && visited[current] == -1) {
                return false;
            }
            if (isRed == false && visited[current] == 1) {
                return false;
            }
            return true;
        }

        if (isRed) {
            visited[current] = 1;
        } else {
            visited[current] = -1;
        }

        List<Integer> nodes = graphs[current];
        for (Integer node : nodes) {
            boolean result = dfs(node, !isRed);
            if (!result) {
                return false;
            }
        }
        return true;
    }
}
