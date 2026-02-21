import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] a = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            a[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (a[i] == 0) continue;

            for (int j = i + i; j <= n; j = j + i) {
                a[j] = 0;
            }
        }

        for (int i : a) {
            if (i >= m && i > 0) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
