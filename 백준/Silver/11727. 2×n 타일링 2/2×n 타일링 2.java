import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[n + 1];
        counts[0] = 0;
        counts[1] = 1;

        if (n > 1) {
            counts[2] = 3;
            for (int i = 3; i < counts.length; i++) {
                counts[i] = (counts[i - 1] + (counts[i - 2] * 2)) % 10007;
            }
        }
        System.out.println(counts[n]);
    }
}
