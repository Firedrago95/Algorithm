import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N;
    static boolean[] visit;
    static int answer = 0;
    static int deleteNode = 0;
    static ArrayList<Integer>[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N];
        visit = new boolean[N];
        int root = 0;
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(st.nextToken());
            if (p != -1) {
                tree[i].add(p);
                tree[p].add(i);
            } else {
                root = i;
            }
        }
        deleteNode = Integer.parseInt(br.readLine());
        if (deleteNode == root) {
            System.out.println(0);
        } else {
            dfs(root);
            System.out.println(answer);
        }
    }

    private static void dfs(int number) {
        visit[number] = true;
        int cNode = 0;
        for (int i : tree[number]) {
            if (!visit[i] && i != deleteNode) {
                cNode++;
                dfs(i);
            }
        }
        if (cNode == 0) {
            answer++;
        }
    }
}
