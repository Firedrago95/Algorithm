import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n+1];

        for (int i = 1; i <= n; i++) {
            a[i] = i;
            for (int j = 1; j * j <= i; j++) {
                if (a[i] > a[i - j * j] + 1) {
                    a[i] = a[i - j * j] + 1;
                }
            }
        }
        System.out.println(a[n]);
    }
}
