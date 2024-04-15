import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = 0;

            for (int i = 1; i <= Math.min(a,b); i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(a * b / gcd);
        }

    }
}
