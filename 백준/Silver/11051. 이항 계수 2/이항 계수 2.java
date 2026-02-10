import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];

        System.out.println(combination(N, K));
    }

    private static int combination(int n, int k) {
        if (k == n || k == 0) return 1;
        if (dp[n][k] > 0) return dp[n][k];

        return dp[n][k] = (combination(n - 1, k - 1) + combination(n - 1, k)) % 10007;
    }
}
