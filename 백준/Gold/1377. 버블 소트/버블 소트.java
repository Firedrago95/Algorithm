import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Mdata[] a = new Mdata[n];

        for (int i = 0; i < n; i++) {
            a[i] = new Mdata(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(a);

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i].index - i);
        }

        System.out.println(max + 1);
    }

    static class Mdata implements Comparable<Mdata> {

        public int value;
        public int index;

        public Mdata(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Mdata o) {
            return this.value - o.value;
        }
    }
}
