import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        sc.close();

        String[] s = a.split(" ");
        if (s[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(s.length);
        }
    }
}