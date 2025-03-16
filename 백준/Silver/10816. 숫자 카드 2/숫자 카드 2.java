import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 주어진 정수 갯수 M 입력 받는다.
        int m = Integer.parseInt(br.readLine());

        // 정수 M들을 입력 받는다.
        int[] ms = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ms.length; i++) {
            ms[i] = Integer.parseInt(st.nextToken());
        }
        // 정수 M들을 정렬한다. -> 왜? 완전탐색 안되면 이분탐색
        Arrays.sort(ms);
        // 상근이가 가진 카드 갯수 N 입력 받는다.
        int n = Integer.parseInt(br.readLine());

        // 상근이가 가진 카드들을 입력 받는다.
        int[] ns = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ns.length; i++) {
            ns[i] = Integer.parseInt(st.nextToken());
        }

        // 상근이가 가진 카드별로 주어진 카드 갯수를 구하고 출력한다.
        StringBuilder sb = new StringBuilder();
        for (int card : ns) {
            int lowerBound = calculateLowerBound(card, ms);
            int upperBound= calculateUpperBound(card, ms);
            sb.append(upperBound - lowerBound).append(" ");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static int calculateLowerBound(int card, int[] ms) {
        int left = 0;
        int right = ms.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (card <= ms[mid]) {
                right = mid;
                continue;
            }
            left = mid + 1;
        }
        return left;
    }

    private static int calculateUpperBound(int card, int[] ms) {
        int left = 0;
        int right = ms.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (card < ms[mid]) {
                right = mid;
                continue;
            }
            left = mid + 1;
        }
        return left;
    }
}
