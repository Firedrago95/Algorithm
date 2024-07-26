import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        if (n < 3) {
            System.out.println(n);
            return;
        }

        long[] count = new long[n + 1];
        count[0] = 0;
        count[1] = 1;
        count[2] = 2;

        for (int i = 3; i <= n; i++) {
            count[i] = (count[i - 1] + count[i - 2]) % 10007;
        }
        System.out.println(count[n]);
    }
}
