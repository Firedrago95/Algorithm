import java.util.*;
import java.io.*;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        while (queue.size() > 1) {
            int smallest = queue.poll();
            int secondSmallest = queue.poll();
            
            int sum = smallest + secondSmallest;
            result += sum;
            queue.add(sum);
        }

        System.out.println(result);
    }
}
