import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int copy = n;
        int count = 0;

        while (true) {
            count++;
            n = ((n % 10) * 10) + ((n / 10) + (n % 10)) % 10;
            if (n == copy) {
                break;
            }
        }
        System.out.println(count);
    }
}
