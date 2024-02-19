import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        boolean isAnswer = false;
        for (int i = 1; i < n; i++) {
            int num = i;
            int plus = 0;
            while (num > 0) {
                plus += num % 10;
                num /= 10;
            }
            if (plus + i == n) {
                isAnswer = true;
                System.out.println(i);
                break;
            }
        }
        if (!isAnswer) {
            System.out.println(0);
        }
    }
}