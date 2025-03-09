import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null) {
            String[] nu = input.split(" ");
            int sum = 0;
            for (String num : nu) {
                sum += Integer.parseInt(num);
            }
            System.out.println(sum);
        }
        br.close();
    }
}