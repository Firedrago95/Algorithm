import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> a = List.of(0, 3, 6, 9, 12);
        int count = 0;
        while (!a.contains(N)) {
            N -= 5;
            count++;
            if (N < 0) {
                break;
            }
        }
        if (a.contains(N)) {
            count += N / 3;
            System.out.print(count);
        } else {
            System.out.print(-1);
        }
    }
}