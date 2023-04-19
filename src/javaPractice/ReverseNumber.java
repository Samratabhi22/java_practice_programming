package javaPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		//int n=s.nextInt();

		int n = 15;
		int rev = 0;
//		while(n>0) {
//			int rem = n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
		String s = String.valueOf(n);
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder s2 = s1.reverse();
		rev = Integer.parseInt(s2.toString());
		System.out.println(rev);
	}
}
