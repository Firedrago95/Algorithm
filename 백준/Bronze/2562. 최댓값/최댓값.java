import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
        int[] a = new int[9];
        
		for (int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        int maxIndex =0;
        for (int i=0; i<9; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex +1);
	}
}