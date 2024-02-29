import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        while (N -- > 0) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine()+ " ";
            for (char alphabet : input.toCharArray()) {
                if (alphabet != ' ') {
                    stack.push(alphabet);
                } else {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(' ');
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}