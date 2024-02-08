import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Character> used = null;
        int t = Integer.parseInt(st.nextToken());
        int count = t;
        char now = ' ';
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            used = new HashSet<>();
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != now) {
                    if (used.contains(word.charAt(j))) {
                        count--;
                        break;
                    } else {
                        used.add(word.charAt(j));
                        now = word.charAt(j);
                    }
                } else {
                    used.add(word.charAt(j));
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}