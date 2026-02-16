import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static int[][] w;
    static int[][] dp;
    static final int INF = 17_000_000;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        w = new int[N][N];
        dp = new int[N][1 << N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                w[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.fill(dp[i], -1);
        }
        System.out.println(tsp(0, 1));
    }

    private static int tsp(int now, int visit) {
        if (visit == (1 << N) - 1) {
            return w[now][0] == 0 ? INF : w[now][0];
        }

        if (dp[now][visit] != -1) {
            return dp[now][visit];
        }

        dp[now][visit] = INF;

        for (int next = 0; next < N; next++) {
            if (w[now][next] != 0 && (visit & (1 << next)) == 0) {
                int cost = w[now][next] + tsp(next, visit | (1 << next));
                dp[now][visit] = Math.min(dp[now][visit], cost);
            }
        }
        return dp[now][visit];
    }
}
