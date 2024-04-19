import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}

