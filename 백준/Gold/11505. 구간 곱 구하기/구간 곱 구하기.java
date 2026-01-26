import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static long[] tree;
    static int MOD;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        MOD = 1000000007;
        int treeHeight = 0;
        int length = N;
        while (length > 0) {
            length /= 2;
            treeHeight++;
        }
        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int startIndex = treeSize / 2;
        tree = new long[treeSize];
        for (int i = startIndex; i < startIndex + N; i++) {
            tree[i] = Long.parseLong(br.readLine());
        }
        setTree(treeSize - 1);

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 1) {
                changeVal(b + (startIndex - 1), c);
            } else {
                long multiple = getMultiple(b + (startIndex - 1), c + (startIndex - 1));
                sb.append(multiple).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static void changeVal(int index, int value) {
        tree[index] = value;
        while (index > 1) {
            index /= 2;
            tree[index] = tree[index * 2] % MOD * tree[index * 2 + 1] % MOD;
        }
    }

    private static long getMultiple(int startIndex, int endIndex) {
        long multiple = 1;
        while (startIndex <= endIndex) {
            if (startIndex % 2 == 1) {
                multiple = multiple * tree[startIndex] % MOD;
            }
            startIndex = (startIndex + 1) / 2;

            if (endIndex % 2 == 0) {
                multiple = multiple* tree[endIndex] % MOD;
            }
            endIndex = (endIndex - 1) / 2;
        }
        return multiple;
    }

    private static void setTree(int i) {
        while (i > 0) {
            tree[i / 2] = tree[i] * tree[i - 1] % MOD;
            i -= 2;
        }
    }
}
