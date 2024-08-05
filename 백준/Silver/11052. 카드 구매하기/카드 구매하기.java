import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
            for (int j = 1; j < i; j++) {
                d[i] = Math.max(d[i], d[i - j] + d[j]);
            }
        }
        System.out.println(d[n]);
    }
}
