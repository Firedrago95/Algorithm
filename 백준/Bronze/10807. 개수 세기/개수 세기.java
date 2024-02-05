import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == v){
                result++;
            }
        }
        bw.write(result+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}