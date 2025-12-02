import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        if (n < 3) {
            System.out.println(0);
            return;
        }
        
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);

        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int start = 0;
            int end = n - 1;
            
            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }

                long sum = arr[start] + arr[end];

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}
