import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String command = br.readLine();
            process(command, deque);
        }
    }

    private static void process(String command, Deque<Integer> deque) {
        if (command.equals("front")) {
            if (checkEmpty(deque)) return;
            System.out.println(deque.peekFirst());
        } else if (command.equals("back")) {
            if (checkEmpty(deque)) return;
            System.out.println(deque.peekLast());
        } else if (command.equals("pop_front")) {
            if (checkEmpty(deque)) return;
            System.out.println(deque.pollFirst());
        } else if (command.equals("pop_back")) {
            if (checkEmpty(deque)) return;
            System.out.println(deque.pollLast());
        } else if (command.contains("push_front")) {
            int num = Integer.parseInt(command.replace("push_front ", ""));
            deque.addFirst(num);
        } else if (command.contains("push_back")) {
            int num = Integer.parseInt(command.replace("push_back ", ""));
            deque.addLast(num);
        } else if (command.equals("size")) {
            System.out.println(deque.size());
        } else if (command.equals("empty")) {
            if (deque.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean checkEmpty(Deque<Integer> deque) {
        if (deque.isEmpty()) {
            System.out.println(-1);
            return true;
        }
        return false;
    }
}