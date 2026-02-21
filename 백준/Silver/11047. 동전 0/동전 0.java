import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int N, K;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            while (K >= a[i]) {
                count += K / a[i];
                K %= a[i];
            }
        }
        System.out.println(count);
    }
}
