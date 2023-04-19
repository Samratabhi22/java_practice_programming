package tyss_practice;

import java.util.Scanner;

public class Number_01 {

	public static void main(String[] args) {
		factorial();
	}
	
	public static void factorial() {
		System.err.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact=fact*i;
		}
		System.out.print("factorial of given number ---> ");
		System.err.print(fact);
		s.close();
	}
	
	
}
