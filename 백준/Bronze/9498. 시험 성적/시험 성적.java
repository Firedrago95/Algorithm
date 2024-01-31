import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); 
        if (m >= 90) {
            System.out.print("A");
        } else if (m >= 80) {
            System.out.print("B");
        } else if (m >= 70) {
            System.out.print("C");
        } else if (m >= 60){
            System.out.print("D");
        } else {
            System.out.print("F");
        }
	}
}