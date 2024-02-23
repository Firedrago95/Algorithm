import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(sum / 5);
        System.out.println(a[2]);
    }
}