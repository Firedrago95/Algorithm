import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for (int j = b; j <= (b+c)/2; j++) {
                int tmp = a[j];
                a[j] = a[(c+b)-j];
                a[(c+b)-j] = tmp;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}