import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        Arrays.fill(b, 1);

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && b[i] < b[j] + 1) {
                    b[i] = b[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println(max);
    }
}
