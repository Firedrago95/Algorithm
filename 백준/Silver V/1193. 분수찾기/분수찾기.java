import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = 0;
        int count = 1;
        int result = 0;
        int plus = 0;
        while (num > prev) {
            result = count + prev;
            if (result >= num) {
                break;
            } else {
                count++;
                prev = result;
            }
        }
        plus = count + 1;
        if (plus % 2 == 0) {
            System.out.println((plus-(num-prev))+"/"+(num-prev));
        } else {
            System.out.println((num-prev)+"/"+(plus-(num-prev)));
        }
    }
}