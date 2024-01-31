import java.util.*;
class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt(); 
        
        System.out.println(m*(n%10));
        System.out.println(m*((n/10)%10));
        System.out.println(m*((n/100)%10));
        System.out.println(m*n);
    }
}