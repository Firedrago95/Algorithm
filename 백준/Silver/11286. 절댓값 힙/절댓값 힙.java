import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(
            Comparator.comparing((Integer i) -> Math.abs(i))
                .thenComparing(i -> i)
        );

        while (n-- > 0) {
            int c = Integer.parseInt(br.readLine());

            if (c != 0) {
                q.add(c);
            } else {
                Integer poll = q.poll();
                if (poll == null) {
                    sb.append(0).append("\n");
                    continue;
                }
                sb.append(poll).append("\n");
            }
        }
        System.out.println(sb);
    }
}
