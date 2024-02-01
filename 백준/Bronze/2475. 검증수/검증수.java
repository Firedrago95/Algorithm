import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        for (int i = 1; i <= 5; i++) {
            int a = sc.nextInt();
            answer += Math.pow(a,2);
        }
        sc.close();

        System.out.println(answer%10);
    }
}