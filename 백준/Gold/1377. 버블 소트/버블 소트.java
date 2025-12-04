import java.util.*;
import java.io.*;

class Point implements Comparable<Point>{
    int num;
    int idx;

    public Point(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Point o) {
        return this.num - o.num;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Point[] points = new Point[n];
        for (int i = 0; i < points.length; i++) {
            int num = Integer.parseInt(br.readLine());
            points[i] = new Point(num, i);
        }

       Arrays.sort(points);

        int max = 0;
        for (int i = 0; i < points.length; i++) {
            max = Math.max(max, points[i].idx - i);
        }

        System.out.println(max + 1);
    }
}
