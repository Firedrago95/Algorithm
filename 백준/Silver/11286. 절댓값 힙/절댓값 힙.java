import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if (absA == absB) {
                return a - b;
            }
            return absA - absB;
        });

        for (int i = 0; i < n; i++) {
            int command = Integer.parseInt(br.readLine());
            if (command != 0) {
                pq.add(command);
            } else {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                    continue;
                }
                sb.append(pq.remove() + "\n");
            }
        }
        System.out.println(sb);
    }
}
