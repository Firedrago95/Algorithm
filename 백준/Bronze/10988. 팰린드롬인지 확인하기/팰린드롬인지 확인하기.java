import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[]a = br.readLine().toCharArray();
        boolean result = true;
        for (int i=0; i <= a.length/2; i++) {
            if (a[i] != a[a.length-1-i]) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}