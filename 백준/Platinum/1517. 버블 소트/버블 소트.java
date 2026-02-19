import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int[] a;
    static int[] tmp;
    static long result;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        result = 0;

        a = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, n - 1);

        System.out.println(result);
    }

    private static void mergeSort(int s, int e) {
        if (s >= e) return;

        int m = s + (e - s) / 2;

        mergeSort(s, m);
        mergeSort(m + 1, e);

        for (int i = s; i <= e; i++) {
            tmp[i] = a[i];
        }

        int k = s;
        int i1 = s;
        int i2 = m + 1;

        while (i1 <= m && i2 <= e) {
            if (tmp[i1] <= tmp[i2]) {
                a[k++] = tmp[i1++];
            } else {
                a[k++] = tmp[i2++];
                result += (m - i1 + 1);
            }
        }

        while (i1 <= m) a[k++] = tmp[i1++];
        while (i2 <= m) a[k++] = tmp[i2++];
    }

}
