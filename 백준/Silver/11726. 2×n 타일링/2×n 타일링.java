import java.io.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int MOD = 10007;;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[10001];

        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        System.out.println(dp[n]);
    }
}
