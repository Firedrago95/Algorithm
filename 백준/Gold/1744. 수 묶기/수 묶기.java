import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> mq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int e = Integer.parseInt(br.readLine());
            if (e > 1) {
                pq.add(e);
            } else if (e < 0) {
                mq.add(e);
            } else if (e == 1) {
                one++;
            } else if (e == 0) {
                zero++;
            }
        }

        long sum = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            sum += (long) first * second;
        }

        if (!pq.isEmpty()) {
            int last = pq.poll();
            sum += last;
        }

        while (mq.size() > 1) {
            int first = mq.poll();
            int second = mq.poll();
            sum += (long) first * second;
        }

        if (!mq.isEmpty()) {
            if (zero == 0) {
                sum += mq.poll();
            }
        }

        sum += one;

        System.out.println(sum);
    }
}
