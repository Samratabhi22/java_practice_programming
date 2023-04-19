package javaPractice;

import java.util.Scanner;

public class NumberSeriesPgm1 {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int i = 2;
		int count=0;
		while (i<=n/2) {
			if (n%i==0) {
				count++;
			}
			i++;
		}
		if (count==0) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}

}
}
