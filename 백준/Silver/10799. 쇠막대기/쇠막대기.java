import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<Character>();

        String input = br.readLine();
        int result = 0;
        boolean isDuplicate = false;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                isDuplicate = false;
                stack.add(c);
            } else if (c == ')') {
                if (isDuplicate) {
                    if (stack.isEmpty()) continue;
                    stack.pop();
                    result += 1;
                    continue;
                }
                stack.pop();
                result += stack.size();
                isDuplicate = true;
            }
        }
        System.out.println(result);
    }
}