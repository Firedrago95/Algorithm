import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;
        for (int i = 1; i <= 2666799; i++) {
            if (String.valueOf(i).contains("666")) {
                if (++count == N) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}