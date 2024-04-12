import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] rArray = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            rArray[i] = input.substring(i);
        }

        Arrays.sort(rArray);

        for (String s : rArray) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
