import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int left = 0;
        int right = a.length - 1;
        long count = 0;
        while (left < right) {
            if (a[left] + a[right] == m) {
                count++;
                left++;
                right--;
            } else if (a[left] + a[right] < m) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}
