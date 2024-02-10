import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[9][9];
        int max = 0;
        int maxX = 10;
        int maxY = 10;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] >= max) {
                    max = a[i][j];
                    maxX = i + 1;
                    maxY = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(maxX+" "+maxY);
    }
}