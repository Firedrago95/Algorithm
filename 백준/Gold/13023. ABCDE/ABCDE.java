import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static List<Integer>[] arr;
    static boolean[] visited;
    static int n, m;
    static boolean arrived;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arrived = false;

        arr = new List[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrived) {
                break;
            }
        }
        
        if (arrived) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void dfs(int i, int depth) {
        if (depth == 5 || arrived) {
            arrived = true;
            return;
        }

        visited[i] = true;

        for (Integer n : arr[i]) {
            if(!visited[n]) {
                dfs(n, depth + 1);
            }
        }
        visited[i] = false;
    }
}
