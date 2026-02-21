import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while (q.size() >= 2) {
            long currentSum = q.poll() + q.poll();
            sum += currentSum;
            q.add(currentSum);
        }

        System.out.println(sum);
    }
}
