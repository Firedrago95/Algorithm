import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            a[i] = i;
        }
        
        for (int i=0; i<m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            
            int tmp = a[s];
            a[s] = a[e];
            a[e] = tmp;
        }
        
        for (int i = 1; i<=n; i++) {
            System.out.print(a[i]+" ");
        }
        
	}
}