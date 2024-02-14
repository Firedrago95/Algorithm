import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int money = sc.nextInt();
            int quarter = 0;
            int dime = 0 ;
            int nickel = 0;
            int penny = 0;
            while (money >= 25) {
                money -= 25;
                quarter++;
            }
            while (money >= 10) {
                money -= 10;
                dime++;
            }
            while (money >= 5) {
                money -= 5;
                nickel++;
            }
            penny = money;
            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
    }
}