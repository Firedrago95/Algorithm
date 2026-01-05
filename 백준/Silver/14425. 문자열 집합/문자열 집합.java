import java.util.*;
import java.io.*;

public class Main {

    static StringTokenizer st;
    static int N,M;

    static class TrieNode{
        TrieNode[] next = new TrieNode[26];
        boolean isEnd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        TrieNode root = new TrieNode();
        while (N-- > 0) {
            String word = br.readLine();
            TrieNode now = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (now.next[c - 'a'] == null) {
                    now.next[c - 'a'] = new TrieNode();
                }
                now = now.next[c - 'a'];
                if (i == word.length() - 1) {
                    now.isEnd = true;
                }
            }
        }
        int count = 0;
        while (M-- > 0) {
            String word = br.readLine();
            TrieNode now = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (now.next[c - 'a'] == null) break;
                now = now.next[c - 'a'];
                if (i == word.length() - 1 && now.isEnd) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
