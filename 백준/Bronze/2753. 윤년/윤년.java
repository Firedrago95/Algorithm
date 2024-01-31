import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
        
        if ((m%4==0 && m%100!=00)|| m%400==0) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
	}
}