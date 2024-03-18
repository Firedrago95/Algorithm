import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[num];

        for (int i = 0; i < num; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < num; i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && seq[i] > seq[stack.peek()]) {
                    seq[stack.pop()] = seq[i];
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        for (int n : seq) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}