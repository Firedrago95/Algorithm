import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while (true) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           if (a + b + c == 0) {
               break;
           }
           if (Math.max(Math.max(a,b),c) >= a+b+c - Math.max(Math.max(a,b),c)) {
               System.out.println("Invalid");
           } else {
               if (a != b && b != c && c!= a) {
                   System.out.println("Scalene");
               } else {
                   if (a == b && b == c) {
                       System.out.println("Equilateral");
                   } else {
                       System.out.println("Isosceles");
                   }
               }
           }

       }
    }
}