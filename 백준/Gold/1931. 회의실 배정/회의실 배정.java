import java.util.*;
import java.io.*;

public class Main {

    static int N;

    static class Meeting implements Comparable<Meeting>{
        private int start;
        private int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.end != o.end) {
                return this.end - o.end;
            } else {
                return this.start - o.start;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings);

        int prevEndTime = -1;
        int result = 0;
        for (Meeting meeting : meetings) {
            if (meeting.start >= prevEndTime) {
                result++;
                prevEndTime = meeting.end;
            }
        }

        System.out.println(result);
    }
}
