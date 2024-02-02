import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        String message = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i + 1) {
                message = "ascending";
            } else if (a[i] == 8 - i) {
                if (message.equals("ascending")) {
                    message = "mixed";
                    break;
                }
                message = "descending";
            } else {
                message = "mixed";
                break;
            }
        }
        System.out.println(message);
    }
}