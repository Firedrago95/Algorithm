import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] nums = br.readLine().toCharArray();
        int answer = 0;
        for (char num : nums) {
            answer += (num - '0');
        }
        System.out.println(answer);
    }
}