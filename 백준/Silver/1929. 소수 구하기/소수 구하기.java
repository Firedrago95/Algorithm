import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            isPrime(i);
        }
        System.out.println(sb);
    }

    private static void isPrime(int i) {
        if (i < 2) {
            return;
        }
        if (i == 2) {
            sb.append(i).append("\n");
            return;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return;
            }
        }
        sb.append(i).append("\n");
    }
}

