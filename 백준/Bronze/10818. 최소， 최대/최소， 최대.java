import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int min = 1000000;
        int max = -1000000;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        bw.write(min + " " + max);
        br.close();
        bw.close();
    }
}