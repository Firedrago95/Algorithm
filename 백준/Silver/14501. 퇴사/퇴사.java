import java.util.*;
    import java.io.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] times;
    static int[] profits;
    static int[] d;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        times = new int[n + 2];
        profits = new int[n + 2];
        d = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            times[i] = Integer.parseInt(st.nextToken());
            profits[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n; i > 0; i--) {
            if (i + times[i] <= n + 1) {
                d[i] = Math.max(d[i + times[i]] + profits[i], d[i + 1]);
            } else {
                d[i] = d[i + 1];
            }
        }
        System.out.println(d[1]);
    }
}
