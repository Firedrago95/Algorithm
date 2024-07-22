import java.io.*;
import java.util.*;


public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                Integer a = queue.poll();
                queue.add(a);
            }
            Integer b = queue.poll();
            result.add(b);
        }

        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                sb.append(result.get(i) + ", ");
            } else {
                sb.append(result.get(i)+">");
            }
        }
        System.out.println(sb.toString());
    }
}

