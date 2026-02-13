import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static char[] a;
    static char[] b;
    static long[][] dp;
    static List<Character> result;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        a = br.readLine().toCharArray();
        b = br.readLine().toCharArray();
        dp = new long[a.length + 1][b.length + 1];

        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        System.out.println(dp[a.length][b.length]);

        result = new ArrayList<>();
        getText(a.length, b.length);
        for (int i = result.size() - 1; i >= 0; i--) {
            sb.append(result.get(i));
        }
        System.out.println(sb);
    }

    private static void getText(int r, int c) {
        if (r == 0 || c == 0) return;

        if (a[r - 1] == b[c - 1]) {
            result.add(a[r-1]);
            getText(r - 1, c - 1);
        } else {
            if (dp[r - 1][c] > dp[r][c - 1]) {
                getText(r - 1, c);
            } else {
                getText(r, c - 1);
            }
        }
    }
}
