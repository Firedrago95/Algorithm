import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int total = 0;
        int M = Integer.parseInt(st.nextToken());
        int[] count = new int[M + 1];
        double[] probability = new double[M + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            int c = Integer.parseInt(st.nextToken());
            count[i] = c;
            total += c;
        }
        int K = Integer.parseInt(br.readLine());

        double ans = 0;
        for (int i = 0; i <= M; i++) {
            if (count[i] >= K) {
                probability[i] = 1.0;
                for (int k = 0; k < K; k++) {
                    probability[i] *= (double) (count[i] - k) / (total - k);
                }
                ans += probability[i];
            }
        }
        System.out.println(ans);
    }

}
