import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2*i-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i< n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * (n - i) - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}