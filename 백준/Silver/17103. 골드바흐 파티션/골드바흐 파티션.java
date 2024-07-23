import java.io.*;
import java.util.*;


public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    private static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        isPrime();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (!prime[i] && !prime[n - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static void isPrime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                for (int j = i + i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}

