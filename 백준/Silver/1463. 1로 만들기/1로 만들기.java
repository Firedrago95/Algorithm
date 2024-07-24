import java.io.*;
import java.util.*;


public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        int[] result = new int[x+1];
        result[0] = result[1] = 0;
        for (int i = 2; i < result.length; i++) {
            result[i] = result[i - 1] + 1;
            if (i % 2 == 0) {
                result[i] = Math.min(result[i] , result[i / 2] + 1);
            }
            if (i % 3 == 0) {
                result[i] = Math.min(result[i], result[i / 3] + 1);
            }
        }
        System.out.println(result[x]);
    }
}

