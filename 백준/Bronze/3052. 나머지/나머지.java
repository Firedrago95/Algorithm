import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
        Set<Integer> set = new HashSet<Integer>();
		for (int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) % 42;
            set.add(a);
        }
        System.out.println(set.size());
	}
}