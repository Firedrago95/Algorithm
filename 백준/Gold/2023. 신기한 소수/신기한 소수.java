import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        System.out.println(sb);
    }

    private static void dfs(int num, int digit) {
        if (digit == n) {
            sb.append(num).append("\n");
            return;
        }

        for (int i = 1; i <= 9; i += 2) {
            if (check(num * 10 + i)) {
                dfs(num * 10 + i, digit + 1);
            }
        }
    }

    private static boolean check(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
