import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] A;
    static int[] F;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int k = 0; k < M; k++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = A.length - 1;
            while (start <= end) {
                int m = start + (end - start) / 2;

                if (A[m] < target) {
                    start = m + 1;
                } else if (A[m] > target) {
                    end = m - 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
