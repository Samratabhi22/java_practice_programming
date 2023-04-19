package javaPractice;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.err.println("Enter a number to check for its type");
		int n= s.nextInt();
		int tempDigit=n;
		int sum=0;
		int tempCubes=n;
		//sum of cubes of its digit == given num
		int digit=0;
		while (tempDigit>0) {
			digit++;
			tempDigit/=10;
		}
		
		while (tempCubes>0) {
			int reminder=tempCubes%10;
			int cube=1;
			int i=1;
			while (i<=digit) {
				cube*=reminder;
				i++;
			}
			sum+=cube;
			tempCubes/=10;
		}
		if (sum==n) {
			System.out.println("The given Nuber "+n+" is armstrong number");
		}else {
			System.err.println("The given Nuber "+n+" is not armstrong number");
		}
		s.close();
	}
}
