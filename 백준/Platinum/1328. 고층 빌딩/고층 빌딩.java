import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        long[][][] dp =new long[101][101][101];
        dp[1][1][1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= l; j++) {
                for (int k = 1; k <= r; k++) {
                    dp[i][j][k] = (dp[i - 1][j -1][k] + dp[i - 1][j][k - 1] + (dp[i - 1][j][k] * (i - 2))) % MOD;
                }
            }
        }

        System.out.println(dp[n][l][r] % MOD);
    }
}
