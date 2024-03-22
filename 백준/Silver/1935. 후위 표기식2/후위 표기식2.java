import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> stack = new Stack<>();
        for (char a : input) {
            if (a == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if (a == '-') {
                double d = stack.pop();
                double f = stack.pop();
                stack.push(f - d);
            } else if (a == '*') {
                stack.push(stack.pop() * stack.pop());
            } else if (a == '/') {
                double d = stack.pop();
                double f = stack.pop();
                stack.push(f / d);
            } else {
                stack.push((double) num[a - 'A']);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
