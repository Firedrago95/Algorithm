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
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while(q.size() != 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.poll());
    }
}
