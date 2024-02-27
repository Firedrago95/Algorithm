import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<String> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (!a.contains(word)) {
                a.add(word);
            }
        }

        Collections.sort(a, (a1, a2) ->{
            if (a1.length() == a2.length()) {
                for (int i = 0; i < a1.length(); i++) {
                    if (a1.charAt(i) != a2.charAt(i)) {
                        return a1.charAt(i) - a2.charAt(i);
                    }
                }
            }
            return a1.length() - a2.length();
        });

        for (String s : a) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}