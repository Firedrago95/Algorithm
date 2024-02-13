import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean[][] a = new boolean[101][101];
        int count = 0;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!a[j][k]) {
                        a[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}