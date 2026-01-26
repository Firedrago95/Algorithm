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

        int treeHeight = 0;
        int length = N;
        while (length > 0) {
            length /= 2;
            treeHeight++;
        }
        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int startNode = treeSize / 2;
        tree = new long[treeSize];
        for (int i = startNode; i < startNode + N; i++) {
            tree[i] = Long.parseLong(br.readLine());
        }

        setTree(treeSize - 1);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            long min = getMin(a + (startNode - 1), s + (startNode - 1));
            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }

    private static void setTree(int i) {
        while (i > 0) {
            tree[i / 2] = Math.min(tree[i], tree[i - 1]);
            i -= 2;
        }
    }

    private static long getMin(int startTreeIndex, int endTreeIndex) {
        long min = Long.MAX_VALUE;
        while (startTreeIndex <= endTreeIndex) {
            if (startTreeIndex % 2 == 1) {
                min = Math.min(tree[startTreeIndex], min);
            }
            startTreeIndex = (startTreeIndex + 1) / 2;

            if (endTreeIndex % 2 == 0) {
                min = Math.min(tree[endTreeIndex], min);
            }
            endTreeIndex = (endTreeIndex - 1) / 2;
        }
        return min;
    }
}
