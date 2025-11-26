import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] result = new int[n];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(result);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
