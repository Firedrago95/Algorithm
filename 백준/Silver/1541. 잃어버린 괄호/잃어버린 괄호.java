import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int n;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String example = br.readLine();
        String[] split = example.split("-");

        long result = 0;
        for (int i = 0; i < split.length; i++) {
            int sum = mySum(split[i]);
            if (i == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }
        System.out.println(result);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("[+]");
        for (String n : temp) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}
