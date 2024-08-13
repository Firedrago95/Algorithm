import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final long MOD = 10007L;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[][] dp = new int[2][n + 1];

            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] result = new int[2][n + 1];
            result[0][1] = dp[0][1];
            result[1][1] = dp[1][1];
            for (int i = 2; i <= n; i++) {
                result[0][i] = Math.max(result[1][i - 1], result[1][i - 2]) + dp[0][i];
                result[1][i] = Math.max(result[0][i - 1], result[0][i - 2]) + dp[1][i];
            }

            System.out.println(Math.max(result[0][n], result[1][n]));
        }
    }
}
