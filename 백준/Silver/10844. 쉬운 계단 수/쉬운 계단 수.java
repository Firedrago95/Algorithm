import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static long[][] d;
    static long MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        d = new long[n + 1][10];

        for (int i = 1; i <= 9; i++) {
            d[1][i] = 1;
        }

        for (int i = 2; i <= n; i ++) {
            d[i][0] = d[i - 1][1] % MOD;
            d[i][9] = d[i - 1][8] % MOD;
            for (int j = 1; j <= 8; j++) {
                d[i][j] = (d[i - 1][j - 1] + d[i - 1][j + 1]) % MOD;
            }
        }
        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += (d[n][i] % MOD);
        }
        System.out.println(sum % MOD);
    }
}
