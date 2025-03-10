import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }
        
        words = new ArrayList<>(new HashSet(words));

        Collections.sort(words, Comparator.comparing(String::length).thenComparing(String::compareTo));

        for (String word : words) {
            bw.write(word + "\n");
        }
        br.close();
        bw.close();
    }
}