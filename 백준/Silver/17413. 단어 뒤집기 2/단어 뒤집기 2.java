import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean isTag = false;
        Stack<Character> stack = new Stack<Character>();
        String input = br.readLine() + " ";

        for (char c : input.toCharArray()) {
            if (c == '<') {
                isTag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            } else if (c == '>') {
                isTag = false;
                sb.append(c);
                continue;
            }

            if (isTag) {
                sb.append(c);
            } else {
                if (c != ' ') {
                    stack.add(c);
                } else {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
}