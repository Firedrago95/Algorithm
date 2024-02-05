import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int[] a = new int[31];

        for (int i=1; i<=28; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            a[index] = 1;
        }

        for (int i=1; i<=30; i++) {
            if (a[i] == 0) {
                System.out.println(i);
            }
        }
    }
}