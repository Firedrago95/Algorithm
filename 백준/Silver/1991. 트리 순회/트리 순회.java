import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N;
    static int[][] tree;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        tree = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int node = st.nextToken().charAt(0) - 'A';
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            if (left == '.') {
                tree[node][0] = -1;
            } else {
                tree[node][0] = left - 'A';
            }
            if (right == '.') {
                tree[node][1] = -1;
            } else {
                tree[node][1] = right - 'A';
            }
        }

        sb = new StringBuilder();
        preOrder(0);
        System.out.println(sb);
        sb = new StringBuilder();
        inOrder(0);
        System.out.println(sb);
        sb = new StringBuilder();
        postOrder(0);
        System.out.println(sb);
    }

    private static void preOrder(int now) {
        if (now == -1) return;
        sb.append((char) (now + 'A'));
        preOrder(tree[now][0]);
        preOrder(tree[now][1]);
    }

    private static void inOrder(int now) {
        if (now == -1) return;
        inOrder(tree[now][0]);
        sb.append((char) (now + 'A'));
        inOrder(tree[now][1]);
    }

    private static void postOrder(int now) {
        if (now == - 1) return;
        postOrder(tree[now][0]);
        postOrder(tree[now][1]);
        sb.append((char) (now + 'A'));
    }
}
