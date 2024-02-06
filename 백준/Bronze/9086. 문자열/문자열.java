import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String word = br.readLine();
            String[] a = word.split("");
            System.out.println(a[0]+a[word.length()-1]);
        }
    }
}