import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static StringBuilder sb;
    static long[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int treeHeight = 0;
        int length = N;
        while (length > 0) {
            length /= 2;
            treeHeight++;
        }
        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int startIndex = treeSize / 2;
        tree = new long[treeSize];

        for (int i = startIndex; i < startIndex + N; i ++) {
            tree[i] = Long.parseLong(br.readLine());
        }
        setTree(treeSize - 1);

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            long e = Long.parseLong(st.nextToken());

            if (a == 1) {
                changeVal(s + (startIndex - 1), e);
            } else {
                long sum = getSum(s + (startIndex - 1), (int) e + (startIndex -1));
                sb.append(sum).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static void setTree(int i) {
        while (i > 0) {
            tree[i/2] += tree[i];
            i--;
        }
    }

    private static void changeVal(int index, long value) {
        long diff = value - tree[index];
        while (index > 0) {
            tree[index] += diff;
            index /= 2;
        }
    }

    private static long getSum(int startTreeIndex, int endTreeIndex) {
        long sum = 0;
        while (startTreeIndex <= endTreeIndex) {
            if (startTreeIndex % 2 == 1) {
                sum += tree[startTreeIndex];
            }
            startTreeIndex = (startTreeIndex + 1) / 2;

            if (endTreeIndex % 2 == 0) {
                sum += tree[endTreeIndex];
            }
            endTreeIndex = (endTreeIndex - 1) / 2;
        }
        return sum;
    }
}
