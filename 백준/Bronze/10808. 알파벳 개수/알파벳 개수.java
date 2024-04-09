import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];

        String input = br.readLine();
        for (char a : input.toCharArray()) {
            alphabet[a - 'a']++;
        }

        for (int i : alphabet) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
