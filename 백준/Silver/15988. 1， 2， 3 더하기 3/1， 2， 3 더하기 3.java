import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int MOD = 1000000009;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= 1000000; i++) {
            dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % MOD;
        }

        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(dp[k]);
        }
    }
}
