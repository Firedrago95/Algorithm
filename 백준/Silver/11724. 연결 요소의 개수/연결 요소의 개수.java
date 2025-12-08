import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<ArrayList<Integer>> a;
    static boolean[] visited;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        a = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];
        
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a.get(u).add(v);
            a.get(v).add(u);
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }
    
    private static void dfs(int i) {
        visited[i] = true;
        
        for (int next : a.get(i)) {
            if (!visited[next]) {
                dfs(next);
            } 
        }
    }
}