import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final long MOD = 10007L;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n + 1][10];
        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;

        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][k]) % MOD;
                }
            }
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += dp[n][i] % MOD;
        }
        System.out.println(result % MOD);
    }
}
