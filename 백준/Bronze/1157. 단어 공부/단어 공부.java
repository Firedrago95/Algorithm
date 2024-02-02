import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken().toUpperCase();
        int[] count = new int[26];

        String[] words = word.split("");
        for (int i = 0; i < words.length; i++) {
            char w = word.charAt(i);
            count[w - 'A'] += 1;
        }

        int maxCount = 0;
        int maxIndex = 0;
        for (int i=0; i< count.length; i++) {
            if (maxCount < count[i]) {
                maxCount = count[i];
                maxIndex = i;
            }
        }

        for (int i=count.length-1; i>=0; i--) {
            if (count[i] == maxCount && i != maxIndex) {
                System.out.print("?");
                break;
            } else if (count[i] == maxCount && i == maxIndex) {
                System.out.print((char)(maxIndex + 'A'));
            }
        }

    }
}