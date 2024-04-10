import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] input = br.readLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (('a' <= input[i] && input[i] <= 'm')|| ('A' <= input[i] && input[i] <= 'M')) {
                input[i] += 13;
            } else if (('n' <= input[i] && input[i] <= 'z')|| ('N' <= input[i] && input[i] <= 'Z')) {
                input[i] -= 13;
            }
        }

        for (char c : input) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
