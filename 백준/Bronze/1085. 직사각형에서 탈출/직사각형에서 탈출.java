import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (x <= w / 2 && y <= h / 2) {
            System.out.println(Math.min(x,y));
        } else if (x >= w / 2 && y <= h / 2){
            System.out.println(Math.min((w - x),y));
        } else if (x <= w / 2 && y >= h / 2) {
            System.out.println(Math.min(x, (h - y)));
        } else {
            System.out.println(Math.min((w - x), (h - y)));
        }
    }
}