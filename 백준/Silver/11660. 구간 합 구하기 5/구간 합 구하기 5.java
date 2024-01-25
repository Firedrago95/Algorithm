import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dimension = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long a[][] = new long[dimension + 1][dimension + 1];
        for (int i = 1; i <= dimension; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= dimension; j++) {
                a[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        long[][] sum = new long[dimension + 1][dimension + 1];
        for (int i = 1; i <= dimension; i++) {
            for (int j = 1; j <= dimension; j++) {
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + a[i][j];
            }
        }
        for (int i = 1; i <= quizNo; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            
            long result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1 - 1] + sum[x1-1][y1-1];
            System.out.println(result);
        }
	}
}