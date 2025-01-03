import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int sum = 1;
        int startIndex = 1;
        int endIndex = 1;
        while (endIndex != n) {
            if (sum == n) {
                count++;
                endIndex++;
                sum += endIndex;
            } else if (sum > n) {
                sum -= startIndex;
                startIndex++;
            } else {
               endIndex++;
               sum += endIndex;
            }
        }
        System.out.println(count);
    }
}
