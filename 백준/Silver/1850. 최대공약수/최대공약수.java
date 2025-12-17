import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long aCount = Long.parseLong(st.nextToken());
        long bCount = Long.parseLong(st.nextToken());

        long gcd = gcd(bCount, aCount);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd; i++) {
            sb.append("1");
        }
        System.out.println(sb);
    }

    private static long gcd(long big, long small) {
        if (small == 0) return big;

        long c = big % small;
        return gcd(small, c);
    }
}
