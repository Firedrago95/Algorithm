import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int lastPushed = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int target = Integer.parseInt(st.nextToken());

            if (target > lastPushed) {
                for (int j = lastPushed + 1; j < target + 1; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                lastPushed = target;
            }
            else if (stack.peek() != target) {
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
