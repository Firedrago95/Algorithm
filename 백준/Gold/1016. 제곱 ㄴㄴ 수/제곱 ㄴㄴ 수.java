import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

       int length = (int) (max - min + 1);

        boolean[] isNotSquare = new boolean[length];
        for (long i = 2; i * i <= max; i++) {
            long square = i * i;

            long start = min / square;
            if (min % square != 0) {
                start++;
            }

            for (long j = start; j * square <= max; j++) {
                long current = j * square;
                isNotSquare[(int) (current - min)] = true;
            }
        }
        int count = 0;
        for (boolean b : isNotSquare) {
            if (!b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
