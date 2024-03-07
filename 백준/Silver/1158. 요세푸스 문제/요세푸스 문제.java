import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> line = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            line.add(i);
        }

        sb.append("<");
        //Queue가 하나 남을때 까지 반복한다.
        while (line.size() > 1) {
            //K - 1번 만큼 맨앞 숫자를 맨뒤로 보낸다.
            for (int i = 0; i < K - 1; i++) {
                int value = line.poll();
                line.add(value);
            }
            //K 번째 숫자는 빼서 순열에 더한다.
            sb.append(line.poll()).append(", ");
        }
        //Queue의 마지막 숫자는 , 없이 넣고 > 닫아준다.
        sb.append(line.poll()).append(">");
        System.out.println(sb);
    }
}