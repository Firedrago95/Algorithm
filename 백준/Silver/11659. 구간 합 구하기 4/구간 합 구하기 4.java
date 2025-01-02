import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        long[] sum = new long[n];
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if (i == 0) {
                sum[i] = nums[i];
                continue;
            }
            sum[i] = sum[i - 1] + nums[i];
        }
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if (i > 1) {
                System.out.println(sum[j - 1] - sum[i - 2]);
            } else {
                System.out.println(sum[j - 1]);
            }
        }
    }
}