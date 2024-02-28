import java.io.*;
import java.lang.reflect.Member;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] lines = new int[3];
        while (true) {
            st = new StringTokenizer(br.readLine());
            lines[0] = Integer.parseInt(st.nextToken());
            lines[1] = Integer.parseInt(st.nextToken());
            lines[2] = Integer.parseInt(st.nextToken());

            if (lines[0] + lines[1] + lines[2] == 0) {
                break;
            }
            Arrays.sort(lines);

            if (Math.pow(lines[0], 2) + Math.pow(lines[1], 2) == Math.pow(lines[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}