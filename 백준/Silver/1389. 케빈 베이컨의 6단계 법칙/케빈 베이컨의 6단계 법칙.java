import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N,M;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.MAX_VALUE / 2;
                if (i == j) graph[i][j] = 0;
            }
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if(graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        int minKevinBacon = Integer.MAX_VALUE;
        int answerPerson = 0;
        for (int i = 1; i <= N; i++) {
            int currentSum = 0;
            for (int j = 1; j <= N; j++) {
                currentSum += graph[i][j];
            }
            
            if (currentSum < minKevinBacon) {
                minKevinBacon = currentSum;
                answerPerson = i;
            }
        }
        System.out.println(answerPerson);
    }
}
