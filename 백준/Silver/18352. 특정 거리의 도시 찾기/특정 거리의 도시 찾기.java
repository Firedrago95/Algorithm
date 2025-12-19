import java.util.*;
import java.io.*;

public class Main {

    private static ArrayList<Integer>[] paths;
    private static int[] distinct;
    private static ArrayList<Integer> result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        distinct = new int[N + 1];
        Arrays.fill(distinct, -1);
        result = new ArrayList<>();
        paths = new ArrayList[N + 1];
        for (int i = 1; i < paths.length; i++) {
            paths[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            paths[A].add(B);
        }

        distinct[X] = 0;
        bfs (X);

        for (int i = 1; i < distinct.length; i++) {
            if (distinct[i] == K) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println(-1);
            return;
        }

        for (Integer i : result) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int x) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(x);
        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            for (int num : paths[current]) {
                if (distinct[num] == -1) {
                    distinct[num] = distinct[current] + 1;
                    queue.add(num);
                }
            }
        }
    }
}
