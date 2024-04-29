import java.io.*;


public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String N = br.readLine();

        if(N.length() % 3 == 1)
            sb.append(N.charAt(0));

        if(N.length() % 3 == 2)
            sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0'));

        for(int i = N.length() % 3; i < N.length(); i+=3) {
            sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i+1) - '0') * 2
                    + (N.charAt(i+2) - '0'));
        }
        System.out.println(sb);
    }
}

