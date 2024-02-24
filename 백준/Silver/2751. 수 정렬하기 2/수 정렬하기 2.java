import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(a);
        for (Integer i : a) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}