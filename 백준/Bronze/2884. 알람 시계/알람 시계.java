import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) {
            h = checkHour(--h);
            m = checkMin(m+15);
        } else if (m >= 45) {
            m -= 45;
        }
        System.out.println(h+" "+m);
    }

    private static int checkHour(int h) {
        if (h < 0 ) {
            return 23;
        } else if (h > 23) {
            return 0;
        }
        return h;
    }

    private static int checkMin(int m) {
        if (m < 0 || m > 59) {
            return 0;
        }
        return m;
    }
}