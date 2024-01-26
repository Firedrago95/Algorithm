import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();
        char[] cNumbers = numbers.toCharArray();
        int sum = 0;
        for (int i=0; i< cNumbers.length; i++) {
            sum += cNumbers[i] - '0';
        }
        System.out.println(sum);
    }
}