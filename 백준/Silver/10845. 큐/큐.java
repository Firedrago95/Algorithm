import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> queue = new LinkedList<>();
        while (N-- > 0) {
            String command = br.readLine();
            if (command.contains("push")) {
                int num = Integer.parseInt(command.replace("push ", ""));
                queue.add(num);
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(queue.get(0));
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(queue.get(queue.size() - 1));
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(queue.get(0));
                queue.remove(0);
            } else {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        }
    }
}