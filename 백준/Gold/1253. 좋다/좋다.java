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
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        long count = 0;
        for (int k = 0; k < n; k++) {
            int right = a.length - 1;
            int left = 0;

            while (left < right) {
                if (a[left] + a[right] == a[k]) {
                    if (left != k && right != k) {
                        count++;
                        break;
                    } else if (left == k) {
                        left++;
                    } else if (right == k) {
                        right--;
                    }
                } else if (a[left] + a[right] < a[k]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(count);
    }
}
