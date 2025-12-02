import java.util.*;
import java.io.*;

public class Main {

    private static int[] checkCounts = new int[4];
    private static int[] currentCounts = new int[4];
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String dna = st.nextToken();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkCounts[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < p; i++) {
            add(dna.charAt(i));
        }

        check();

        for (int start = 1; start <= s - p; start++) {
            remove(dna.charAt(start - 1));
            add(dna.charAt(start + p - 1));

            check();
        }

        System.out.println(count);
    }

    private static void add(char c) {
        if (c == 'A') currentCounts[0]++;
        if (c == 'C') currentCounts[1]++;
        if (c == 'G') currentCounts[2]++;
        if (c == 'T') currentCounts[3]++;
    }

    private static void remove(char c) {
        if (c == 'A') currentCounts[0]--;
        if (c == 'C') currentCounts[1]--;
        if (c == 'G') currentCounts[2]--;
        if (c == 'T') currentCounts[3]--;
    }

    private static void check() {
        for (int i = 0; i < 4; i++) {
            if (currentCounts[i] < checkCounts[i]) {
                return;
            }
        }
        count++;
    }
}
