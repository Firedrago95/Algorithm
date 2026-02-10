import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static long[][] dp = new long[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(combination(M ,N));
        }
    }

    private static long combination(int m, int n) {
        if (m == n) return 1;
        if (n == 1) return m;

        if (dp[m][n] > 0) return dp[m][n];

        return dp[m][n] = combination(m - 1, n - 1) + combination(m - 1, n);
    }
}
