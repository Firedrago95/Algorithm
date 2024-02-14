import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = 1;
        int count = 1;
        int result = 0;
        while (num > prev) {
            result = prev + (6 * count);
            if (result > num) {
                count++;
                break;
            } else {
                count++;
                prev = result;
            }
        }
        System.out.println(count);
    }
}