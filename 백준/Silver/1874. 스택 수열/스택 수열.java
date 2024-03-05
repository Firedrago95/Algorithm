import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int previosNum = 0;
        while (N --> 0) {
            int num = Integer.parseInt(br.readLine());
            if (num > previosNum) {
                while (previosNum != num) {
                    stack.push(++previosNum);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int popNum = stack.pop();
                if (popNum != num) {
                    sb.append("NO").append("\n");
                }
                sb.append("-").append("\n");
            }
        }
        if (sb.toString().contains("NO")) {
            System.out.println("NO");
        } else {
            System.out.println(sb.toString());
        }

    }
}