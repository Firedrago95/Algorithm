import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int start = 0;
        int end = a.length - 1;
        int count = 0;

        while (start < end) {
            long sum = a[start] + a[end];

            if (sum == m) {
                count++;
                end--;
            } else if (sum < m) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(count);
    }
}
