import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int plus = 1;
            StringBuilder sb = new StringBuilder();
            if (n == -1) {
                break;
            }
            sb.append(" 1");
            for (int i = 2; i < n; i ++) {
                if (n%i == 0) {
                    plus += i;
                    sb.append(" + "+i);
                }
            }
            if (plus == n) {
                System.out.println(n+" ="+sb);
            } else {
                System.out.println(n+" is NOT perfect.");
            }
        }

    }
}