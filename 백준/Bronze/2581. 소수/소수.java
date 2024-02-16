import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int plus = 0;
        int first = 0;
        for (int i = m; i <= n; i++) {
            boolean isSosu = true;
            if (i == 1) {
                isSosu = false;
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                plus +=i;
                if (first == 0) {
                    first = i;
                }
            }
        }
        if (first == 0) {
            System.out.println(-1);
        } else {
            System.out.println(plus);
            System.out.println(first);
        }
    }
}