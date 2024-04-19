import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num % 5 == 0) {
                count++;
                num /= 5;
            }
        }
        System.out.println(count);
    }
}

