import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[10001];

        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        long[] dp = new long[10001];
        dp[1] = input[1];
        dp[2] = input[1] + input[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + input[i], dp[i - 3] + input[i - 1] + input[i]));
        }

        System.out.println(dp[n]);
    }
}
