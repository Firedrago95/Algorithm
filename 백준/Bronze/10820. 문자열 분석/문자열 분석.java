import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tInput;
        while ((tInput = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            int[] result = new int[4];
            char[] input = tInput.toCharArray();
            for (char c : input) {
                if ('a' <= c && c <= 'z') {
                    result[0]++;
                } else if ('A' <= c && c <= 'Z') {
                    result[1]++;
                } else if ('0' <= c && c <= '9') {
                    result[2]++;
                } else {
                    result[3]++;
                }
            }

            for (int i = 0; i < result.length; i++) {
                sb.append(result[i]).append(" ");
            }
            System.out.println(sb);
        }
    }
}
