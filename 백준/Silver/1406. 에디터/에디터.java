import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] inputs = br.readLine().toCharArray();
        Stack<Character> infront = new Stack<>();
        Stack<Character> behind = new Stack<>();
        for (Character c : inputs) {
            infront.push(c);
        }
        int N = Integer.parseInt(br.readLine());
        while (N --> 0) {
            String command = br.readLine();
            if (command.contains("L")) {
                l(infront, behind);
            } else if (command.contains("D")) {
                d(infront, behind);
            } else if (command.contains("B")) {
                b(infront);
            } else {
                char alphabet = command.replace("P ", "").charAt(0);
                p(infront, alphabet);
            }
        }

        while (!infront.isEmpty()) {
            behind.push(infront.pop());
        }
        while (!behind.isEmpty()) {
            sb.append(behind.pop());
        }
        System.out.println(sb);
    }

    private static void l(Stack<Character> infront, Stack<Character> behind) {
        if (infront.isEmpty()) {
            return;
        }
        behind.push(infront.pop());
    }

    private static void d(Stack<Character> infront, Stack<Character> behind) {
        if (behind.isEmpty()) {
            return;
        }
        infront.push(behind.pop());
    }

    private static void b(Stack<Character> infront) {
        if (infront.isEmpty()) {
            return;
        }
        infront.pop();
    }

    private static void p(Stack<Character> infront, char alphabet) {
        infront.push(alphabet);
    }
}