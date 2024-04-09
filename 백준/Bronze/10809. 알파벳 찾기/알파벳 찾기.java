import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        char[] input = br.readLine().toCharArray();
        for (int i = 0; i < input.length; i++ ) {
            if (alphabet[input[i] - 'a'] == -1) {
                alphabet[input[i] - 'a'] = i;
            }
        }

        for (int j : alphabet) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}
