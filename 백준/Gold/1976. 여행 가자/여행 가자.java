import java.util.*;
import java.io.*;

public class Main {
    static int[] U;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        U = new int[N + 1];
        for (int i = 0; i < U.length; i++) {
            U[i] = i;
        }
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a == 1) {
                    union(i, j);
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int[] cities = new int[M+1];
        for (int i = 1; i <= M; i++) {
            cities[i] = Integer.parseInt(st.nextToken());
        }
        int start = findRoot(cities[1]);
        for (int i = 1; i <cities.length; i++) {
            if (findRoot(cities[i]) != start) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    private static void union(int a, int b) {
        int rootA = findRoot(a);
        int rootB = findRoot(b);

        if (rootA != rootB) {
            U[rootA] = rootB;
        }
    }
    private static int findRoot(int a) {
        if (U[a] == a) return a;
        U[a] = findRoot(U[a]);
        return U[a];
    }
}
