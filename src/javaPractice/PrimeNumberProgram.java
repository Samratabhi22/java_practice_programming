package javaPractice;

import java.util.Scanner;

public class PrimeNumberProgram {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter number to check");
	int n = s.nextInt();
	int sum = 0;
	int temp = n;
	while (temp>0) {
		int rem = temp%10;
		int i=1;
		int prod=1;
		while (i<rem) {
			prod=prod*i;
			i++;
		}
		sum=sum+prod;
		temp=temp/10;
	}
	if (sum==n) {
		System.out.println(n+ " is a strong number.");
	}else {
		System.out.println(n+ " is not strong number");
	}
}
}
