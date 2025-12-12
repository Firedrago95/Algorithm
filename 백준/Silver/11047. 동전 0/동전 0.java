import java.util.*;
import java.io.*;

public class Main {

    static int N,K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(prices);

        int count = 0;
        for (int i = N -1; i >= 0; i--) {
            if (K >= prices[i]) {
                count += K / prices[i];
                K = K % prices[i];
            }
        }

        System.out.println(count);
    }
}
