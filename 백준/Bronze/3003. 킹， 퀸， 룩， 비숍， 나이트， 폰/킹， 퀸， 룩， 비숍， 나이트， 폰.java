import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] white = new int[6];
        int[] black = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < white.length; i++) {
            white[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < white.length; i++) {
            System.out.print(black[i] - white[i]+" ");
        }

    }
}