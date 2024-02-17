import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int xMin = 100000;
        int xMax = -100000;
        int yMin = 100000;
        int yMax = -100000;
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (xMin > x) {
                xMin = x;
            }
            if (xMax < x) {
                xMax = x;
            }
            if (yMax < y) {
                yMax = y;
            }
            if (yMin > y) {
                yMin = y;
            }
        }
        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}