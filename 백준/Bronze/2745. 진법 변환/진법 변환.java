import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] words = sc.next().toCharArray();
        int formation = sc.nextInt();
        long result  = 0L;
        int num = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] >= '0' && words[i] <= '9') {
                num = (int)(words[i] - '0');
            } else {
                num = (int)(words[i] - '7');
            }
            result += (long)Math.pow(formation, words.length-1-i) * num;
        }
        System.out.println(result);
    }
}