import java.io.*;
import java.util.*;


public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        long[] num = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.abs(Long.parseLong(st.nextToken()) - s);
        }

        long gcd = num[0];
        for (int i = 1; i < num.length; i++) {
            gcd = getGcd(gcd, num[i]);
        }
        System.out.println(gcd);
    }

    private static long getGcd(long a, long b) {
        while (b > 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}

