import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        a[0] = Integer.parseInt(st.nextToken());
        dp[0] = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(a[i], dp[i - 1] + a[i]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
