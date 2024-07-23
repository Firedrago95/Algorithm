import java.io.*;
import java.util.*;


public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            String binary = Integer.toBinaryString(input.charAt(i) - '0');
            if (binary.length() == 1 && i != 0) {
                binary = "00"+binary;
            } else if (binary.length() == 2 && i != 0) {
                binary = "0"+binary;
            }
            sb.append(binary);
        }
        System.out.println(sb.toString());
    }
}

