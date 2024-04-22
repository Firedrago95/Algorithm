import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long result = 0;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] inputs = new int[n];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < inputs.length - 1; i++) {
                for (int j = i + 1; j < inputs.length; j++) {
                    result += getGcd(max(inputs[i], inputs[j]), min(inputs[i], inputs[j]));
                }
            }
            System.out.println(result);
        }

    }

    private static int getGcd(int max, int min) {
        if (max % min == 0) {
            return min;
        }
        return getGcd(min, max % min);
    }
}

