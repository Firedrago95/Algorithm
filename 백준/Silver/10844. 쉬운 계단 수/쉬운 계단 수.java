import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n+1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][1] % MOD;
            dp[i][9] = dp[i-1][8] % MOD;
            for (int j = 1; j < 9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
            }
        }

        long result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[n][i]) % MOD;
        }
        System.out.println(result);
    }
}
