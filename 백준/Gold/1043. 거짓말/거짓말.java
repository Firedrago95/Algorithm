import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int result = 0;
    static int[] mans;
    static List<Integer>[] parties;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parties = new ArrayList[M];
        for (int i = 0; i < M; i++) {
            parties[i] = new ArrayList<>();
        }

        mans = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            mans[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 0; i < k; i++) {
            int knowMan = Integer.parseInt(st.nextToken());
            mans[knowMan] = 0;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            List<Integer> party = parties[i];
            int first = -1;
            for (int j = 0; j < c; j++) {
                int p = Integer.parseInt(st.nextToken());
                if (first == -1) first = p;
                party.add(p);
                union(first, p);
            }
        }

        for (List<Integer> party : parties) {
            boolean isSafe = true;
            for (Integer p : party) {
                if (findRoot(p) == 0) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) result++;
        }
        System.out.println(result);
    }

    private static int findRoot(Integer p) {
        if (mans[p] == p) return p;

        mans[p] = findRoot(mans[p]);

        return mans[p];
    }

    private static void union(int a, int b) {
        int rootA = findRoot(a);
        int rootB = findRoot(b);

        if (rootA == 0 || rootB == 0) {
            mans[rootB] = 0;
            mans[rootA] = 0;
            return;
        }
        if (rootA != rootB) {
            mans[rootA] = rootB;
        }
    }
}
