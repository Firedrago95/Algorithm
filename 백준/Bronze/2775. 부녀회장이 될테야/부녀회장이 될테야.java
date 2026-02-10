import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static int[][] dp = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            
            System.out.println(combination(K, N));
        }
    }

    private static int combination(int k, int n) {
        if (k == 0) return n;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (dp[k][n] > 0) return dp[k][n];

        return dp[k][n] = combination(k - 1, n) + combination(k, n - 1);
    }
}
