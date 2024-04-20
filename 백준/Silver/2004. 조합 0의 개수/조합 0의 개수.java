import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long fiveCount = count(a,5) - count(a - b,5) - count(b, 5);
        long twoCount = count(a,2) - count(a - b,2) - count(b, 2);

        System.out.println(min(fiveCount, twoCount));
    }

    private static long count(long num, long k) {
        long result = 0;
        while (num >= k) {
            result += num / k;
            num /= k;
        }
        return result;
    }
}

