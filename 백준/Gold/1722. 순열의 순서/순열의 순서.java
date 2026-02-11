import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static long[] f = new long[21];
    static int[] s = new int[21];
    static boolean[] visited = new boolean[21];

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());
        f[0] = 1;
        for (int i = 1; i <= N; i++) {
            f[i] = f[i - 1] * i;
        }
        if (q == 1) {
            long k = Long.parseLong(st.nextToken());

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (visited[j]) continue;
                    long cnt = f[N - i];
                    if (k <= cnt) {
                        sb.append(j).append(" ");
                        visited[j] = true;
                        break;
                    } else {
                        k -= cnt;
                    }
                }
            }
            System.out.println(sb);
        } else {
            long ans = 1;

            for (int i = 1; i <= N; i++) {
                int num = Integer.parseInt(st.nextToken());

                for (int j = 1; j < num; j++) {
                    if (!visited[j]) {
                        ans += f[N - i];
                    }
                }
                visited[num] = true;
            }
            System.out.println(ans);
        }
    }
}
