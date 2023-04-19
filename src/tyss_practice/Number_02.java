package tyss_practice;

import java.util.Scanner;

public class Number_02 {

	public static void main(String[] args) {
//		Fibonacci_series();
//		check_for_prime();
//		prime_number_till_given_integer();
		find_prime_num_from_array();
	}
	
	public static void Fibonacci_series() {
		//1 1 2 3 5 8 13 21 34
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a limit for Fibonacci Series");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		System.err.print("Fibonacci_series_till_given_number ---> [ ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		while (b<n) {
			int c = a+b;
			a=b;
			b=c;
			if (c<n) {
				System.out.print(c+" ");
			}
		}
		System.err.println("]");
		s.close();
	}
	
	public static void check_for_prime() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number to check for Prime");
		int n = s.nextInt();
		//number should be devided by 1 or itself
		boolean flag =false;
		for (int i = 2; i <= n/2; i++) {
			if (n%i==0) {
				System.err.println("Given number is Not a Prime number");
				flag=true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Given Number "+n+" is a prime number");
		}
		s.close();
	}
	
	public static void prime_number_till_given_integer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Limit to Print Prime number");
		int n = s.nextInt();
		int a=1;
		boolean flag = false;
		System.err.print("Prime Number from 1 to 100 --->[ ");
		while (a<n) {
			for (int i = 2; i <= a/2; i++) {
				if (a%i==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				System.out.print(a+" ");
			}
			a++;
			flag=false;
		}
		System.err.println("]");
		s.close();
	}
	
	public static void find_prime_num_from_array() {
		int [] arr = {1,3,2,4,5,9,7};
		boolean flag=false;
		System.err.print("Prime numbers in given array ---> [ ");
		for (int i : arr) {
			for (int j = 2; j <= i/2; j++) {
				if (i%j==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				System.out.print(i+" ");
			}
			flag=false;
		}
		System.err.println("]");
	}
}
