import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        
        int s = 1;
        int e = 1;
        long sum = 1;
        int count = 1;
        
        while (e != n) {
            if (sum < n) {
                e++;
                sum += e;
            } else if (sum == n) {
                e++;
                sum += e;
                count++;
            } else if (sum > n) {
                sum -= s;
                s++;
            }
        }
        System.out.println(count);
	}
}