import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int i=1; i<=m; i++) {
            int b = sc.nextInt();
            String c = sc.next();

            for (int j=0; j<c.length(); j++) {
                for (int k=0; k<b; k++) {
                    System.out.print(c.charAt(j));
                }
            }
            System.out.println();
        }
    }
}