import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int limit = 10000000;

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        boolean[] isNotPrime = new boolean[limit + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i * i <= limit; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (long i = 2; i * i <= b; i++) {
            if (!isNotPrime[(int) i]) {
                long temp = i * i;
                while (temp <= b) {
                    if (temp >= a) {
                        count++;
                    }
                    if (i > b / temp) break;
                    temp *= i;
                }
            }
        }
        System.out.println(count);
    }
}
