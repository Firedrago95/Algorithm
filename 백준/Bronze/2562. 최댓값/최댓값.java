import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }

        bw.write(String.format("%d%n%d",max, index + 1));
        br.close();
        bw.close();
    }
}