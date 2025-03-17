import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int max = 0;
        int sum = 0;
        for(int i = 0; i<n; i++){
            int cur = Integer.parseInt(str[i]);
            sum += cur;
            max = max < cur ? cur : max;
        }

        float rate = 100 / (float)max;
        bw.write(sum * rate / n + "");
        br.close();
        bw.close();
    }
}
