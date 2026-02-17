import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int count = 1;
        long sum = 1;
        int left = 1;
        int right = 1;
        while (right != n) {
           if (sum == n) {
               count++;
               right++;
               sum += right;
           } else if (sum > n){
               sum -= left;
               left++;
           } else {
               right++;
               sum += right;
           }
        }
        System.out.println(count);
    }
}
