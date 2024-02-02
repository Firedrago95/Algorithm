import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multiply = a*b*c;
        int[] count = new int[10];

        while(multiply > 0) {
            int i = multiply % 10;
            count[i] += 1;
            multiply /= 10;
        }

        for (int n : count) {
            System.out.println(n);
        }
    }
}