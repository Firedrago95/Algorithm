import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] inputA = st.nextToken().split("");
        String[] inputB = st.nextToken().split("");

        int a = Integer.parseInt(inputA[2]+inputA[1]+inputA[0]);
        int b = Integer.parseInt(inputB[2]+inputB[1]+inputB[0]);

        System.out.print(Math.max(a,b));
    }
}