import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cookM = sc.nextInt();
        int resultM = m+cookM;
        if (resultM > 59) {
            h += resultM/60;
            m = resultM%60;
        } else {
            m = resultM;
        }

        if (h > 23) {
            h -= 24;
        }

        System.out.printf("%s %s",h,m);
    }
}