import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] a = new String[5][15];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            String[] words = line.split("");
            for (int j = 0; j < line.length(); j++) {
                a[i][j] = words[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[j][i] != null) {
                    System.out.print(a[j][i]);
                } else {
                    continue;
                }
            }
        }

    }
}