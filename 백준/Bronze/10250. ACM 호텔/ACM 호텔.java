import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int width = 1;
            int floor = 1;
            while (n > h) {
                n -= h;
                width++;
            }
            floor = n;
            System.out.println(floor * 100 + width);
        }
        sc.close();

    }
}