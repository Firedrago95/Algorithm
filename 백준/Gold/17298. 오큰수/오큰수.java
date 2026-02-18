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
        int[] a = new int[n];
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                ans[stack.pop()] = a[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            ans[stack.pop()] = - 1;
        }

        for (int an : ans) {
            sb.append(an).append(' ');
        }
        System.out.println(sb);
    }
}
