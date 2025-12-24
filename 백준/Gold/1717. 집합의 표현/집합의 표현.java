import java.util.*;
import java.io.*;

public class Main {

    static int[] U;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        U = new int[n + 1];
        for (int i = 0; i < U.length; i++) {
            U[i] = i;
        }

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());

            int cmd = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                if (findRoot(a) == findRoot(b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                union(a, b);
            }
        }
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
