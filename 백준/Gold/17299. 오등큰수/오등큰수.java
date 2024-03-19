import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[num];
        int[] count = new int[1000001];

        for (int i = 0; i < num; i++) {
            int inputNum = Integer.parseInt(st.nextToken());
            seq[i] = inputNum;
            count[inputNum]++;
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < num; i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && count[seq[stack.peek()]] < count[seq[i]]) {
                    seq[stack.pop()] = seq[i];
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        for (int i = 0; i < num; i++) {
            sb.append(seq[i]).append(" ");
        }
        System.out.println(sb);
    }
}