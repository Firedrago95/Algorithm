import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
       int t = Integer.parseInt(br.readLine());
       while (t-- > 0) {
           int n = Integer.parseInt(br.readLine());
           int[] counts = new int[11];

           counts[1] = 1;
           counts[2] = 2;
           counts[3] = 4;

           for (int i = 4; i <= n; i++) {
               counts[i] = counts[i - 1] + counts[i - 2] + counts[i - 3];
           }
           System.out.println(counts[n]);
       }
    }
}
