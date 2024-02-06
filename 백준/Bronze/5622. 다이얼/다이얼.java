import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        char[] a = alphabet.toCharArray();
        int result = 0;

        for (int i = 0; i < alphabet.length(); i++) {
            int t = (a[i] - 'A');

            if (t > 21) {
                result += 10;
            } else if (t > 18) {
                result += 9;
            } else if (t > 14) {
                result += 8;
            } else if (t > 11) {
                result += 7;
            } else if (t > 8) {
                result += 6;
            } else if (t > 5) {
                result += 5;
            } else if (t > 2) {
                result += 4;
            } else if (t > -1) {
                result += 3;
            }
        }
        System.out.println(result);
    }
}