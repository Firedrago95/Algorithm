import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        int count = 1;
        int score = 0;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            char[] a = st.nextToken().toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (j > 0 && a[j-1] == 'O') {
                    count++;
                } else {
                    count = 1;
                }
                if (a[j] == 'O') {
                    score += count;
                }
            }
            System.out.println(score);
            count = 1;
            score = 0;
        }
    }
}