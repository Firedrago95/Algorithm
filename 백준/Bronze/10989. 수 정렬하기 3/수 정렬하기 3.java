import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] counts = new int[10001];

        for (int i = 0; i < N; i++) {
            counts[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (counts[i] > 0) {
                sb.append(i).append('\n');
                counts[i]--;
            }
            if (sb.length() > 8192) {
                System.out.print(sb);
                sb.setLength(0);
            }
        }
        System.out.print(sb);
    }
}