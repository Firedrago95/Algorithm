import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String stringArray = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = stringArray.charAt(j);
            }
        }

        int min = 64;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                min = Math.min(min, getMin(i, j , board));
            }
        }
        bw.write(min + "");
        br.close();
        bw.close();
    }

    private static int getMin(int i, int j, char[][] board) {
        int count = 0;
        char c = board[i][j];
        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                if (board[k][l] != c) {
                    count++;
                }
                c = changeBoard(c);
            }
            c = changeBoard(c);
        }
        return Math.min(count, 64 - count);
    }

    private static char changeBoard(char c) {
        if (c == 'W') return 'B';
        return 'W';
    }
}