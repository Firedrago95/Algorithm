import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            sb = new StringBuilder();
            String[] split = br.readLine().split(" ");
            int r = Integer.parseInt(split[0]);
            String[] s = split[1].split("");
            for (String string : s) {
                sb.append(string.repeat(r));
            }
            sb.append("\n");
            bw.write(sb.toString());
        }
        br.close();
        bw.close();
    }
}